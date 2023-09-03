package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiscreenapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(LOG_ActivityMain, "onCreate")

        val intentToActivity2 = Intent(this@MainActivity, Activity2::class.java)

        binding.buttonGoTo2.setOnClickListener {
            startActivity(intentToActivity2)
        }
        binding.buttonGoFrom1.setOnClickListener {
            finishAffinity()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_ActivityMain, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_ActivityMain, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_ActivityMain, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_ActivityMain, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_ActivityMain, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_ActivityMain, "onRestart")
    }
}