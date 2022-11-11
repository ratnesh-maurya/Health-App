package com.example.periodapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.periodapp.R.id.yoga2

class Yoga2Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga2)
        title="Cobbler's Pose (Baddha Konasana)\n"
        getSupportActionBar()?.hide()

    }
}