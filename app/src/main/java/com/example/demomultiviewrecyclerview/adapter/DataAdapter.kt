package com.example.demomultiviewrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

import androidx.recyclerview.widget.RecyclerView
import com.example.demomultiviewrecyclerview.FakeData.TYPE_HEADER
import com.example.demomultiviewrecyclerview.FakeData.TYPE_ITEM
import com.example.demomultiviewrecyclerview.adapter.DataViewHolder.*
import com.example.demomultiviewrecyclerview.data.DataItem
import com.example.demomultiviewrecyclerview.databinding.HeaderListBinding
import com.example.demomultiviewrecyclerview.databinding.ItemListBinding
import java.lang.IllegalArgumentException

class DataAdapter(
    private val item: List<DataItem>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_HEADER -> HeaderViewHolder(
                HeaderListBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            TYPE_ITEM -> ItemViewHolder(
                ItemListBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> throw IllegalArgumentException("Invalid Class")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is HeaderViewHolder -> holder.bind(item[position] as DataItem.Header)
            is ItemViewHolder -> holder.bind(item[position] as DataItem.Item)
        }
    }

    override fun getItemCount(): Int = item.size

    override fun getItemViewType(position: Int): Int {
        return when(item[position]){
            is DataItem.Header -> TYPE_HEADER
            is DataItem.Item -> TYPE_ITEM
            else -> throw IllegalArgumentException("Invalid Item")
        }
    }

}