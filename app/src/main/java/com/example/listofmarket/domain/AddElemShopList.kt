package com.example.listofmarket.domain

class AddElemShopList(private val shopListRep: ShopListRep) {
    fun addElemShop(shopItem: ShopItem) {
        shopListRep.addElemShop(shopItem)
    }
}