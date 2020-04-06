package io.autorune.script.api.widget

/**
 * Utility class mapping widget IDs to global constants.
 *
 *
 * The constants defined directly under the [WidgetID] class are
 * Widget group IDs. All child IDs are defined in sub-classes relating
 * to their group.
 *
 *
 * For a more direct group-child widget mapping, use the
 * [WidgetInfo] enum class.
 */
object WidgetID
{
	const val FAIRY_RING_PANEL_GROUP_ID = 381
	const val FAIRY_RING_GROUP_ID = 398
	const val LOGOUT_PANEL_ID = 182
	const val BANK_GROUP_ID = 12
	const val BANK_INVENTORY_GROUP_ID = 15
	const val BANK_PIN_GROUP_ID = 213
	const val GRAND_EXCHANGE_INVENTORY_GROUP_ID = 467
	const val GRAND_EXCHANGE_GROUP_ID = 465
	const val DEPOSIT_BOX_GROUP_ID = 192
	const val INVENTORY_GROUP_ID = 149
	const val PLAYER_TRADE_CONFIRM_GROUP_ID = 334
	const val PLAYER_TRADE_SCREEN_GROUP_ID = 335
	const val PLAYER_TRADE_INVENTORY_GROUP_ID = 336
	const val FRIENDS_LIST_GROUP_ID = 429
	const val IGNORE_LIST_GROUP_ID = 432
	const val RAIDING_PARTY_GROUP_ID = 500
	const val EQUIPMENT_GROUP_ID = 387
	const val EQUIPMENT_INVENTORY_GROUP_ID = 85
	const val EMOTES_GROUP_ID = 216
	const val RUNE_POUCH_GROUP_ID = 190
	const val ACHIEVEMENT_DIARY_GROUP_ID = 259
	const val PEST_CONTROL_BOAT_GROUP_ID = 407
	const val PEST_CONTROL_GROUP_ID = 408
	const val PEST_CONTROL_EXCHANGE_WINDOW_GROUP_ID = 243
	const val DIALOG_MINIGAME_GROUP_ID = 229
	const val CLAN_CHAT_GROUP_ID = 7
	const val MINIMAP_GROUP_ID = 160
	const val LOGIN_CLICK_TO_PLAY_GROUP_ID = 378
	const val CLUE_SCROLL_GROUP_ID = 203
	const val FIXED_VIEWPORT_GROUP_ID = 548
	const val RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID = 161
	const val RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID = 164
	const val PRAYER_GROUP_ID = 541
	const val QUICK_PRAYERS_GROUP_ID = 77
	const val SHOP_GROUP_ID = 300
	const val SHOP_INVENTORY_GROUP_ID = 301
	const val SMITHING_GROUP_ID = 312
	const val GUIDE_PRICES_GROUP_ID = 464
	const val GUIDE_PRICES_INVENTORY_GROUP_ID = 238
	const val COMBAT_GROUP_ID = 593
	const val DIALOG_NPC_GROUP_ID = 231
	const val SLAYER_REWARDS_GROUP_ID = 426
	const val PRIVATE_CHAT = 163
	const val CHATBOX_GROUP_ID = 162
	const val WORLD_MAP_MENU_GROUP_ID = 160
	const val VOLCANIC_MINE_GROUP_ID = 611
	const val BA_ATTACKER_GROUP_ID = 485
	const val BA_COLLECTOR_GROUP_ID = 486
	const val BA_DEFENDER_GROUP_ID = 487
	const val BA_HEALER_GROUP_ID = 488
	const val BA_REWARD_GROUP_ID = 497
	const val BA_HORN_OF_GLORY = 484
	const val LEVEL_UP_GROUP_ID = 233
	const val DIALOG_SPRITE_GROUP_ID = 193
	const val QUEST_COMPLETED_GROUP_ID = 277
	const val CLUE_SCROLL_REWARD_GROUP_ID = 73
	const val BARROWS_REWARD_GROUP_ID = 155
	const val RAIDS_GROUP_ID = 513
	const val MOTHERLODE_MINE_GROUP_ID = 382
	const val MOTHERLODE_MINE_FULL_INVENTORY_GROUP_ID = 229
	const val EXPERIENCE_DROP_GROUP_ID = 122
	const val PUZZLE_BOX_GROUP_ID = 306
	const val LIGHT_BOX_GROUP_ID = 322
	const val NIGHTMARE_ZONE_GROUP_ID = 202
	const val BLAST_FURNACE_GROUP_ID = 474
	const val WORLD_MAP_GROUP_ID = 595
	const val PYRAMID_PLUNDER_GROUP_ID = 428
	const val CHAMBERS_OF_XERIC_REWARD_GROUP_ID = 539
	const val THEATRE_OF_BLOOD_REWARD_GROUP_ID = 23
	const val EXPERIENCE_TRACKER_GROUP_ID = 122
	const val TITHE_FARM_GROUP_ID = 241
	const val KINGDOM_GROUP_ID = 392
	const val BARROWS_GROUP_ID = 24
	const val BLAST_MINE_GROUP_ID = 598
	const val MTA_ALCHEMY_GROUP_ID = 194
	const val MTA_ENCHANTMENT_GROUP_ID = 195
	const val MTA_GRAVEYARD_GROUP_ID = 196
	const val MTA_TELEKINETIC_GROUP_ID = 198
	const val CORP_DAMAGE = 13
	const val DESTROY_ITEM_GROUP_ID = 584
	const val VARROCK_MUSEUM_QUIZ_GROUP_ID = 533
	const val KILL_LOGS_GROUP_ID = 549
	const val DIARY_QUEST_GROUP_ID = 119
	const val THEATRE_OF_BLOOD_GROUP_ID = 28
	const val WORLD_SWITCHER_GROUP_ID = 69
	const val DIALOG_OPTION_GROUP_ID = 219
	const val DIALOG_PLAYER_GROUP_ID = 217
	const val FOSSIL_ISLAND_OXYGENBAR_ID = 609
	const val MINIGAME_TAB_ID = 76
	const val SPELLBOOK_GROUP_ID = 218
	const val PVP_GROUP_ID = 90
	const val ACCOUNT_MANAGEMENT_GROUP_ID = 109
	const val PERFORMERS_FOR_THE_THEATRE_GROUPS_GROUP_ID = 364
	const val PERFORMERS_FOR_THE_THEATRE_PLAYERS_GROUP_ID = 50
	const val FISHING_TRAWLER_GROUP_ID = 366
	const val FISHING_TRAWLER_REWARD_GROUP_ID = 367
	const val ZEAH_MESS_HALL_GROUP_ID = 235
	const val KOUREND_FAVOUR_GROUP_ID = 246
	const val LOOTING_BAG_GROUP_ID = 81
	const val SKOTIZO_GROUP_ID = 308
	const val ENTERING_HOUSE_GROUP_ID = 71
	const val FULLSCREEN_MAP_GROUP_ID = 165
	const val QUESTLIST_GROUP_ID = 399
	const val SKILLS_GROUP_ID = 320
	const val DIALOG_SPRITE2_ID = 11
	const val EQUIPMENT_PAGE_GROUP_ID = 84
	const val QUESTTAB_GROUP_ID = 629
	const val MUSIC_GROUP_ID = 239
	const val MUSICTAB_GROUP_ID = 239
	const val BARROWS_PUZZLE_GROUP_ID = 25
	const val KEPT_ON_DEATH_GROUP_ID = 4
	const val GUIDE_PRICE_GROUP_ID = 464
	const val SEED_VAULT_INVENTORY_GROUP_ID = 630
	const val BEGINNER_CLUE_MAP_CHAMPIONS_GUILD = 346
	const val BEGINNER_CLUE_MAP_VARROCK_EAST_MINE = 347
	const val BEGINNER_CLUE_MAP_DRAYNOR = 348
	const val BEGINNER_CLUE_MAP_NORTH_OF_FALADOR = 351
	const val BEGINNER_CLUE_MAP_WIZARDS_TOWER = 356
	const val SEED_BOX_GROUP_ID = 128
	const val ITEMS_KEPT_ON_DEATH_GROUP_ID = 4
	const val SEED_VAULT_GROUP_ID = 631
	const val EXPLORERS_RING_ALCH_GROUP_ID = 483
	const val LMS_GROUP_ID = 333
	const val LMS_INGAME_GROUP_ID = 328
	const val JEWELLERY_BOX_GROUP_ID = 590
	const val OPTIONS_GROUP_ID = 261
	const val THEATRE_OF_BLOOD_PARTY_GROUP_ID = 28
	const val GWD_KC_GROUP_ID = 406

