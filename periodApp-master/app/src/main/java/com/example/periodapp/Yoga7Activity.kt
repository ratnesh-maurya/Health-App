package com.example.periodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Yoga7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga7)

        title="Goddess Pose (Supta Baddha Konasana)\n"
        getSupportActionBar()?.hide()
    }
}