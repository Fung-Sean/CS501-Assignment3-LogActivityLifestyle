package com.example.logactivitylifestyle

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate: Activity created.")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart: Activity started.")
    }
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume: Activity resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause: Activity paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop: Activity stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy: Activity destroyed")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart: Activity restarted")
    }
}