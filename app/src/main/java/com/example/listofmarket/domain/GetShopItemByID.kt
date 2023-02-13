package com.example.listofmarket.domain

class GetShopItemByID(private val shopListRep: ShopListRep) {
    fun getShopItemID(shopItemId: Int): ShopItem {
        return shopListRep.getShopItemID(shopItemId)
    }
}