	internal object WorldMap
	{
		const val MAPVIEW = 6
		const val OVERVIEW_MAP = 9
		const val SEARCH = 24
		const val SURFACE_SELECTOR = 32
		const val TOOLTIP = 38
		const val OPTION = 43
	}

	internal object SlayerRewards
	{
		const val TOP_BAR = 12
	}

	internal object DialogNPC
	{
		const val HEAD_MODEL = 1
		const val NAME = 2
		const val CONTINUE = 3
		const val TEXT = 4
	}

	internal object LogoutPanel
	{
		const val WORLD_SWITCHER_BUTTON = 3
		const val LOGOUT_BUTTON = 6
	}

	internal object PestControlBoat
	{
		const val INFO = 3
		const val NEXT_DEPARTURE = 4
		const val PLAYERS_READY = 5
		const val POINTS = 6
	}

	internal object PestControlExchangeWindow
	{
		const val ITEM_LIST = 2
		const val BOTTOM = 5
		const val POINTS = 8
		const val CONFIRM_BUTTON = 6
	}

	internal object MinigameDialog
	{
		const val TEXT = 1
		const val CONTINUE = 2
	}

	internal object PestControl
	{
		const val INFO = 3
		const val TIME = 6
		const val ACTIVITY_BAR = 12
		const val ACTIVITY_PROGRESS = 14
		const val PURPLE_SHIELD = 15
		const val BLUE_SHIELD = 16
		const val YELLOW_SHIELD = 17
		const val RED_SHIELD = 18
		const val PURPLE_ICON = 19
		const val BLUE_ICON = 20
		const val YELLOW_ICON = 21
		const val RED_ICON = 22
		const val PURPLE_HEALTH = 23
		const val BLUE_HEALTH = 24
		const val YELLOW_HEALTH = 25
		const val RED_HEALTH = 26
	}

	internal object FriendList
	{
		const val TITLE = 3
	}

	internal object IgnoreList
	{
		const val TITLE = 3
	}

	internal object ClanChat
	{
		const val TITLE = 1
		const val NAME = 4
		const val OWNER = 6
		const val LIST = 16
	}

