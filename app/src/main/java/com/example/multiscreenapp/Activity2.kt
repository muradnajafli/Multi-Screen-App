package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiscreenapp.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(LOG_Activity2, "onCreate")

        val intentToActivity3 = Intent(this@Activity2, Activity3::class.java)
        val intentFromActivity2 = Intent(this@Activity2, MainActivity::class.java)

        binding.buttonGoTo3.setOnClickListener {
            startActivity(intentToActivity3)
        }

        binding.buttonGoFrom2.setOnClickListener {
            startActivity(intentFromActivity2)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(LOG_Activity2, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_Activity2, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_Activity2, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_Activity2, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_Activity2, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_Activity2, "onRestart")
    }
}