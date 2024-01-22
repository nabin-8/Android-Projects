package com.example.bcasyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class sem8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem8)


        //Syallabus top bar back to main manue
        var manuback= findViewById<ImageView>(R.id.mainmanu)
        manuback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.side_inleft,R.anim.side_out_right)
        }

        //top bar horizental scrolling firstsem
        var semes= findViewById<Button>(R.id.btn_seme1)
        semes.setOnClickListener {
            val intent = Intent(this, sem1::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.side_inleft,R.anim.side_out_right)
        }

        //top bar horizental scrolling second sem
        var semes2= findViewById<Button>(R.id.btn_seme2)
        semes2.setOnClickListener {
            val intent = Intent(this, sem2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.side_inleft,R.anim.side_out_right)
        }

        //top bar horizental scrolling third sem
        var semes3= findViewById<Button>(R.id.btn_seme3)
        semes3.setOnClickListener {
            val intent = Intent(this, sem3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.side_inleft,R.anim.side_out_right)
        }

        //top bar horizental scrolling semisters 4thsemister
        var semes4= findViewById<Button>(R.id.btn_seme4)
        semes4.setOnClickListener {
            val intent = Intent(this, sem4::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.side_inleft,R.anim.side_out_right)
        }
        //top bar horizental scrolling semisters 5thsemister
        var semes5= findViewById<Button>(R.id.btn_seme5)
        semes5.setOnClickListener {
            val intent = Intent(this, sem5::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.side_inleft,R.anim.side_out_right)
        }

        //top bar horizental scrolling semisters 7thsemister
        var semes7= findViewById<Button>(R.id.btn_seme7)
        semes7.setOnClickListener {
            val intent = Intent(this, sem7::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.side_inleft,R.anim.side_out_right)
        }
    }
}