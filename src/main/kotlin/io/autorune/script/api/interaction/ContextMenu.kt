package io.autorune.script.api.interaction

import io.autorune.osrs.api.Client
import java.awt.*

/**
 * An object to control or gather data of the current context menu.
 */
class ContextMenu
{

	/**
	 * Returns whether or not the context menu is currently open.
	 */
	fun isOpen(clientInstance : Client) : Boolean
	{
		return clientInstance.contextMenuOpen
	}

	/**
	 * Returns the complete bounds of the open context menu.
	 */
	fun getCurrentContextMenuBounds(clientInstance : Client) : Rectangle?
	{
		return if(isOpen(clientInstance)) Rectangle(clientInstance.menuX, clientInstance.menuY, clientInstance.menuWidth, clientInstance.menuHeight) else null
	}

}