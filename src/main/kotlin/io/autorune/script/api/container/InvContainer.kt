package io.autorune.script.api.container

import io.autorune.script.api.container.item.ItemContainer

/**
 * Represents an [ItemContainer] and expands to allow a cached version without effecting the clients version.
 * With this we store a cacheable node of [ItemContainer] per [Script] instance.
 * This will allow us to call updates and any data without referencing the client every time.
 */
abstract class InvContainer(val container : ItemContainer, var items: List<InvItem> = emptyList(), var cachedItems: List<InvItem> = items)
{

	abstract suspend fun construct()

	/**
	 * Triggers an update for the desired [InvContainer].
	 * This is mainly used to populate items, or update existing states for caching reasons.
	 */
	abstract suspend fun updateRequired() : Boolean

	/**
	 * Handles an update event.
	 */
	abstract fun onUpdate()

	/**
	 * Handles a group update event.
	 */
	abstract fun updateItems()

	/**
	 * Constructs a readable format for this [InvContainer].
	 */
	override fun toString() : String
	{
		return "[ Container: $container : ${items.toTypedArray().contentDeepToString()} ]"
	}

}