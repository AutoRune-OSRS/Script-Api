package io.autorune.script.api.container.inventory

/**
 * Inventory interpretation and manipulation.
 */
object Inventory
{

	/**
	 * The [InventoryContainer] instance.
	 */
	val container = InventoryContainer()

	/**
	 * Constructs a readable format for this [Inventory] instance.
	 */
	override fun toString() : String
	{
		return container.toString()
	}

}