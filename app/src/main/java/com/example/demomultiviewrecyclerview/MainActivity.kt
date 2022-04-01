package com.example.demomultiviewrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demomultiviewrecyclerview.adapter.DataAdapter
import com.example.demomultiviewrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var dataAdapter:DataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val itemList = FakeData.getItem()

        dataAdapter = DataAdapter(itemList)

        binding.recView.adapter = dataAdapter
    }
}