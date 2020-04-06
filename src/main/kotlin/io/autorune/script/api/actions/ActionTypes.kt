package io.autorune.script.api.actions

object ActionTypes
{
	const val ITEM_ON_OBJECT = 1 // Using a 'Selected Item' on a SceneObject
	const val SPELL_ON_OBJECT = 2 // Using a 'Selected Spell' on a SceneObject
	//-----------------------------------
	// Note: Intractable Objects can only have 5 defined actions (Any more the op == 0)
	// Note: The 4'th defined action of an object has a abnormal op.
	// Note: All Intractable objects are examinable
	// Note: Whenever any of these actions are available, the action of EXAMINE_OBJECT is always present.
	// Selecting the n'th index of action of a SceneObject; relative to its defined action array within its definition.
	const val OBJECT_ACTION_0 = 3 // ^ Index 0
	const val OBJECT_ACTION_1 = 4 // ^ Index 1
	const val OBJECT_ACTION_2 = 5 // ^ Index 2
	const val OBJECT_ACTION_3 = 6 // ^ Index 3
	const val OBJECT_ACTION_4 = 1001 // ^ Index 4
	const val EXAMINE_OBJECT = 1002
	//-----------------------------------
	const val ITEM_ON_NPC = 7 // Using a 'Selected Item' on a NPC
	const val SPELL_ON_NPC = 8 // Using a 'Selected Spell' on a NPC
	// Note: NPCs can only have 5 defined actions.
	// Note: Whenever any of these actions are available, the action of EXAMINE_NPC is always present.
	// Note: If a the action is "Attack" the natural opcode is incremented by 2000
	// Note: All NPCs are examinable
	// Selecting the n'th index of action of a NPC; relative to its defined action array within its definition.
	const val NPC_ACTION_0 = 9 // ^ Index 0
	const val NPC_ACTION_1 = 10 // ^ Index 1
	const val NPC_ACTION_2 = 11 // ^ Index 2
	const val NPC_ACTION_3 = 12 // ^ Index 3
	const val NPC_ACTION_4 = 13 // ^ Index 4
	const val EXAMINE_NPC = 1003
	//--------------------------------------
	const val ITEM_ON_PLAYER = 14 // Using a 'Selected Item' on a Player
	const val SPELL_ON_PLAYER = 15 // Using a 'Selected Spell' on a Player
	// Note: Player actions are dynamic, meaning they can change, and are not final.
	// Note: All players share the same actions, excluding interaction with the local player.
	// Note: There can only be 8 player actions.
	// Note: Players are not examinable (Unlike all other entitys).
	// Selecting the n'th index of action of a Player; relative to the current player actions.
	const val PLAYER_ACTION_0 = 44 // ^ Index 0
	const val PLAYER_ACTION_1 = 45 // ^ Index 1
	const val PLAYER_ACTION_2 = 46 // ^ Index 2
	const val PLAYER_ACTION_3 = 47 // ^ Index 3
	const val PLAYER_ACTION_4 = 48 // ^ Index 4
	const val PLAYER_ACTION_5 = 49 // ^ Index 5
	const val PLAYER_ACTION_6 = 50 // ^ Index 6
	const val PLAYER_ACTION_7 = 51 // ^ Index 7
	//--------------------------------------
	const val ITEM_ON_GROUND_ITEM = 16
	const val SPELL_ON_GROUND_ITEM = 17
	//Note: The 2nd index action, if null, is defaulted to "Take"
	//Note: If any of the following actions are present, you can "Examine" the ground item.
	const val GROUND_ITEM_ACTION_0 = 18
	const val GROUND_ITEM_ACTION_1 = 19
	const val GROUND_ITEM_ACTION_2 = 20
	const val GROUND_ITEM_ACTION_3 = 21
	const val GROUND_ITEM_ACTION_4 = 22
	const val EXAMINE_GROUND_ITEM = 1004
	//---------------------------------------------------------------------
	const val WALK_HERE = 23
	//---------------------------------------------------------------------
	// Function-Interfaces in which have some client-side effect when pressed
	const val BUTTON_INPUT = 24 // Type 1
	const val BUTTON_SPELL = 25 // Type 2
	const val BUTTON_CLOSE = 26 // Type 3
	//--------- 27 does not exist
	const val BUTTON_VARFLIP = 28 // Type 4
	const val BUTTON_VARSET = 29 // Type 5
	const val BUTTON_DIALOG = 30 // Type 6
	//---------------------------------------------------------------------
	// Note: The following actions are ONLY available for table-type components (2)
	// Note: For all items (> 0 quantity) within the table the action "Examine" is always present,
	// if any of the following actions present.
	const val ITEM_ON_ITEM = 31 // 'Selected Item'  -> Item
	const val SPELL_ON_ITEM = 32 // 'Selected Spell' -> Item
	// Note: Item actions are not always enabled (Config Varp [30,30])
	// Note: If the 4'th action of the defined action of the corresponding
	// item within a slot is null, then it's defaulted to "Drop".
	const val ITEM_ACTION_0 = 33
	const val ITEM_ACTION_1 = 34
	const val ITEM_ACTION_2 = 35
	const val ITEM_ACTION_3 = 36
	const val ITEM_ACTION_4 = 37
	// Note: This action is only available if the owner of this
	// table has 'USABLE_ITEM' enabled. ( Config Varp[31,31] == 1 )
	const val USE_ITEM = 38
	// Note: These actions are extended by the container to all of its items,
	// meaning both item actions(if enabled) and the 'container actions'
	// are all possible actions for every item within the table.
	// Note: Container actions are always enabled/present(if any).
	// Note: Tables, such as shops , usually disable the item defined actions.
	// Making its container actions the only implemented type.
	const val TABLE_ACTION_0 = 39
	const val TABLE_ACTION_1 = 40
	const val TABLE_ACTION_2 = 41
	const val TABLE_ACTION_3 = 42
	const val TABLE_ACTION_4 = 43
	const val EXAMINE_ITEM = 1005
	//-------------------------------------------------------
	// Note: The following actions are ONLY for interfaces
	// who are 'intractable'.
	// Note: The index of action is placed into the first
	// argument of the action, and is incremented by one
	// for server-side purposes?
	// Note: Actions can be disabled, via the config of the widget:
	// action_enabled = (cfg >> 1 + action_index & 1) != 0).
	// though a action may be disabled it still enabled if the
	// widget has a actionListener (its non-null).
	// Note: WIDGET_ACTION is ONLY for actions between indexes [0, 4]
	const val WIDGET_ACTION = 57
	const val SPELL_ON_WIDGET = 58 // 'Selected Spell' -> Widget
	// Note: WIDGET_ACTION_2 is ONLY for actions between indexes [5, 9]
	const val WIDGET_ACTION_2 = 1007 //TODO look into this more...
	//-------------------------------------------------------
	const val CANCEL = 1006
}