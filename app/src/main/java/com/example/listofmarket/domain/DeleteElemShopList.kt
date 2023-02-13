package com.example.listofmarket.domain

class DeleteElemShopList(private val shopListRep: ShopListRep) {
    fun deleteElemShop(shopItem: ShopItem) {
        shopListRep.deleteElemShop(shopItem)
    }
}