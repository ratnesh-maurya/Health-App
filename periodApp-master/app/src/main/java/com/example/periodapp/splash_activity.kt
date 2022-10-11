package com.example.periodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager



class splash_activity : AppCompatActivity() {
    private val SPLASH_TIME_OUT = 1000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar()?.hide()
        Handler().postDelayed(
            {
                val i = Intent(this@splash_activity, MainActivity::class.java)
                startActivity(i)
                finish()
            }, SPLASH_TIME_OUT)

    }





}