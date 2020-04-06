package io.autorune.script.api.widget.gameframe.tabs

import io.autorune.osrs.api.widget.Widget
import io.autorune.script.api.widget.WidgetInfo
import io.autorune.script.api.client
import io.autorune.script.api.widget.Widgets
import io.autorune.script.api.widget.gameframe.viewport.Viewport
import java.awt.Point
import java.security.SecureRandom

/**
 * This class is a reference of each individual tab and its capabilities.
 */
enum class GameFrameTabs : ViewportWidget
{

	COMBAT_TAB
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_COMBAT_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_COMBAT_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_COMBAT_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.COMBAT)
		}

		override suspend fun getActionName() : String
		{
			return "Combat Options"
		}

	},

	STATS_TAB
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_STATS_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_STATS_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_STATS_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.SKILLS)
		}

		override suspend fun getActionName() : String
		{
			return "Skills"
		}

	},

	QUEST_TAB
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_QUESTS_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_QUESTS_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_QUESTS_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.QUEST_TAB_WINDOW)
		}

		override suspend fun getActionName() : String
		{
			return "Quest List"
		}

	},

	INVENTORY
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()   -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_INVENTORY_TAB)
				else                         -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_INVENTORY_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.INVENTORY)
		}

		override suspend fun getActionName() : String
		{
			return "Inventory"
		}

	},

	EQUIPMENT
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_EQUIPMENT_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_EQUIPMENT_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_EQUIPMENT_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.EQUIPMENT)
		}

		override suspend fun getActionName() : String
		{
			return "Worn Equipment"
		}

	},

	PRAYER
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()   -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_PRAYER_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_PRAYER_TAB)
				else                         -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_PRAYER_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.PRAYER)
		}

		override suspend fun getActionName() : String
		{
			return "Prayer"
		}

	},

	SPELL_BOOK
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_MAGIC_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_MAGIC_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_MAGIC_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.SPELL_BOOK)
		}

		override suspend fun getActionName() : String
		{
			return "Magic"
		}

	},

	CLAN_CHAT
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_CLAN_CHAT_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_CLAN_CHAT_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_CLAN_CHAT_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.CLAN_CHAT)
		}

		override suspend fun getActionName() : String
		{
			return "Clan Chat"
		}

	},

	FRIENDS_MANAGER
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_FRIEND_MANAGER_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_FRIEND_MANAGER_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_FRIEND_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.FRIENDS_LIST)
		}

		override suspend fun getActionName() : String
		{
			return "Friends List"
		}

	},

	ACCOUNT_MANAGEMENT
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_ACCOUNT_MANAGEMENT_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_ACCOUNT_MANAGEMENT_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_ACCOUNT_MANAGEMENT_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.ACCOUNT_MANAGEMENT)
		}

		override suspend fun getActionName() : String
		{
			return "Account Management"
		}

	},

	LOGOUT
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_LOGOUT_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_LOGOUT_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_LOGOUT_BUTTON)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.LOG_OUT)
		}

		override suspend fun getActionName() : String
		{
			return "Logout"
		}

	},

	OPTIONS
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_OPTIONS_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_OPTIONS_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_OPTIONS_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.OPTIONS)
		}

		override suspend fun getActionName() : String
		{
			return "Options"
		}

	},

	EMOTES
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_EMOTES_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_EMOTES_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_EMOTES_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.EMOTE_WINDOW)
		}

		override suspend fun getActionName() : String
		{
			return "Emotes"
		}

	},

	MUSIC
	{

		override suspend fun getTabWidgetForViewport() : Widget?
		{
			return when
			{
				Viewport.isFixedViewport()            -> Widgets.get(WidgetInfo.FIXED_VIEWPORT_MUSIC_TAB)
				Viewport.isResizedBoxedTabsViewport() -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_MUSIC_TAB)
				else                                  -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE_MUSIC_TAB)
			}
		}

		override suspend fun getTabInterface() : Widget?
		{
			return Widgets.get(WidgetInfo.MUSIC_WINDOW)
		}

		override suspend fun getActionName() : String
		{
			return "Music Player"
		}

	}

	;

	override suspend fun interact()
	{

		val widget = getTabWidgetForViewport() ?: return

		val bounds = widget.bounds()

		val random = SecureRandom()

		val minX = bounds.x
		val maxX = bounds.x + bounds.width

		val minY = bounds.y
		val maxY = bounds.y + bounds.height

		val randomPoint = Point(random.nextInt(maxX-minX+1)+minX, random.nextInt(maxY-minY+1)+minY)

		client().sendMenuAction(-1, widget.widgetHash, 57, 1, getActionName(), "", randomPoint.x, randomPoint.y)

	}

	companion object
	{

		private const val ACTIVE_TAB_TOP_LEFT_SPRITE_BACKGROUND_ID = 1026

		private const val ACTIVE_TAB_TOP_RIGHT_SPRITE_BACKGROUND_ID = 1027

		private const val ACTIVE_TAB_BOTTOM_LEFT_SPRITE_BACKGROUND_ID = 1028

		private const val ACTIVE_TAB_BOTTOM_RIGHT_BACKGROUND_ID = 1029

		private const val ACTIVE_TAB_SPRITE_BACKGROUND_ID = 1030

		private const val ACTIVE_TAB_BOTTOM_LINE_SPRITE_BACKGROUND_ID = 1181

		/**
		 * Returns the currently opened [GameFrameTabs].
		 */
		suspend fun getOpenTab() : GameFrameTabs?
		{
			return values().find {
				it.getTabWidgetForViewport()?.spriteId in listOf(ACTIVE_TAB_BOTTOM_RIGHT_BACKGROUND_ID, ACTIVE_TAB_TOP_LEFT_SPRITE_BACKGROUND_ID,
						ACTIVE_TAB_TOP_RIGHT_SPRITE_BACKGROUND_ID, ACTIVE_TAB_BOTTOM_LEFT_SPRITE_BACKGROUND_ID,
						ACTIVE_TAB_SPRITE_BACKGROUND_ID, ACTIVE_TAB_BOTTOM_LINE_SPRITE_BACKGROUND_ID)
			}
		}

	}

}

/**
 * This interface provides a set of instructions to construct each tab.
 */
private interface ViewportWidget
{

	/**
	 * Returns the [Widget] that is required for this specific viewport.
	 */
	suspend fun getTabWidgetForViewport() : Widget?

	/**
	 * Returns the tabs actual interface [Widget].
	 */
	suspend fun getTabInterface() : Widget?

	suspend fun getActionName() : String

	suspend fun interact()

}
