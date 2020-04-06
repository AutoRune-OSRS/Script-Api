package io.autorune.script.api.container.banking

import io.autorune.script.api.container.InvItem

/**
 * Creates a [BankTab] which holds a cache-able reference of items.
 * @param id - The item id.
 * @param items - The list of items for the specified [BankTab].
 */
data class BankTab(var id: Int, var items: MutableList<InvItem>)
{

	/**
	 * Constructs a readable format for this [BankTab].
	 */
	override fun toString() : String
	{
		return "[BankTab: id: $id \n" +
		       "\t items: ${items.toTypedArray().contentDeepToString()}"
	}

}