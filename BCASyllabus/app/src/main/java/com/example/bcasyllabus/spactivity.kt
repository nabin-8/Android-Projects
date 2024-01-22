package com.example.bcasyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed

class spactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spactivity)

        Handler(Looper.getMainLooper()).postDelayed(400){
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}