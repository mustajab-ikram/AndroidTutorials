package com.example.androidtutorials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class Tutorial1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial1)
        Log.d("Methods", "onCreate() is called")

        val btnNextAct = findViewById<Button>(R.id.btnSecondTut)
        btnNextAct.setOnClickListener {
            val intent = Intent(this, Tutorial2::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("Methods", "onStart() is called")
    }
    override fun onResume() {
        super.onResume()
        Log.d("Methods", "onResume() is called")
    }
    override fun onPause() {
        super.onPause()
        Log.d("Methods", "onPause() is called")

    }
    override fun onStop() {
        super.onStop()
        Log.d("Methods", "onStop() is called")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("Methods", "onRestart() is called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Methods", "onDestroy() is called")
    }
}