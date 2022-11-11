package com.example.periodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Yoga6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga6)
        title="Supported Bridge Pose (Setu Bandha Sarvangasana)"
        getSupportActionBar()?.hide()
    }
}