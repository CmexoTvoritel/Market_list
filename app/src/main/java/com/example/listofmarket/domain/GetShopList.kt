package com.example.listofmarket.domain

class GetShopList(private val shopListRep: ShopListRep) {
    fun getShopList(): List<ShopItem> {
        return shopListRep.getShopList()
    }
}