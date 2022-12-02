package com.esgi.android.exercices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO Changer cette ligne en fonction des layouts
        setContentView(R.layout.activity_main)
        changeActivity()

    }

    private fun changeActivity() {
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }



}