	internal object Bank
	{
		const val BANK_CONTAINER = 1
		const val INVENTORY_ITEM_CONTAINER = 3
		const val BANK_TITLE_BAR = 4
		const val CONTENT_CONTAINER = 10
		const val TAB_CONTAINER = 11
		const val ITEM_CONTAINER = 13
		const val WITHDRAW_X = 34
		const val SEARCH_BUTTON_BACKGROUND = 40
		const val DEPOSIT_INVENTORY = 42
		const val DEPOSIT_EQUIPMENT = 44
		const val INCINERATOR = 46
		const val INCINERATOR_CONFIRM = 47
	}

	internal object GrandExchange
	{
		const val WINDOW_CONTAINER = 0
		const val WINDOW_BORDERS = 2
		const val HISTORY_BUTTON = 3
		const val BACK_BUTTON = 4
		const val OFFER_CONTAINER = 24
		const val OFFER_DESCRIPTION = 25
		const val OFFER_PRICE = 26
		const val OFFER_CONFIRM_BUTTON = 27
	}

	internal object GrandExchangeInventory
	{
		const val INVENTORY_ITEM_CONTAINER = 0
	}

	internal object DepositBox
	{
		const val INVENTORY_ITEM_CONTAINER = 2
	}

	internal object Shop
	{
		const val ITEMS_CONTAINER = 2
		const val INVENTORY_ITEM_CONTAINER = 0
	}

	internal object Smithing
	{
		const val INVENTORY_ITEM_CONTAINER = 0
	}

	internal object GuidePrices
	{
		const val ITEM_CONTAINER = 2
		const val INVENTORY_ITEM_CONTAINER = 0
	}

	internal object Equipment
	{
		const val HELMET = 6
		const val CAPE = 7
		const val AMULET = 8
		const val WEAPON = 9
		const val BODY = 10
		const val SHIELD = 11
		const val LEGS = 12
		const val GLOVES = 13
		const val BOOTS = 14
		const val RING = 15
		const val AMMO = 16
		const val INVENTORY_ITEM_CONTAINER = 0
	}

	internal object Emotes
	{
		const val EMOTE_WINDOW = 0
		const val EMOTE_CONTAINER = 1
		const val EMOTE_SCROLLBAR = 2
	}

	internal object Cluescroll
	{
		const val CLUE_TEXT = 2
		const val CLUE_SCROLL_ITEM_CONTAINER = 3
	}

	internal object Minimap
	{
		const val XP_ORB = 1
		const val HEALTH_ORB = 2
		const val PRAYER_ORB = 12
		const val QUICK_PRAYER_ORB = 14 // Has the "Quick-prayers" name
		const val RUN_ORB = 20
		const val TOGGLE_RUN_ORB = 22 // Has the "Toggle run" name
		const val RUN_ORB_TEXT = 23
		const val SPEC_ORB = 28
		const val WORLDMAP_ORB = 41
	}

	internal object LoginClickToPlayScreen
	{
		const val MESSAGE_OF_THE_DAY = 7
	}

	internal object Viewport
	{
		const val MINIMAP_RESIZABLE_WIDGET = 18
		const val MINIMAP_RESIZABLE_CLICKBOX = 19
		const val MINIMAP_RESIZABLE_DRAW_AREA = 26
		const val MINIMAP_RESIZABLE_DECORATIONS = 28
		const val MINIMAP_RESIZABLE_ORB_HOLDER = 29
		const val MINIMAP_RESIZABLE_LOGOUT_BUTTON = 31
		const val FIXED_VIEWPORT = 17
		const val RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX = 13
		const val RESIZABLE_VIEWPORT_BOTTOM_LINE = 13
	}

	internal object FixedViewport
	{
		const val MINIMAP = 3
		const val MINIMAP_DRAW_AREA = 8
		const val MULTICOMBAT_INDICATOR = 21
		const val BANK_PIN = 22
		const val CLAN_CHAT_TAB = 32
		const val FRIEND_MANAGER = 34
		const val ACCOUNT_MANAGEMENT = 33
		const val LOGOUT_TAB = 35
		const val OPTIONS_TAB = 36
		const val EMOTES_TAB = 37
		const val MUSIC_TAB = 38
		const val CLAN_CHAT_ICON = 39
		const val FRIENDS_ICON = 41
		const val ACCOUNT_MANAGEMENT_ICON = 40
		const val LOGOUT_ICON = 42
		const val OPTIONS_ICON = 43
		const val EMOTES_ICON = 44
		const val MUSIC_ICON = 45
		const val COMBAT_TAB = 49
		const val STATS_TAB = 50
		const val QUESTS_TAB = 51
		const val INVENTORY_TAB = 52
		const val EQUIPMENT_TAB = 53
		const val PRAYER_TAB = 54
		const val MAGIC_TAB = 55
		const val COMBAT_ICON = 56
		const val STATS_ICON = 57
		const val QUESTS_ICON = 58
		const val INVENTORY_ICON = 59
		const val EQUIPMENT_ICON = 60
		const val PRAYER_ICON = 61
		const val MAGIC_ICON = 62
		const val ROOT_INTERFACE_CONTAINER = 63
		const val BANK_CONTAINER = 65
		const val INTERFACE_CONTAINER = 66
		const val INVENTORY_CONTAINER = 70
	}

