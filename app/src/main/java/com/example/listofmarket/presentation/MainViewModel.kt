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

    private val getShopListUseCase = GetShopList(repository)
    private val deleteElemShopListUseCase = DeleteElemShopList(repository)
    private val editElemShopListUseCase = EditElemShopList(repository)

    val shopList = MutableLiveData<List<ShopItem>>()

    fun getShopList() {
        val list = getShopListUseCase.getShopList()
        shopList.value = list
    }
}