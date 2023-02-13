package com.example.listofmarket.domain

interface ShopListRep {

    fun getShopList(): List<ShopItem>

    fun addElemShop(shopItem: ShopItem)

    fun getShopItemID(shopItemId: Int): ShopItem

    fun deleteElemShop(shopItem: ShopItem)

    fun editElemShop(shopItem: ShopItem)
}