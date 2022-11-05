package com.example.periodapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class YogaAgegroup : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var  button3: Button
    lateinit var edittext:EditText
    lateinit var  button4:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga_agegroup)

        edittext=findViewById(R.id.Age)
        button4=findViewById(R.id.Clickme)
        button4.setOnClickListener {
            val ans: Int = edittext.getText().toString().toInt()
            if(ans>8 && ans<=18){
            val intent = Intent(this,Yoga10::class.java)
            startActivity(intent)
              }
            if(ans>18 && ans<=45){
                val intent = Intent(this,Yoga::class.java)
                startActivity(intent)
            }
            if(ans>45){
                val intent = Intent(this,Yoga45::class.java)
                startActivity(intent)
            }
        }







    }
}