	internal object ResizableViewport
	{
		const val ITEMS_KEPT_ON_DEATH = 13
		const val BANK_PIN = 13
		const val MULTICOMBAT_INDICATOR = 17
		const val CLAN_CHAT_TAB = 36
		const val FRIENDS_TAB = 38
		const val ACCOUNT_MANAGEMENT_TAB = 37
		const val LOGOUT_TAB = 39
		const val OPTIONS_TAB = 40
		const val EMOTES_TAB = 41
		const val MUSIC_TAB = 42
		const val CLAN_CHAT_ICON = 43
		const val FRIENDS_ICON = 45
		const val ACCOUNT_MANAGEMENT_ICON = 44
		const val LOGOUT_ICON = 46
		const val OPTIONS_ICON = 47
		const val EMOTES_ICON = 48
		const val MUSIC_ICON = 49
		const val COMBAT_TAB = 52
		const val STATS_TAB = 53
		const val QUESTS_TAB = 54
		const val INVENTORY_TAB = 55
		const val EQUIPMENT_TAB = 56
		const val PRAYER_TAB = 57
		const val MAGIC_TAB = 58
		const val COMBAT_ICON = 59
		const val STATS_ICON = 60
		const val QUESTS_ICON = 61
		const val INVENTORY_ICON = 62
		const val EQUIPMENT_ICON = 63
		const val PRAYER_ICON = 64
		const val MAGIC_ICON = 65
		const val INTERFACE_CONTAINER = 66
		const val INVENTORY_CONTAINER = 72
	}

	internal object ResizableViewportBottomLine
	{
		const val BANK_PIN = 13
		const val LOGOUT_BUTTON_OVERLAY = 31
		const val CMB_TAB = 51
		const val CMB_ICON = 58
		const val SKILLS_TAB = 52
		const val SKILLS_ICON = 59
		const val QUESTS_TAB = 53
		const val QUESTS_ICON = 60
		const val INVENTORY_TAB = 54
		const val INVENTORY_ICON = 61
		const val EQUIP_TAB = 55
		const val EQUIP_ICON = 62
		const val PRAYER_TAB = 56
		const val PRAYER_ICON = 63
		const val SPELL_TAB = 57
		const val SPELL_ICON = 53
		const val CLAN_TAB = 36
		const val CLAN_ICON = 42
		const val IGNORE_TAB = 37
		const val IGNORE_ICON = 42
		const val FRIEND_TAB = 38
		const val FRIEND_ICON = 44
		const val SETTINGS_TAB = 39
		const val SETTINGS_ICON = 45
		const val EMOTE_TAB = 40
		const val EMOTE_ICON = 46
		const val MUSIC_TAB = 41
		const val MUSIC_ICON = 47
		const val MAGIC_ICON = 64
		const val INVENTORY_CONTAINER = 72
	}

	internal object Chatbox
	{
		const val PARENT = 0
		const val BUTTONS = 1
		const val REPORT_TEXT = 36
		const val FRAME = 37
		const val TRANSPARENT_BACKGROUND = 38
		const val CONTAINER = 40
		const val TITLE = 44
		const val FULL_INPUT = 45
		const val MESSAGES = 55
		const val TRANSPARENT_BACKGROUND_LINES = 56
		const val INPUT = 57
	}

	internal object Prayer
	{
		const val THICK_SKIN = 5
		const val BURST_OF_STRENGTH = 6
		const val CLARITY_OF_THOUGHT = 7
		const val SHARP_EYE = 23
		const val MYSTIC_WILL = 24
		const val ROCK_SKIN = 8
		const val SUPERHUMAN_STRENGTH = 9
		const val IMPROVED_REFLEXES = 10
		const val RAPID_RESTORE = 11
		const val RAPID_HEAL = 12
		const val PROTECT_ITEM = 13
		const val HAWK_EYE = 25
		const val MYSTIC_LORE = 26
		const val STEEL_SKIN = 14
		const val ULTIMATE_STRENGTH = 15
		const val INCREDIBLE_REFLEXES = 16
		const val PROTECT_FROM_MAGIC = 17
		const val PROTECT_FROM_MISSILES = 18
		const val PROTECT_FROM_MELEE = 19
		const val EAGLE_EYE = 27
		const val MYSTIC_MIGHT = 28
		const val RETRIBUTION = 20
		const val REDEMPTION = 21
		const val SMITE = 22
		const val PRESERVE = 33
		const val CHIVALRY = 29
		const val PIETY = 30
		const val RIGOUR = 31
		const val AUGURY = 32
	}

	object QuickPrayer
	{
		const val PRAYERS = 4
		const val THICK_SKIN_CHILD_ID = 0
		const val BURST_OF_STRENGTH_CHILD_ID = 1
		const val CLARITY_OF_THOUGHT_CHILD_ID = 2
		const val SHARP_EYE_CHILD_ID = 18
		const val MYSTIC_WILL_CHILD_ID = 19
		const val ROCK_SKIN_CHILD_ID = 3
		const val SUPERHUMAN_STRENGTH_CHILD_ID = 4
		const val IMPROVED_REFLEXES_CHILD_ID = 5
		const val RAPID_RESTORE_CHILD_ID = 6
		const val RAPID_HEAL_CHILD_ID = 7
		const val PROTECT_ITEM_CHILD_ID = 8
		const val HAWK_EYE_CHILD_ID = 20
		const val MYSTIC_LORE_CHILD_ID = 21
		const val STEEL_SKIN_CHILD_ID = 9
		const val ULTIMATE_STRENGTH_CHILD_ID = 10
		const val INCREDIBLE_REFLEXES_CHILD_ID = 11
		const val PROTECT_FROM_MAGIC_CHILD_ID = 12
		const val PROTECT_FROM_MISSILES_CHILD_ID = 13
		const val PROTECT_FROM_MELEE_CHILD_ID = 14
		const val EAGLE_EYE_CHILD_ID = 22
		const val MYSTIC_MIGHT_CHILD_ID = 23
		const val RETRIBUTION_CHILD_ID = 15
		const val REDEMPTION_CHILD_ID = 16
		const val SMITE_CHILD_ID = 17
		const val PRESERVE_CHILD_ID = 28
		const val CHIVALRY_CHILD_ID = 25
		const val PIETY_CHILD_ID = 26
		const val RIGOUR_CHILD_ID = 24
		const val AUGURY_CHILD_ID = 27
	}

