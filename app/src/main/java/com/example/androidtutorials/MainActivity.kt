package com.example.androidtutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Methods", "onCreate() is called")
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