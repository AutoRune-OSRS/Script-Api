package io.autorune.script.api.container.banking

import io.autorune.script.api.container.*
import io.autorune.script.api.container.item.ItemContainer

/**
 * [BankContainer] creates a cache-able container to store all items and their attributes.
 */
class BankContainer(items: List<InvItem>) : InvContainer(ItemContainer.BANK, items)
{

	/**
	 * Constructs this [BankContainer].
	 */
	override suspend fun construct()
	{
		println("Do nothing")
	}

	/**
	 * Handles a container updater, and returns if it needs any addition modifications.
	 */
	override suspend fun updateRequired() : Boolean
	{
		//todo: update item container event listener?
		return if(!Banking.isOpen()) false
		else if(items.isNotEmpty() && cachedItems.isEmpty()) true
		else cachedItems != items
	}

	/**
	 * Handles an update event for this [InvContainer].
	 */
	override fun onUpdate()
	{
		//todo verify
		this.cachedItems = this.items
	}

	/**
	 * Updates the items that are cached.
	 */
	override fun updateItems()
	{
		println("Do nothing")
	}

}