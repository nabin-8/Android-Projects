package com.example.bcasyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //This is for nevigate main to main1 sem1

        var semm1 = findViewById<TextView>(R.id.sem1)
        semm1.setOnClickListener {
            val intent = Intent(this, sem1::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }

        //This is for nevigate main to main2 sem2

        var semm2 = findViewById<TextView>(R.id.sem2)
        semm2.setOnClickListener {
            val intent = Intent(this, sem2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }

        //This is for nevigate main to main2 sem2

        var semm3 = findViewById<TextView>(R.id.sem3)
        semm3.setOnClickListener {
            val intent = Intent(this, sem3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }

        //top bar horizental scrolling semisters 4thsemister
        var semm4= findViewById<TextView>(R.id.sem4)
        semm4.setOnClickListener {
            val intent = Intent(this, sem4::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }

        //top bar horizental scrolling semisters 5thsemister
        var semm5= findViewById<TextView>(R.id.sem5)
        semm5.setOnClickListener {
            val intent = Intent(this, sem5::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }

        //top bar horizental scrolling semisters 6thsemister
        var semm6= findViewById<TextView>(R.id.sem6)
        semm6.setOnClickListener {
            val intent = Intent(this, sem6::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }

        //top bar horizental scrolling semisters 7thsemister
        var semm7= findViewById<TextView>(R.id.sem7)
        semm7.setOnClickListener {
            val intent = Intent(this, sem7::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }

        //top bar horizental scrolling semisters 8thsemister
        var semm8= findViewById<TextView>(R.id.sem8)
        semm8.setOnClickListener {
            val intent = Intent(this, sem8::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
        }
    }
}