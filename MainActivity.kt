package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClick = findViewById<Button>(R.id.btnClick)
        btnClick.setOnClickListener{
            intent = Intent( this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}