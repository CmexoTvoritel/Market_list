package com.example.listofmarket.data

import com.example.listofmarket.domain.ShopItem
import com.example.listofmarket.domain.ShopListRep

object ShopListRepImpl: ShopListRep {

    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementId = 0

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }

    override fun addElemShop(shopItem: ShopItem) {
        if(shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun getShopItemID(shopItemId: Int): ShopItem {
        return shopList.find{
            it.id == shopItemId
        } ?: throw java.lang.RuntimeException("Element with id $shopItemId not found")
    }

    override fun deleteElemShop(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editElemShop(shopItem: ShopItem) {
        val oldElement = getShopItemID(shopItem.id)
        shopList.remove(oldElement)
        addElemShop(shopItem)
    }
}