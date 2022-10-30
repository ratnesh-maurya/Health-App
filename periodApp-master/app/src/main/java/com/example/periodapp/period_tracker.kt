package com.example.periodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class period_tracker : AppCompatActivity() {
    private lateinit var tracking: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_period_tracker)



        tracking =findViewById(R.id.next)
        tracking.setOnClickListener {

            val intent = Intent(this,period_tracked::class.java)
            startActivity(intent)
        }
    }

}