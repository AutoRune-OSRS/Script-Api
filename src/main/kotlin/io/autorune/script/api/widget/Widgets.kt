package io.autorune.script.api.widget

import io.autorune.osrs.api.widget.Widget
import io.autorune.script.api.client
import java.awt.Rectangle
import java.util.ArrayList

/**
 * An object to get or manipulate a specific or group of [Widget]'s.
 */
object Widgets
{

	/**
	 * Returns whether or not the specified parent [Widget] is open based on its id.
	 * @param parent - The parent [root] id.
	 * @return If the parent is open.
	 */
	suspend fun isOpen(parent: Int) : Boolean
	{
		val client = client()
		val widget = client.getWidget(client.rootWidget, parent)
		return isOpen(widget)
	}

	/**
	 * Returns whether or not the specified parent [Widget] is open based on its group and child id.
	 * @param parent - Group [root] id.
	 * @param component - child id.
	 * @return If the [Widget] is open.
	 */
	suspend fun isOpen(parent: Int, component: Int) : Boolean
	{
		val widget = client().getWidget(parent, component) ?: return false
		return isOpen(client().getWidget(parent, component))
	}

	/**
	 * Returns whether or not the specified [Widget] is open based on a predefined [WidgetInfo].
	 * @param widgetInfo - The predefined [WidgetInfo].
	 * @return If the [Widget] is open.
	 */
	suspend fun isOpen(widgetInfo : WidgetInfo) : Boolean
	{
		val widget = client().getWidget(widgetInfo.groupId, widgetInfo.childId) ?: return false
		return isOpen(widget)
	}

	/**
	 * Returns if the specified [Widget] is open.
	 * @param widget - The [Widget].
	 * @return If the [Widget] is visible.
	 */
	fun isOpen(widget: Widget) : Boolean
	{
		return widget.isVisible
	}

	/**
	 * Returns the [Widget] based on a predefined [WidgetInfo].
	 * @param widgetInfo - The predefined [WidgetInfo].
	 * @return The [Widget].
	 */
	suspend fun get(widgetInfo : WidgetInfo) : Widget?
	{
		return client().getWidget(widgetInfo.groupId, widgetInfo.childId)
	}

	suspend fun getWidgetItem(widget: Widget, index: Int) : WidgetItem
	{
		val itemIds : IntArray = widget.itemIds
		val itemQuantities : IntArray = widget.itemQuantities
		val columns : Int = widget.width // the number of item slot columns is stored here
		val itemPaddingX : Int = widget.paddingX
		val itemPaddingY : Int = widget.paddingY
		val itemId = itemIds[index]
		val itemQuantity = itemQuantities[index]
		val row = index / columns
		val col = index % columns
		val itemX : Int = widget.renderX + ((32 + itemPaddingX) * col)
		val itemY : Int = widget.renderY + ((32 + itemPaddingY) * row)
		val bounds = Rectangle(itemX, itemY, 32, 32)

		return WidgetItem(itemId - 1, itemQuantity, index, bounds, widget)
	}

	suspend fun getWidgetItems(widget: Widget) : MutableList<WidgetItem>?
	{
		val itemIds = widget.itemIds ?: return null
		val items : MutableList<WidgetItem> = ArrayList(itemIds.size)
		for(i in itemIds.indices)
		{
			if(itemIds[i] <= 0)
			{
				continue
			}
			val item : WidgetItem? = getWidgetItem(widget, i)
			if(item != null)
			{
				items.add(item)
			}
		}
		return items
	}

}