package com.example.listofmarket.domain

import androidx.lifecycle.LiveData

interface ShopListRep {

    fun getShopList(): LiveData<List<ShopItem>>

    fun addElemShop(shopItem: ShopItem)

    fun getShopItemID(shopItemId: Int): ShopItem

    fun deleteElemShop(shopItem: ShopItem)

    fun editElemShop(shopItem: ShopItem)
}