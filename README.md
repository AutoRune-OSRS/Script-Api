# AutoRune Script API

A comprehensive scripting API that exposes everything needed to create OSRS automation scripts for platform users. Built as a simplification and extension of the underlying OSRS API generated from hooks and mixins, providing a clean, coroutine-based interface for game interaction.

## Technology Stack

| Category | Technology |
|----------|------------|
| Language | Kotlin 1.3.61 |
| Build System | Maven |
| Async Model | Kotlin Coroutines (suspend functions) |
| Context Management | ThreadLocal via `ApiContext` |
| Game Client | AutoRune OSRS API v1.0.20 |

## Architecture

```
Script-Api/
├── io.autorune.script.api/
│   ├── ApiContext.kt              # Coroutine context injection
│   ├── contextExt.kt              # Client access extension
│   ├── actions/                   # Action type constants
│   ├── container/                 # Inventory & banking systems
│   │   ├── inventory/
│   │   ├── banking/
│   │   └── item/
│   ├── entity/                    # Players, NPCs, skills
│   │   ├── player/
│   │   └── npc/
│   ├── interaction/               # Context menu access
│   ├── vars/                      # VarBits definitions
│   └── widget/                    # Widget system & UI
│       └── gameframe/
```

## Core Concepts

### Coroutine-Based Interaction

Scripts run as Kotlin coroutines with automatic client context injection:

```kotlin
// Access game client from any suspend function
suspend fun myScriptLogic() {
    val client = client()  // Retrieved from coroutine context
    val localPlayer = Players.getLocalPlayer()
    // ... script logic
}
```

### Context Management

- **ApiContext.kt** - Passes the game Client instance through coroutine context
- **contextExt.kt** - Extension function `client()` to retrieve current client instance
- All game queries are non-blocking suspend operations

## API Modules

### 1. Entity Management

**Players.kt** - Player access:
```kotlin
Players.getLocalPlayer()    // Current player
Players.getPlayers()        // All players in region
```

**Npcs.kt** - NPC access:
```kotlin
Npcs.getNpcs()             // All NPCs in region
Npcs.indexOf(npc)          // Get NPC index
```

**Skills.kt** - 23-skill enum with full access:
```kotlin
enum class Skills {
    ATTACK, DEFENCE, STRENGTH, HITPOINTS, RANGED, PRAYER,
    MAGIC, COOKING, WOODCUTTING, FLETCHING, FISHING, FIREMAKING,
    CRAFTING, SMITHING, MINING, HERBLORE, AGILITY, THIEVING,
    SLAYER, FARMING, RUNECRAFTING, HUNTER, CONSTRUCTION
}

Skills.ATTACK.fetchLevel()          // Base level
Skills.ATTACK.fetchBoostedLevel()   // Current level
Skills.ATTACK.fetchExperience()     // Total XP
Skills.fetchTotalLevel()            // Sum of all levels
Skills.fetchTotalExperience()       // Sum of all XP
```

### 2. Container Systems

**Inventory.kt** / **InventoryContainer.kt**:
```kotlin
Inventory.container         // Access cached inventory
// Supports descriptors for noted/placeholder items
```

**Banking System** (Banking.kt, BankContainer.kt, BankTab.kt, BankItem.kt):
```kotlin
Banking.isOpen()                    // Check bank state
Banking.getBankItems()              // All bank items
Banking.getCurrentTab()             // Active tab (0-8)
Banking.getTabItemCount(index)      // Items in specific tab
Banking.withdrawingQuantity()       // 1, 5, 10, X, All
Banking.isWithdrawingAsNote()       // Note mode check
Banking.isPlaceHolder(itemId)       // Placeholder check
```

**ItemContainer.kt** - 15+ container types:
| Container | Description |
|-----------|-------------|
| INVENTORY | Main inventory |
| EQUIPMENT | Worn items |
| BANK | Bank storage |
| LOOTING_BAG | Looting bag contents |
| BARROWS_CHEST | Barrows rewards |
| COX_RAID_CHEST | Chambers of Xeric |
| TOB_RAID_CHEST | Theatre of Blood |
| SEED_VAULT | Farming Guild vault |
| And more... | |

**Item Descriptors** (InvDesc.kt):
- `BANK_PLACE_HOLDER` - Placeholder items
- `INV_NOTED` - Noted items
- `HOLDS_CHARGES` - Charged items

### 3. Widget System

**Widgets.kt** - Widget access and queries:
```kotlin
Widgets.isOpen(WidgetInfo.BANK_CONTENT_CONTAINER)
Widgets.get(widgetInfo)
Widgets.getWidgetItem(widget, index)
Widgets.getWidgetItems(widget)
```

**WidgetInfo.kt** - 800+ predefined widget mappings covering all game interfaces

**WidgetID.kt** - 100+ constant widget group IDs:
```kotlin
WidgetID.INVENTORY_GROUP_ID
WidgetID.BANK_GROUP_ID
WidgetID.EQUIPMENT_GROUP_ID
// ... and many more
```

