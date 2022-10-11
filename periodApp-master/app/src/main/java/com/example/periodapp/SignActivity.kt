package com.example.periodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SignActivity : AppCompatActivity() {
    lateinit var Login2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        title="Sign In"
//
//        val actionBar: ActionBar?
//        actionBar = supportActionBar
//        val actionBar = supportActionBar
//        val colorDrawable = ColorDrawable(Color.parseColor("#DF5F56"))
//        actionBar!!.setBackgroundDrawable(colorDrawable)

        // Define ActionBar object
        // Define ActionBar object


        Login2=findViewById(R.id.login2)
        Login2.setOnClickListener {

            val intent = Intent(this,NewActivity::class.java)
            startActivity(intent)
//            Toast.makeText(this, "hiii", Toast.LENGTH_SHORT).show()
        }


    }
}