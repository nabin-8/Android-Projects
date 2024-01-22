package com.neatroots.noteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.neatroots.noteapp.databinding.ActivityTestBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.withContext
import java.math.BigInteger
import java.util.Random


class TestActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityTestBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener {

           GlobalScope.launch(newSingleThreadContext("my thread")) {
               Log.d("MyTag", "onCreate: ${Thread.currentThread().name} ")
           var name :String= networkCall()
               Log.d("MyTag", "onCreate: $name")

           }

        }


    }

    suspend fun networkCall() : String{

       delay(10000L)
        return  "Vishal"
    }
    suspend fun networkCall1() : String{

        delay(15000L)
        return  "Vishal"
    }

}