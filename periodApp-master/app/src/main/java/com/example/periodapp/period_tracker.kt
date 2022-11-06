package com.example.periodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.content.res.TypedArrayUtils.getText
import java.time.Period

class period_tracker : AppCompatActivity() {
    private lateinit var tracking: Button
    lateinit var Ago: EditText
    lateinit var Period: EditText
    lateinit var Repeat: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_period_tracker)
        getSupportActionBar()?.hide()

        tracking =findViewById(R.id.next)
        Ago=findViewById(R.id.ago)
        Period =findViewById(R.id.period)
        Repeat=findViewById(R.id.repeat)

        tracking.setOnClickListener {
            val ans: Int = Ago.getText().toString().toInt()
            val ans1: Int = Period.getText().toString().toInt()
            val ans3: Int = Repeat.getText().toString().toInt()

            val ans5: Int = ans3-ans+(ans1/4)
            val ans4 =ans5.toString()
            val intent = Intent(this,period_tracked::class.java)
            intent.putExtra("ans4",ans4)
            startActivity(intent)
        }





    }

}