	internal object Combat
	{
		const val WEAPON_NAME = 1
		const val LEVEL = 3
		const val STYLE_ONE = 4
		const val STYLE_TWO = 8
		const val STYLE_THREE = 12
		const val STYLE_FOUR = 16
		const val SPELLS = 20
		const val DEFENSIVE_SPELL_BOX = 21
		const val DEFENSIVE_SPELL_ICON = 23
		const val DEFENSIVE_SPELL_SHIELD = 24
		const val DEFENSIVE_SPELL_TEXT = 25
		const val SPELL_BOX = 26
		const val SPELL_ICON = 28
		const val SPELL_TEXT = 29
		const val AUTO_RETALIATE = 30
		const val SPECIAL_ATTACK_BAR = 34
		const val TOOLTIP = 41
	}

	internal object VolcanicMine
	{
		const val GENERAL_INFOBOX_GROUP_ID = 4
		const val TIME_LEFT = 8
		const val POINTS = 10
		const val STABILITY = 12
		const val PLAYER_COUNT = 14
		const val VENTS_INFOBOX_GROUP_ID = 15
		const val VENT_A_PERCENTAGE = 19
		const val VENT_B_PERCENTAGE = 20
		const val VENT_C_PERCENTAGE = 21
		const val VENT_A_STATUS = 23
		const val VENT_B_STATUS = 24
		const val VENT_C_STATUS = 25
	}

	internal object BarbarianAssault
	{
		const val GAME_WIDGET = 3
		const val CURRENT_WAVE_WIDGET = 4
		const val CURRENT_WAVE = 5
		const val LISTEN_WIDGET = 6
		const val LISTEN = 7
		const val TO_CALL_WIDGET = 8
		const val TO_CALL = 9
		const val ROLE_SPRITE = 10
		const val ROLE = 11
		const val REWARD_TEXT = 57

		internal object ATK
		{
			const val LISTEN_TOP = 7
			const val LISTEN_BOTTOM = 8
			const val TO_CALL_WIDGET = 9
			const val TO_CALL = 10
			const val ROLE_SPRITE = 11
			const val ROLE = 12
		}

		internal object HLR
		{
			const val TEAMMATE1 = 18
			const val TEAMMATE2 = 22
			const val TEAMMATE3 = 26
			const val TEAMMATE4 = 30
		}

		internal object HORN_GLORY
		{
			const val ATTACKER = 5
			const val DEFENDER = 6
			const val COLLECTOR = 7
			const val HEALER = 8
		}

		internal object REWARD_VALUES
		{
			const val RUNNERS_PASSED = 14
			const val HITPOINTS_REPLENISHED = 19
			const val WRONG_POISON_PACKS_USED = 20
			const val EGGS_COLLECTED = 21
			const val FAILED_ATTACKER_ATTACKS = 22
			const val RUNNERS_PASSED_POINTS = 24
			const val RANGERS_KILLED = 25
			const val FIGHTERS_KILLED = 26
			const val HEALERS_KILLED = 27
			const val RUNNERS_KILLED = 28
			const val HITPOINTS_REPLENISHED_POINTS = 29
			const val WRONG_POISON_PACKS_USED_POINTS = 30
			const val EGGS_COLLECTED_POINTS = 31
			const val FAILED_ATTACKER_ATTACKS_POINTS = 32
			const val BASE_POINTS = 33
			const val HONOUR_POINTS_REWARD = 49
		}
	}

	internal object GWD
	{
		const val CONTAINER = 7
	}

	internal object LevelUp
	{
		const val SKILL = 1
		const val LEVEL = 2
	}

	internal object QuestCompleted
	{
		const val NAME_TEXT = 2
	}

	internal object Raids
	{
		const val POINTS_INFOBOX = 6
	}

	internal object TheatreOfBlood
	{
		const val RAIDING_PARTY = 9
		const val ORB_BOX = 10
		const val BOSS_HEALTH_BAR = 35
	}

	internal object TheatreOfBloodParty
	{
		const val CONTAINER = 10
	}

	internal object ExperienceDrop
	{
		const val DROP_1 = 15
		const val DROP_2 = 16
		const val DROP_3 = 17
		const val DROP_4 = 18
		const val DROP_5 = 19
		const val DROP_6 = 20
		const val DROP_7 = 21
	}

	internal object PuzzleBox
	{
		const val VISIBLE_BOX = 4
	}

	internal object LightBox
	{
		const val LIGHT_BOX = 1
		const val LIGHT_BOX_WINDOW = 2
		const val LIGHT_BULB_CONTAINER = 3
		const val BUTTON_A = 8
		const val BUTTON_B = 9
		const val BUTTON_C = 10
		const val BUTTON_D = 11
		const val BUTTON_E = 12
		const val BUTTON_F = 13
		const val BUTTON_G = 14
		const val BUTTON_H = 15
	}

	internal object DialogSprite
	{
		const val SPRITE = 1
		const val TEXT = 2
	}

