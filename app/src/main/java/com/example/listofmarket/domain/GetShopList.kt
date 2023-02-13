package com.example.listofmarket.domain

import androidx.lifecycle.LiveData

class GetShopList(private val shopListRep: ShopListRep) {
    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRep.getShopList()
    }
}