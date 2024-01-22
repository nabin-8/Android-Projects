package com.example.paintgan

import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var redbtn = findViewById<ImageButton>(R.id.redColor)
        var bluebtn = findViewById<ImageButton>(R.id.blueColor)
        var blackbtn = findViewById<ImageButton>(R.id.blackColor)
        var erasebtn = findViewById<ImageButton>(R.id.whiteColor)

        redbtn.setOnClickListener {
            Toast.makeText(this, "CLICKED",Toast.LENGTH_SHORT).show()
        }
        bluebtn.setOnClickListener {
            Toast.makeText(this, "CLICKED",Toast.LENGTH_SHORT).show()
        }
        blackbtn.setOnClickListener {
            Toast.makeText(this, "CLICKED",Toast.LENGTH_SHORT).show()
        }
        erasebtn.setOnClickListener {
            Toast.makeText(this, "CLICKED",Toast.LENGTH_SHORT).show()
        }
    }
}