**WidgetType.kt** - 13 widget type constants:
- Layer, Inventory, Rectangle, Text, Graphic
- Model, Viewport, Minimap, and more

**GameFrameTabs.kt** - 13 game frame tabs:
```kotlin
enum class GameFrameTabs {
    COMBAT, STATS, QUEST, INVENTORY, EQUIPMENT,
    PRAYER, MAGIC, CLAN_CHAT, FRIENDS, ACCOUNT,
    LOGOUT, OPTIONS, EMOTES, MUSIC
}

val currentTab = GameFrameTabs.getOpenTab()
tab.interact()                      // Switch to tab
tab.getTabWidgetForViewport()       // Get widget
tab.getTabInterface()               // Get interface
```

**Viewport.kt** - Fixed/resizable detection:
```kotlin
Viewport.getViewport()  // Current viewport mode
```

### 4. Game Variables (VarBits)

**VarBits.kt** - 717 lines of predefined VarBits:

**Prayer States (30+ prayers):**
```kotlin
VarBits.QUICK_PRAYER_ENABLED
VarBits.PRAYER_PROTECT_FROM_MELEE
VarBits.PRAYER_PIETY
VarBits.PRAYER_RIGOUR
VarBits.PRAYER_AUGURY
// ... all prayers
```

**Achievement Diaries (4 tiers x 10+ regions):**
```kotlin
VarBits.DIARY_VARROCK_EASY
VarBits.DIARY_VARROCK_MEDIUM
VarBits.DIARY_VARROCK_HARD
VarBits.DIARY_VARROCK_ELITE
// ... all diary regions
```

**Banking Settings:**
```kotlin
VarBits.CURRENT_BANK_TAB
VarBits.BANK_WITHDRAW_QUANTITY
VarBits.BANK_TOGGLE_INSERT
VarBits.INCINERATOR
```

**Usage:**
```kotlin
VarBits.fetchVarBit(VarBits.CURRENT_BANK_TAB)
VarBits.fetchVarBit(VarBits.BANK_WITHDRAW_QUANTITY)
```

### 5. Actions & Interactions

**ActionTypes.kt** - 60+ action type constants:

| Category | Actions |
|----------|---------|
| Objects | 5 actions + examine |
| NPCs | 5 actions + examine |
| Players | 8 action slots |
| Ground Items | 5 actions |
| Inventory | 5 actions + use |
| Widgets | Various interactions |
| Walking | Movement actions |
| Menu | Context menu actions |

```kotlin
ActionTypes.OBJECT_FIRST_OPTION
ActionTypes.NPC_FIRST_OPTION
ActionTypes.PLAYER_FIRST_OPTION
ActionTypes.ITEM_FIRST_OPTION
ActionTypes.WALK_HERE
// ... and many more
```

**ContextMenu.kt** - Context menu detection:
```kotlin
ContextMenu.isOpen()        // Check if menu visible
ContextMenu.getBounds()     // Menu bounds rectangle
```

## Script Interaction Patterns

### Basic Entity Query
```kotlin
suspend fun findNearbyNpc(name: String): Npc? {
    return Npcs.getNpcs().find { it.name == name }
}
```

### Inventory Management
```kotlin
suspend fun checkInventory() {
    val container = Inventory.container
    val items = container.items
    // Process items...
}
```

### Banking Operations
```kotlin
suspend fun depositAll() {
    if (Banking.isOpen()) {
        val quantity = Banking.withdrawingQuantity()
        val isNoted = Banking.isWithdrawingAsNote()
        // Perform banking...
    }
}
```

### Skill Checking
```kotlin
suspend fun hasRequiredLevel(skill: Skills, level: Int): Boolean {
    return skill.fetchLevel() >= level
}
```

### Widget Interaction
```kotlin
suspend fun openTab(tab: GameFrameTabs) {
    val currentTab = GameFrameTabs.getOpenTab()
    if (currentTab != tab) {
        tab.interact()
    }
}
```

### VarBit Checking
```kotlin
suspend fun isPrayerEnabled(prayer: VarBits): Boolean {
    return VarBits.fetchVarBit(prayer) == 1
}
```

## Installation

Maven dependency:
```xml
<dependency>
    <groupId>io.autorune</groupId>
    <artifactId>script-api</artifactId>
    <version>1.0.16</version>
</dependency>
```

## Building

```bash
mvn clean install
```

## Dependencies

- `autorune-osrs-api` v1.0.20 - Generated OSRS API interfaces
- Kotlin Standard Library

## Key Design Principles

- **Non-Blocking** - All operations are suspend functions
- **Type-Safe** - Strongly typed enums and data classes
- **Comprehensive** - Covers all major game systems
- **Extensible** - Built on top of generated OSRS API
- **Context-Aware** - Automatic client injection via coroutines

## File Summary

| Files | Lines | Description |
|-------|-------|-------------|
| 27 | ~2000+ | Well-structured Kotlin source |
| 9 | - | Logical module organization |
| 800+ | - | Predefined widget mappings |
| 717 | - | VarBit definitions |