	internal object ExperienceTracker
	{
		const val WIDGET = 3
		const val BOTTOM_BAR = 15
	}

	internal object FairyRingPanel
	{
		const val HEADER = 2
		const val LIST = 7
		const val FAVORITES = 8
		const val SEPARATOR = 9
		const val SCROLLBAR = 152
	}

	internal object FairyRing
	{
		const val LEFT_ORB_CLOCKWISE = 19
		const val LEFT_ORB_COUNTER_CLOCKWISE = 20
		const val MIDDLE_ORB_CLOCKWISE = 21
		const val MIDDLE_ORB_COUNTER_CLOCKWISE = 22
		const val RIGHT_ORB_CLOCKWISE = 23
		const val RIGHT_ORB_COUNTER_CLOCKWISE = 24
		const val TELEPORT_BUTTON = 26
	}

	internal object FairyRingCode
	{
		const val FAIRY_QUEEN_HIDEOUT = 139
	}

	internal object Barrows
	{
		const val BARROWS_BROTHERS = 9
		const val BARROWS_POTENTIAL = 10
		const val BARROWS_REWARD_INVENTORY = 3
	}

	internal object Diary
	{
		const val DIARY_TITLE = 2
		const val DIARY_TEXT = 3
	}

	internal object DestroyItem
	{
		const val DESTROY_ITEM_NAME = 6
		const val DESTROY_ITEM_YES = 1
		const val DESTROY_ITEM_NO = 3
	}

	internal object EquipmentWidgetIdentifiers
	{
		const val EQUIP_YOUR_CHARACTER = 3
		const val STAB_ATTACK_BONUS = 23
		const val SLASH_ATTACK_BONUS = 24
		const val CRUSH_ATTACK_BONUS = 25
		const val MAGIC_ATTACK_BONUS = 26
		const val RANGED_ATTACK_BONUS = 27
		const val STAB_DEFENCE_BONUS = 29
		const val SLASH_DEFENCE_BONUS = 30
		const val CRUSH_DEFENCE_BONUS = 31
		const val MAGIC_DEFENCE_BONUS = 32
		const val RANGED_DEFENCE_BONUS = 33
		const val MELEE_STRENGTH = 35
		const val RANGED_STRENGTH = 36
		const val MAGIC_DAMAGE = 37
		const val PRAYER_BONUS = 38
		const val UNDEAD_DAMAGE_BONUS = 40
		const val SLAYER_DAMAGE_BONUS = 41
		const val WEIGHT = 43
	}

	internal object VarrockMuseum
	{
		const val VARROCK_MUSEUM_QUESTION = 28
		const val VARROCK_MUSEUM_FIRST_ANSWER = 29
		const val VARROCK_MUSEUM_SECOND_ANSWER = 30
		const val VARROCK_MUSEUM_THIRD_ANSWER = 31
	}

	internal object KillLog
	{
		const val TITLE = 3
		const val MONSTER = 13
		const val KILLS = 14
		const val STREAK = 15
	}

	internal object WorldSwitcher
	{
		const val WORLD_LIST = 16
	}

	internal object FossilOxygen
	{
		const val FOSSIL_ISLAND_OXYGEN_BAR = 4
	}

	internal object Minigames
	{
		const val TELEPORT_BUTTON = 26
	}

