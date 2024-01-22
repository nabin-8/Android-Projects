package com.example.bcatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed

class SpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sp)

        Handler(Looper.getMainLooper()).postDelayed(1500){
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}