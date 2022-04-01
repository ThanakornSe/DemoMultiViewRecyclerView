package com.example.demomultiviewrecyclerview

import com.example.demomultiviewrecyclerview.data.DataItem

object FakeData {

    const val TYPE_HEADER = 0
    const val TYPE_ITEM = 1

    fun getItem():List<DataItem>{

        val itemList = mutableListOf<DataItem>()

        itemList.add(DataItem.Header("13.00"))
        itemList.add(DataItem.Item(1,"Shopping"))
        itemList.add(DataItem.Item(2,"Crew Meeting"))
        itemList.add(DataItem.Item(3,"Work"))
        itemList.add(DataItem.Item(4,"Phone Bill"))
        itemList.add(DataItem.Item(5,"Complete Task"))

        itemList.add(DataItem.Header("14.00"))
        itemList.add(DataItem.Item(6,"Sport"))
        itemList.add(DataItem.Item(7,"Book"))
        itemList.add(DataItem.Item(8,"Read a story"))
        itemList.add(DataItem.Item(9,"Study"))

        itemList.add(DataItem.Header("15.00"))
        itemList.add(DataItem.Item(10,"Do Homework"))
        itemList.add(DataItem.Item(11,"Clean the computer"))
        itemList.add(DataItem.Item(12,"Fix the bug"))
        itemList.add(DataItem.Item(13,"Prepare"))
        itemList.add(DataItem.Item(14,"Call bank"))

        return itemList
    }
}