package io.autorune.script.api.widget.gameframe.viewport

import io.autorune.osrs.api.widget.Widget
import io.autorune.script.api.client
import io.autorune.script.api.widget.*

/**
 * An object to get or manipulate the Viewport.
 */
object Viewport
{

	/**
	 * Returns if the current viewport is fixed.
	 */
	suspend fun isFixedViewport() : Boolean
	{
		return getViewportWidget()?.parentId() == WidgetID.FIXED_VIEWPORT_GROUP_ID
	}

	/**
	 * Returns if the current viewport is resizable.
	 */
	suspend fun isResizedViewport() : Boolean
	{
		return getViewportWidget()?.parentId() == WidgetID.RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID
	}

	/**
	 * Returns if the current viewport is resized with boxed tabs configuration.
	 */
	suspend fun isResizedBoxedTabsViewport() : Boolean
	{
		return getViewportWidget()?.parentId() == WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID
	}

	/**
	 * Returns the currently active viewport [Widget].
	 */
	suspend fun getViewportWidget() : Widget?
	{
		return when(client().rootWidget)
		{
			WidgetID.FIXED_VIEWPORT_GROUP_ID                    -> Widgets.get(WidgetInfo.FIXED_VIEWPORT)
			WidgetID.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX)
			else                                                -> Widgets.get(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE)
		}
	}

}