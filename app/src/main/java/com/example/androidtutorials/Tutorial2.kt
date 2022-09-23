package com.example.androidtutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class Tutorial2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial2)
        val etFirstName = findViewById<EditText>(R.id.etFirstName)
        val etLastName = findViewById<EditText>(R.id.etLastName)
        val etDob = findViewById<EditText>(R.id.etDob)
        val etCountry = findViewById<EditText>(R.id.etCountry)
        val button = findViewById<Button>(R.id.btnApply)

        button.setOnClickListener {
            val message = """
                | ${etFirstName.text.toString()} ${etLastName.text.toString()} born on ${etDob.text.toString()} in ${etCountry.text.toString()}
                | - just clicked the button.
            """.trimIndent()
            Log.d("Msg", message)
        }
    }
}