package com.example.listofmarket.domain

class EditElemShopList(private val shopListRep: ShopListRep) {
    fun editElemShop(shopItem: ShopItem) {
        shopListRep.editElemShop(shopItem)
    }
}