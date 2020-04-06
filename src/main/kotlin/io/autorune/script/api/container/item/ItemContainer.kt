package io.autorune.script.api.container.item

import io.autorune.script.api.client

enum class ItemContainer(val containerId: Int)
{

	/**
	 * Reward from fishing trawler
	 */
	FISHING_TRAWLER_REWARD(0),
	/**
	 * Standard player inventory.
	 */
	INVENTORY(93),
	/**
	 * Equipment inventory.
	 */
	EQUIPMENT(94),
	/**
	 * Bank inventory.
	 */
	BANK(95),
	/**
	 * A puzzle box inventory.
	 */
	PUZZLE_BOX(140),
	/**
	 * Barrows reward chest inventory.
	 */
	BARROWS_REWARD(141),
	/**
	 * Monkey madness puzzle box inventory.
	 */
	MONKEY_MADNESS_PUZZLE_BOX(221),
	/**
	 * Looting Bag inventory
	 */
	LOOTING_BAG(516),
	/**
	 * Kingdom Of Miscellania reward inventory.
	 */
	KINGDOM_OF_MISCELLANIA(390),
	/**
	 * Chambers of Xeric chest inventory.
	 */
	CHAMBERS_OF_XERIC_CHEST(581),
	/**
	 * Theater of Blood reward chest inventory (Raids 2)
	 */
	THEATRE_OF_BLOOD_CHEST(612),

	/**
	 * Seed vault located inside the Farming Guild
	 */
	SEED_VAULT(626);

	companion object
	{

		suspend fun getOsrsItemContainer(container: ItemContainer) : io.autorune.osrs.api.container.ItemContainer
		{
			val itemContainers = client().itemContainers
			val id = container.containerId.toLong()
			return itemContainers.fetch(id) as io.autorune.osrs.api.container.ItemContainer
		}

		suspend fun getContainerItems(container : ItemContainer) : Array<Item>
		{
			val osrsContainer = getOsrsItemContainer(container)
			val itemIds : IntArray = osrsContainer.itemIds
			val stackSizes : IntArray = osrsContainer.itemQuantities
			val items = emptyArray<Item>()
			for(i in itemIds.indices)
			{
				val item = Item(itemIds[i], stackSizes[i])
				items[i] = item
			}
			return items
		}

	}

}