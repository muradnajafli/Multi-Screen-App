package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiscreenapp.databinding.Activity3Binding
import com.example.multiscreenapp.databinding.Activity4Binding

class Activity4 : AppCompatActivity() {
    private lateinit var binding: Activity4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Activity4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(LOG_Activity4, "onCreate")

        val intentToActivity1 = Intent(this@Activity4, MainActivity::class.java)
        val intentFromActivity4 = Intent(this@Activity4, Activity3::class.java)

        binding.buttonGoTo1.setOnClickListener {
            startActivity(intentToActivity1)
            finishAffinity()
        }

        binding.buttonGoFrom4.setOnClickListener {
            startActivity(intentFromActivity4)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_Activity4, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_Activity4, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_Activity4, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_Activity4, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_Activity4, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_Activity4, "onRestart")
    }
}