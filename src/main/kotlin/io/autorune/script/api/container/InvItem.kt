package io.autorune.script.api.container

import io.autorune.script.api.container.item.Item

/**
 * Creates an instance of [InvItem].
 * This instance is used for caching and manipulation.
 * @param parentContainer - The parent container of this specific item.
 * @param itemId - The item id.
 * @param amount - The amount of this item.
 * @param descList - A list of this items [InvDesc]'s.
 */
data class InvItem(var parentContainer : InvContainer, val itemId: Int, var amount: Int, val descList: MutableList<InvDesc> = mutableListOf()) : Item(itemId, amount)
{

	/**
	 * Applies an individual or list of [InvDesc]'s.
	 */
	fun applyDesc(vararg desc: InvDesc)
	{
		descList.addAll(desc)
	}

	/**
	 * Removes an individual or list of [InvDesc]'s.
	 */
	fun revokeDesc(vararg desc: InvDesc)
	{
		descList.removeAll(desc)
	}

	/**
	 * Constructs a readable format of this [InvItem].
	 */
	override fun toString() : String
	{
		return "[InvItem - itemId : $itemId amount : $amount desc : [ ${descList.toTypedArray().contentDeepToString()} ] ]"
	}

}