package com.example.recycleview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    lateinit var dataList: ArrayList<model>
    lateinit var adapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        dataList = ArrayList()

        dataList.addAll(DataProvider.getData())

//        binding.rv.layoutManager=LinearLayoutManager(this)
        binding.rv.layoutManager=GridLayoutManager(this,2)
        binding.rv.adapter=CustomAdapter(dataList,this@MainActivity)

    }
}