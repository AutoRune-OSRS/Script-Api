package io.autorune.script.api.container.banking

import io.autorune.script.api.container.item.Item

/**
 * Creates a new [BankItem].
 * @param id - The item's id.
 * @param quantity - The amount of the item.
 * @param placeHolder - If this item is a placeholder or not.
 */
class BankItem(id: Int, quantity: Int, var placeHolder: Boolean) : Item(id, quantity)
{

	/**
	 * Creates a readable syntax for this [BankItem].
	 */
//	override fun toString() : String
//	{
//		val definition = client().fetchItemDefinition(id)
//		return "BankItem(id: $id, name: ${definition.name}, quantity: $quantity, placeHolder: $placeHolder)"
//	}

}