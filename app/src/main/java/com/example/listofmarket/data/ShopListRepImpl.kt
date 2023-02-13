package com.example.listofmarket.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.listofmarket.domain.ShopItem
import com.example.listofmarket.domain.ShopListRep

object ShopListRepImpl: ShopListRep {

    private val shopListLD = MutableLiveData<List<ShopItem>>()
    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementId = 0

    init {
        for(i in 0 until 10) {
            val item = ShopItem("Name $i", i, true)
            addElemShop(item)
        }
    }

    override fun getShopList(): LiveData<List<ShopItem>> {
        return shopListLD
    }

    override fun addElemShop(shopItem: ShopItem) {
        if(shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
        updateList()
    }

    override fun getShopItemID(shopItemId: Int): ShopItem {
        return shopList.find{
            it.id == shopItemId
        } ?: throw java.lang.RuntimeException("Element with id $shopItemId not found")
    }

    override fun deleteElemShop(shopItem: ShopItem) {
        shopList.remove(shopItem)
        updateList()
    }

    override fun editElemShop(shopItem: ShopItem) {
        val oldElement = getShopItemID(shopItem.id)
        shopList.remove(oldElement)
        addElemShop(shopItem)
    }

    private fun updateList() {
        shopListLD.value = shopList.toList()
    }
}