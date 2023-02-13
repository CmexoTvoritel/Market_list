package com.example.listofmarket.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.listofmarket.data.ShopListRepImpl
import com.example.listofmarket.domain.DeleteElemShopList
import com.example.listofmarket.domain.EditElemShopList
import com.example.listofmarket.domain.GetShopList
import com.example.listofmarket.domain.ShopItem

class MainViewModel : ViewModel() {
    private val repository = ShopListRepImpl

    private val getShopList = GetShopList(repository)
    private val deleteElemShopList = DeleteElemShopList(repository)
    private val editElemShopList = EditElemShopList(repository)

    val shopList = getShopList.getShopList()

    fun deleteElemShop(shopItem: ShopItem) {
        deleteElemShopList.deleteElemShop(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editElemShopList.editElemShop(newItem)
    }
}