package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    private var petHealth = 100
    private var petHunger = 50
    private var petCleanliness = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        // Get the buttons and text views
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnHappy = findViewById<Button>(R.id.btnHappy)
        val txtHunger = findViewById<EditText>(R.id.txtHunger)
        val txtClean = findViewById<EditText>(R.id.txtClean)
        val txtHappy = findViewById<EditText>(R.id.txtHappy)
        val petImage = findViewById<ImageView>(R.id.pet_Image)

        //set the initial text values
        txtHunger.setText(petHunger.toString())
        txtClean.setText(petCleanliness.toString())
        txtHappy.setText(petHealth.toString())

        //Handle button clicks
        btnFeed.setOnClickListener {
            petHunger += 10
            petHealth += 10
            petHunger += 5
            txtHunger.setText(petHunger.toString())
            animateImageChange(petImage, R.drawable.dog_eating)
        }

        btnClean.setOnClickListener {
            petCleanliness += 10
            petHealth += 10

            txtClean.setText(petCleanliness.toString())
            animateImageChange(petImage, R.drawable.dog_clean)
        }
        btnHappy.setOnClickListener {
            petHealth += 10
            petHunger += 5
            petCleanliness - +5
            txtHappy.setText(petHealth.toString())
            animateImageChange(petImage, R.drawable.dog_happy)
        }

    }

    private fun animateImageChange(imageView: ImageView, newImageResource: Int) {
        val animation = AlphaAnimation(0.0f, 1.0f)
        animation.duration = 500
        animation.fillAfter = true
        imageView.startAnimation(animation)
        imageView.setImageResource(newImageResource)
    }
}