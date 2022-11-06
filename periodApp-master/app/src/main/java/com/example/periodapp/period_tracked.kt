package com.example.periodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.res.TypedArrayUtils.getText
import java.time.Period

class period_tracked : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_period_tracked)
        getSupportActionBar()?.hide()
        val intent=intent
        val ans=intent.getStringExtra("ans4")
       val display=findViewById<TextView>(R.id.display)
       display.text=ans



    }
}