	internal object SpellBook
	{
		const val FILTERED_SPELLS_BOUNDS = 3
		const val TOOLTIP = 189
		// NORMAL SPELLS
		const val LUMBRIDGE_HOME_TELEPORT = 5
		const val WIND_STRIKE = 6
		const val CONFUSE = 7
		const val ENCHANT_CROSSBOW_BOLT = 8
		const val WATER_STRIKE = 9
		const val LVL_1_ENCHANT = 10
		const val EARTH_STRIKE = 11
		const val WEAKEN = 12
		const val FIRE_STRIKE = 13
		const val BONES_TO_BANANAS = 14
		const val WIND_BOLT = 15
		const val CURSE = 16
		const val BIND = 17
		const val LOW_LEVEL_ALCHEMY = 18
		const val WATER_BOLT = 19
		const val VARROCK_TELEPORT = 20
		const val LVL_2_ENCHANT = 21
		const val EARTH_BOLT = 22
		const val LUMBRIDGE_TELEPORT = 23
		const val TELEKINETIC_GRAB = 24
		const val FIRE_BOLT = 25
		const val FALADOR_TELEPORT = 26
		const val CRUMBLE_UNDEAD = 27
		const val TELEPORT_TO_HOUSE = 28
		const val WIND_BLAST = 29
		const val SUPERHEAT_ITEM = 30
		const val CAMELOT_TELEPORT = 31
		const val WATER_BLAST = 32
		const val LVL_3_ENCHANT = 33
		const val IBAN_BLAST = 34
		const val SNARE = 35
		const val MAGIC_DART = 36
		const val ARDOUGNE_TELEPORT = 37
		const val EARTH_BLAST = 38
		const val HIGH_LEVEL_ALCHEMY = 39
		const val CHARGE_WATER_ORB = 40
		const val LVL_4_ENCHANT = 41
		const val WATCHTOWER_TELEPORT = 42
		const val FIRE_BLAST = 43
		const val CHARGE_EARTH_ORB = 44
		const val BONES_TO_PEACHES = 45
		const val SARADOMIN_STRIKE = 46
		const val CLAWS_OF_GUTHIX = 47
		const val FLAMES_OF_ZAMORAK = 48
		const val TROLLHEIM_TELEPORT = 49
		const val WIND_WAVE = 50
		const val CHARGE_FIRE_ORB = 51
		const val TELEPORT_TO_APE_ATOLL = 52
		const val WATER_WAVE = 53
		const val CHARGE_AIR_ORB = 54
		const val VULNERABILITY = 55
		const val LVL_5_ENCHANT = 56
		const val TELEPORT_TO_KOUREND = 57
		const val EARTH_WAVE = 58
		const val ENFEEBLE = 59
		const val TELEOTHER_LUMBRIDGE = 60
		const val FIRE_WAVE = 61
		const val ENTANGLE = 62
		const val STUN = 63
		const val CHARGE = 64
		const val WIND_SURGE = 65
		const val TELEOTHER_FALADOR = 66
		const val WATER_SURGE = 67
		const val TELE_BLOCK = 68
		const val BOUNTY_TARGET_TELEPORT = 69
		const val LVL_6_ENCHANT = 70
		const val TELEOTHER_CAMELOT = 71
		const val EARTH_SURGE = 72
		const val LVL_7_ENCHANT = 73
		const val FIRE_SURGE = 74
		// ANCIENT SPELLS
		const val ICE_RUSH = 75
		const val ICE_BLITZ = 76
		const val ICE_BURST = 77
		const val ICE_BARRAGE = 78
		const val BLOOD_RUSH = 79
		const val BLOOD_BLITZ = 80
		const val BLOOD_BURST = 81
		const val BLOOD_BARRAGE = 82
		const val SMOKE_RUSH = 83
		const val SMOKE_BLITZ = 84
		const val SMOKE_BURST = 85
		const val SMOKE_BARRAGE = 86
		const val SHADOW_RUSH = 87
		const val SHADOW_BLITZ = 88
		const val SHADOW_BURST = 89
		const val SHADOW_BARRAGE = 90
		const val PADDEWWA_TELEPORT = 91
		const val SENNTISTEN_TELEPORT = 92
		const val KHARYRLL_TELEPORT = 93
		const val LASSAR_TELEPORT = 94
		const val DAREEYAK_TELEPORT = 95
		const val CARRALLANGER_TELEPORT = 96
		const val ANNAKARL_TELEPORT = 97
		const val GHORROCK_TELEPORT = 98
		const val EDGEVILLE_HOME_TELEPORT = 99
		// LUNAR SPELLS
		const val LUNAR_HOME_TELEPORT = 100
		const val BAKE_PIE = 101
		const val CURE_PLANT = 102
		const val MONSTER_EXAMINE = 103
		const val NPC_CONTACT = 104
		const val CURE_OTHER = 105
		const val HUMIDIFY = 106
		const val MOONCLAN_TELEPORT = 107
		const val TELE_GROUP_MOONCLAN = 108
		const val CURE_ME = 109
		const val HUNTER_KIT = 110
		const val WATERBIRTH_TELEPORT = 111
		const val TELE_GROUP_WATERBIRTH = 112
		const val CURE_GROUP = 113
		const val STAT_SPY = 114
		const val BARBARIAN_TELEPORT = 115
		const val TELE_GROUP_BARBARIAN = 116
		const val SUPERGLASS_MAKE = 117
		const val TAN_LEATHER = 118
		const val KHAZARD_TELEPORT = 119
		const val TELE_GROUP_KHAZARD = 120
		const val DREAM = 121
		const val STRING_JEWELLERY = 122
		const val STAT_RESTORE_POT_SHARE = 123
		const val MAGIC_IMBUE = 124
		const val FERTILE_SOIL = 125
		const val BOOST_POTION_SHARE = 126
		const val FISHING_GUILD_TELEPORT = 127
		const val TELE_GROUP_FISHING_GUILD = 128
		const val PLANK_MAKE = 129
		const val CATHERBY_TELEPORT = 130
		const val TELE_GROUP_CATHERBY = 131
		const val RECHARGE_DRAGONSTONE = 132
		const val ICE_PLATEAU_TELEPORT = 133
		const val TELE_GROUP_ICE_PLATEAU = 134
		const val ENERGY_TRANSFER = 135
		const val HEAL_OTHER = 136
		const val VENGEANCE_OTHER = 137
		const val VENGEANCE = 138
		const val HEAL_GROUP = 139
		const val SPELLBOOK_SWAP = 140
		const val GEOMANCY = 141
		const val SPIN_FLAX = 142
		const val OURANIA_TELEPORT = 143
		// ARCEUUS SPELLS
		const val ARCEUUS_HOME_TELEPORT = 144
		const val BATTLEFRONT_TELEPORT = 179
	}

	internal object StandardSpellBook
	{
		const val LUMBRIDGE_HOME_TELEPORT = 5
		const val KOUREND_HOME_TELEPORT = 4
	}

	internal object AncientSpellBook
	{
		const val EDGEVILLE_HOME_TELEPORT = 99
	}

	internal object LunarSpellBook
	{
		const val LUNAR_HOME_TELEPORT = 100
	}

	internal object ArceuusSpellBook
	{
		const val ARCEUUS_HOME_TELEPORT = 144
	}

	internal object Pvp
	{
		const val FOG_OVERLAY = 1
		const val PVP_WIDGET_CONTAINER = 54 // OUTDATED?
		const val SKULL = 56 // OUTDATED?
		const val ATTACK_RANGE = 59 // OUTDATED?
		const val BOUNTY_HUNTER_INFO = 6
		const val KILLDEATH_RATIO = 34
		const val SKULL_CONTAINER = 54
		const val SAFE_ZONE = 56
		const val WILDERNESS_LEVEL = 59 // this can also be the Deadman Mode "Protection" text
	}

