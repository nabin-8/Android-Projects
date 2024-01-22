package com.example.plantylogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //This is for nevigate main2 to main through login.

        var backarrow1 = findViewById<Button>(R.id.backarrow1)
        backarrow1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //This is for nevigate main2 to main3 through Don't have an account? Signup.

        var signupp = findViewById<TextView>(R.id.signupp)
        signupp.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}