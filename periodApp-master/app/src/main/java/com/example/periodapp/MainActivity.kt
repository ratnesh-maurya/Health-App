package com.example.periodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  lateinit var login :Button
  lateinit var Register:Button
  lateinit var Skip: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSupportActionBar()?.hide()



        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

        login=findViewById(R.id.btnlogin)
        Register=findViewById(R.id.register)
        Skip=findViewById(R.id.skip)
        login.setOnClickListener {

            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
        }
        Register.setOnClickListener {

            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
        Skip.setOnClickListener {
            val intent = Intent(this,NewActivity::class.java)
            startActivity(intent)
        }

    }


}





