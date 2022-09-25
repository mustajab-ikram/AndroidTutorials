package com.example.androidtutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class Tutorial3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial3)
        val btnApply = findViewById<Button>(R.id.btnApply)

        val etFirstName = findViewById<EditText>(R.id.etFirstName)
        val etLastName = findViewById<EditText>(R.id.etLastName)
        val etDob = findViewById<EditText>(R.id.etDob)
        val etCountry = findViewById<EditText>(R.id.etCountry)

        btnApply.setOnClickListener {
            val name = etFirstName.text.toString().trim() + " " + etLastName.text.toString().trim()
            val bornOn = etDob.text.toString().trim()
            val nationality = etCountry.text.toString().trim()
            val messageStr = "$name was born on $bornOn in $nationality"

            Log.d("BTN", messageStr)
        }
    }
}