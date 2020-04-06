package io.autorune.script.api.widget

import io.autorune.osrs.api.widget.Widget
import java.awt.Point
import java.awt.Rectangle

data class WidgetItem(val id: Int, val quantity: Int, val index: Int, val bounds: Rectangle, val widget: Widget)
{

	fun getCanvasLocation() : Point?
	{
		return Point(bounds.getX().toInt(), bounds.getY().toInt())
	}

}