	internal object KourendFavour
	{
		const val KOUREND_FAVOUR_OVERLAY = 1
	}

	internal object Zeah
	{
		const val MESS_HALL_COOKING_DISPLAY = 3
	}

	internal object LootingBag
	{
		const val LOOTING_BAG_INVENTORY = 5
	}

	internal object Skotizo
	{
		const val CONTAINER = 3
	}

	internal object FullScreenMap
	{
		const val ROOT = 26
	}

	internal object QuestList
	{
		const val BOX = 0
		const val SCROLLBAR = 3
		const val CONTAINER = 5
		const val FREE_CONTAINER = 6
		const val MEMBERS_CONTAINER = 7
		const val MINIQUEST_CONTAINER = 8
	}

	internal object DialogSprite2
	{
		const val SPRITE1 = 1
		const val TEXT = 2
		const val SPRITE2 = 3
		const val CONTINUE = 4
	}

	internal object QuestTab
	{
		const val CONTAINER = 0
		const val QUEST_TAB = 3
	}

	internal object Music
	{
		const val CONTAINER = 0
		const val LIST = 3
		const val SCROLLBAR = 4
	}

	internal object Barrows_Puzzle
	{
		const val PARENT = 0
		const val CONTAINER = 1
		const val TOP_ROW_PUZZLE = 2
		const val SEQUENCE_1 = 3
		const val SEQUENCE_1_TEXT = 4
		const val SEQUENCE_2 = 5
		const val SEQUENCE_2_TEXT = 6
		const val SEQUENCE_3 = 7
		const val SEQUENCE_3_TEXT = 8
		const val SEQUENCE_4 = 9
		const val SEQUENCE_4_TEXT = 10
		const val NEXT_SHAPE_TEXT = 11
		const val ANSWER1_CONTAINER = 12
		const val ANSWER1 = 13
		const val ANSWER2_CONTAINER = 14
		const val ANSWER2 = 15
		const val ANSWER3_CONTAINER = 16
		const val ANSWER3 = 17
	}

	internal object KeptOnDeath
	{
		const val KEPT_ITEMS_CONTAINER = 18
		const val KEPT_ITEMS_TEXT = 17
		const val LOST_ITEMS_TEXT = 20
		const val LOST_ITEMS_CONTAINER = 21
		const val LOST_ITEMS_VALUE = 23
		const val INFORMATION_CONTAINER = 29
		const val MAX_ITEMS_KEPT_ON_DEATH = 30
		const val SAFE_ZONE_CONTAINER = 31
		const val CUSTOM_TEXT_CONTAINER = 33
	}

	object TradeScreen
	{
		const val FIRST_TRADING_WITH = 31
		const val SECOND_TRADING_WITH = 30
		const val SECOND_MY_OFFER = 23
		const val SECOND_THEIR_OFFER = 24
		const val SECOND_ACCEPT_FUNC = 13
		const val SECOND_ACCEPT_TEXT = 25
	}

	object DuelConfig
	{
		const val CONFIG_GROUP_IP = 482
		const val TITLE = 35
		const val OPPONENT_ATT = 9
		const val OPPONENT_STR = 13
		const val OPPONENT_DEF = 17
		const val OPPONENT_HP = 21
	}

	object DuelResult
	{
		const val RESULT_GROUP_ID = 372
		const val TITLE = 16
		const val TOTAL_STAKED = 32
		const val TOTAL_TAX = 39
		const val WINNINGS = 40
	}

	// Also used for many other interfaces!
	internal object BankPin
	{
		const val TOP_LEFT_TEXT = 2
		const val FIRST_ENTERED = 3
		const val SECOND_ENTERED = 4
		const val THIRD_ENTERED = 5
		const val FOURTH_ENTERED = 6
		const val INSTRUCTION_TEXT = 10
		const val EXIT_BUTTON = 13
		const val FORGOT_BUTTON = 15
		const val BUTTON_1 = 16
		const val BUTTON_2 = 18
		const val BUTTON_3 = 20
		const val BUTTON_4 = 22
		const val BUTTON_5 = 24
		const val BUTTON_6 = 26
		const val BUTTON_7 = 28
		const val BUTTON_8 = 30
		const val BUTTON_9 = 32
		const val BUTTON_10 = 34
	}

	internal object SeedVault
	{
		const val TITLE_CONTAINER = 2
		const val ITEM_CONTAINER = 15
		const val ITEM_TEXT = 16
	}

	internal object ExplorersRing
	{
		const val INVENTORY = 7
	}

	internal object Lms
	{
		const val INFO = 2
	}

	internal object LmsKDA
	{
		const val INFO = 4
	}

	internal object JewelBox
	{
		const val DUEL_RING = 2
		const val GAME_NECK = 3
		const val COMB_BRAC = 4
		const val SKIL_NECK = 5
		const val RING_OFGP = 6
		const val AMUL_GLOR = 7 // yes
	}

	internal object Options
	{
		const val MUSIC_SLIDER = 44
		const val SOUND_EFFECT_SLIDER = 50
		const val AREA_SOUND_SLIDER = 56
	}

	internal object AchievementDiary
	{
		const val CONTAINER = 2
	}

	internal object Skills
	{
		const val CONTAINER = 0
	}
}