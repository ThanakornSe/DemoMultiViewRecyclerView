package com.example.demomultiviewrecyclerview.data

sealed class DataItem {

    data class Header(val text: String) : DataItem()

    data class Item(val id: Int, val text: String) : DataItem()
}
