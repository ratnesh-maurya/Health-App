package com.example.periodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Yoga : AppCompatActivity() {
    lateinit var imageButton1:ImageButton
    lateinit var imageButton2:ImageButton
    lateinit var imageButton3:ImageButton
    lateinit var imageButton4:ImageButton
    lateinit var imageButton5:ImageButton
    lateinit var imageButton6:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)
        title="yoga for 18-45 year"



        imageButton1=findViewById(R.id.yoga2)
        imageButton1.setOnClickListener {

            val intent = Intent(this,Yoga2Activity::class.java)
            startActivity(intent)
        }

        imageButton2=findViewById(R.id.yoga3)
        imageButton2.setOnClickListener {

            val intent = Intent(this,Yoga3Activity::class.java)
            startActivity(intent)
        }

        imageButton3=findViewById(R.id.yoga4)
        imageButton3.setOnClickListener {

            val intent = Intent(this,Yoga4Activity::class.java)
            startActivity(intent)
        }

        imageButton4=findViewById(R.id.yoga5)
        imageButton4.setOnClickListener {

            val intent = Intent(this,Yoga5Activity::class.java)
            startActivity(intent)
        }

        imageButton5=findViewById(R.id.yoga6)
        imageButton5.setOnClickListener {

            val intent = Intent(this,Yoga6Activity::class.java)
            startActivity(intent)
        }

        imageButton6=findViewById(R.id.yoga7)
        imageButton6.setOnClickListener {

            val intent = Intent(this,Yoga7Activity::class.java)
            startActivity(intent)
        }
    }
}