package io.autorune.script.api.container.inventory

import io.autorune.script.api.client
import io.autorune.script.api.container.*
import io.autorune.script.api.container.item.ItemContainer

/**
 * Creates a [InventoryContainer] instance.
 */
class InventoryContainer : InvContainer(ItemContainer.INVENTORY)
{

	/**
	 * Constructs this instance and builds the items for caching.
	 */
	override suspend fun construct()
	{

		val items = ItemContainer.getContainerItems(container)

		this.items = items.map { InvItem(this, it.id, it.quantity) }.filter { it.id != -1 }.also { invItems ->
			invItems.forEach { item ->
				val itemDef = client().fetchItemDefinition(item.itemId)
				if(itemDef.noteTemplate != -1) item.applyDesc(InvDesc.INV_NOTED)
			}
		}

	}

	/**
	 * Handles an update event.
	 */
	override fun onUpdate()
	{
		println("Not done")
	}

	/**
	 * Handles an update event.
	 */
	override fun updateItems()//todo as 'event'
	{
		println("Not done")
	}

	/**
	 * Returns whether or not an [InvContainer] update is required.
	 */
	override suspend fun updateRequired() : Boolean
	{
		return false
	}

}