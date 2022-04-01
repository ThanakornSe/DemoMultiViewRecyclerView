package com.example.demomultiviewrecyclerview.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.demomultiviewrecyclerview.data.DataItem
import com.example.demomultiviewrecyclerview.databinding.HeaderListBinding
import com.example.demomultiviewrecyclerview.databinding.ItemListBinding

sealed class DataViewHolder {

    data class ItemViewHolder(val itemBinding: ItemListBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item:DataItem.Item){
            itemBinding.txtItem.text = item.text
        }
    }

    data class HeaderViewHolder(val headerBinding:HeaderListBinding) : RecyclerView.ViewHolder(headerBinding.root) {
        fun bind(item:DataItem.Header){
            headerBinding.txtHeader.text = item.text
        }
    }
}
