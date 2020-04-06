package io.autorune.script.api.container.banking

import io.autorune.script.api.widget.WidgetInfo
import io.autorune.script.api.client
import io.autorune.script.api.container.*
import io.autorune.script.api.container.item.ItemContainer
import io.autorune.script.api.vars.VarBits
import io.autorune.script.api.widget.Widgets

/**
 * Banking interpretation and manipulation.
 */
object Banking
{

	private val containerItems = mutableMapOf<Int, BankTab>()

	private var container = BankContainer(emptyList())

	private val TAB_VAR_BITS : List<VarBits> = listOf(
			VarBits.BANK_TAB_ONE_COUNT,
			VarBits.BANK_TAB_TWO_COUNT,
			VarBits.BANK_TAB_THREE_COUNT,
			VarBits.BANK_TAB_FOUR_COUNT,
			VarBits.BANK_TAB_FIVE_COUNT,
			VarBits.BANK_TAB_SIX_COUNT,
			VarBits.BANK_TAB_SEVEN_COUNT,
			VarBits.BANK_TAB_EIGHT_COUNT,
			VarBits.BANK_TAB_NINE_COUNT
	)

	/**
	 * Returns if the bank is open or not.
	 */
	suspend fun isOpen() : Boolean
	{
		return Widgets.isOpen(WidgetInfo.BANK_CONTENT_CONTAINER)
	}

	/**
	 * Returns a list of [InvItem]'s for the [BankContainer].
	 */
	suspend fun getBankItems() : List<InvItem>
	{
		if(!isOpen()) return emptyList()
		val items = ItemContainer.getContainerItems(ItemContainer.BANK)
		return items.map { InvItem(this.container, it.id, it.quantity) }.filter { it.id != -1 }.also {
			it.forEach { item -> if(isPlaceHolder(item.itemId)) item.applyDesc(InvDesc.BANK_PLACE_HOLDER) }
		}
	}

	/**
	 * Returns the count of items for a specific tab index.
	 */
	suspend fun getTabItemCount(tabIndex: Int): Int
	{
		return if (tabIndex == 0)
		{
			getBankItems().size - TAB_VAR_BITS.sumBy { varBits -> VarBits.fetchVarBit(varBits) }
		} else {
			VarBits.fetchVarBit(TAB_VAR_BITS[tabIndex - 1])
		}
	}

	/**
	 * Returns the currently opened [BankTab] or default '0' of none is open.
	 */
	suspend fun getCurrentTab() : BankTab
	{
		val items = getBankItems()
		val currentTabIndex = VarBits.fetchVarBit(VarBits.CURRENT_BANK_TAB)
		val itemCount = getTabItemCount(currentTabIndex)
		var bankTab = containerItems[currentTabIndex]

		val startItemId =
				if (currentTabIndex == 0) items.size - getTabItemCount(0)
				else (1 until currentTabIndex).toList().sumBy { index -> getTabItemCount(index) }

		val tabItems = if (itemCount == 0) emptyList() else items.toTypedArray().copyOfRange(startItemId, startItemId + itemCount).toList()

		if(bankTab != null)
			if(tabItems.containsAll(bankTab.items) && tabItems.size == bankTab.items.size)
				return bankTab

		bankTab = BankTab(currentTabIndex, tabItems.toMutableList())

		containerItems.putIfAbsent(bankTab.id, bankTab)

		return bankTab
	}

	/**
	 * Returns whether or not an item is a placeholder.
	 */
	suspend fun isPlaceHolder(itemId: Int) : Boolean
	{
		return client().fetchItemDefinition(itemId).placeHolderTemplate != -1
	}

	/**
	 * Returns if item placeholders are enabled.
	 */
	suspend fun isPlaceHoldersEnabled() : Boolean
	{
		return VarBits.fetchVarBit(VarBits.PLACE_HOLDERS_ENABLED) == 1
	}

	/**
	 * Returns the withdrawing quantity.
	 */
	suspend fun withdrawingQuantity() : Int
	{
		val client = client()
		return when(VarBits.fetchVarBit(VarBits.BANK_WITHDRAW_QUANTITY))
		{
			0 -> 1
			1 -> 5
			2 -> 10
			3 -> Widgets.get(WidgetInfo.BANK_WITHDRAW_X)?.actions?.find { it.contains("Default") }?.split(": ")?.get(1)?.replace(",", "")?.toInt() ?: 0
			4 -> Int.MAX_VALUE
			else -> 0
		}
	}

	/**
	 * Returns whether or not withdraw as note is enabled or disabled.
	 */
	suspend fun isWithdrawingAsNote() : Boolean
	{
		return VarBits.fetchVarBit(VarBits.BANK_WITHDRAW_NOTE) != 0
	}

	/**
	 * Returns whether or not withdraw as item is enabled or disabled.
	 */
	suspend fun isWithdrawingAsItem() : Boolean
	{
		return !isWithdrawingAsNote()
	}

	/**
	 * Returns whether or not insert item is enabled.
	 */
	suspend fun isInsertingItem() : Boolean
	{
		return VarBits.fetchVarBit(VarBits.BANK_INSERT_ITEM) != 0
	}

	/**
	 * Returns whether or not swap item is enabled.
	 */
	suspend fun isSwappingItem() : Boolean
	{
		return !isInsertingItem()
	}

	/**
	 * Returns whether or not the incinerator is active.
	 */
	suspend fun isIncineratorActive() : Boolean
	{
		return VarBits.fetchVarBit(VarBits.BANK_INCINERATOR_ACTIVE) != 0
	}

	/**
	 * Returns whether or not deposit worn items is enabled.
	 */
	suspend fun isDepositWornItemsActive() : Boolean
	{
		return VarBits.fetchVarBit(VarBits.BANK_DEPOSIT_WORN_ITEMS_ACTIVE) == 0
	}

	/**
	 * Returns whether or not deposit inventory is enabled.
	 */
	suspend fun isDepositInventoryActive() : Boolean
	{
		return VarBits.fetchVarBit(VarBits.BANK_DEPOSIT_INVENTORY_ACTIVE) == 0
	}

	/**
	 * Structures a readable format of the bank instance.
	 */
//	override fun toString() : String
//	{
//		return "[isOpen: ${isOpen()} \n " +
//		       "\t isPlaceHolderEnabled: ${isPlaceHoldersEnabled()} \n" +
//		       "\t withdrawingQuantity: ${withdrawingQuantity()} \n" +
//		       "\t isWithdrawingAsNote: ${isWithdrawingAsNote()} \n" +
//		       "\t isWithdrawingAsItem: ${isWithdrawingAsItem()} \n" +
//		       "\t isInsertingItem: ${isInsertingItem()} \n" +
//		       "\t isIncineratorActive: ${isIncineratorActive()} \n" +
//		       "\t isDepositWornItemsActive: ${isDepositWornItemsActive()} \n" +
//		       "\t isDepositInventoryActive: ${isDepositInventoryActive()} \n" +
//		       "\t isSwappingItem: ${isSwappingItem()} \n" +
//		       "\t currentTab: ${getCurrentTab()}"
//	}

}