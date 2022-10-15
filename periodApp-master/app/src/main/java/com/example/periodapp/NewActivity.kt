package com.example.periodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class NewActivity : AppCompatActivity() {
    lateinit var imageButton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title="Our App"

//        val actionBar: ActionBar?
//        actionBar = supportActionBar
//        val colorDrawable = ColorDrawable(Color.parseColor("#DF5F56"))
//        actionBar!!.setBackgroundDrawable(colorDrawable)
        imageButton=findViewById(R.id.yoga)
        imageButton.setOnClickListener {

            val intent = Intent(this,Yoga::class.java)
            startActivity(intent)
        }


    }
}