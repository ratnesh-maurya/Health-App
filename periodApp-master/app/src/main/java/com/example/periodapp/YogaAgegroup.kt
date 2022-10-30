package com.example.periodapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class YogaAgegroup : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var  button3: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga_agegroup)

        button1=findViewById(R.id.button10)
        button1.setOnClickListener {
            val intent = Intent(this,Yoga10::class.java)
            startActivity(intent)
        }
        button2=findViewById(R.id.button18)
        button2.setOnClickListener {
            val intent = Intent(this,Yoga::class.java)
            startActivity(intent)
        }
        button3=findViewById(R.id.button45)
        button3.setOnClickListener {
            val intent = Intent(this,Yoga45::class.java)
            startActivity(intent)
        }
    }
}