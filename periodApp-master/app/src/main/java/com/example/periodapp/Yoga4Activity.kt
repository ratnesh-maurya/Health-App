package com.example.periodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Yoga4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga4)
        title="Seated Straddle (Upavistha Konasana)\n"
        getSupportActionBar()?.hide()

    }
}