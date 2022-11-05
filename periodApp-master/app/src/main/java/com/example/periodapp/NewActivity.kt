package com.example.periodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class NewActivity : AppCompatActivity() {
    lateinit var imageButton: ImageButton
    private lateinit var Maps : ImageButton
    private lateinit var track : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        getSupportActionBar()?.hide()

//        val actionBar: ActionBar?
//        actionBar = supportActionBar
//        val colorDrawable = ColorDrawable(Color.parseColor("#DF5F56"))
//        actionBar!!.setBackgroundDrawable(colorDrawable)
        imageButton=findViewById(R.id.yoga)
        Maps=findViewById(R.id.maps)
        track=findViewById(R.id.period)

        Maps.setOnClickListener {

            val intent = Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }
        track.setOnClickListener {

            val intent = Intent(this,period_tracker::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener {

            val intent = Intent(this,YogaAgegroup::class.java)
            startActivity(intent)
        }


    }
}