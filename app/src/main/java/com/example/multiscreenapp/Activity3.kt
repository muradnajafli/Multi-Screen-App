package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiscreenapp.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {
    private lateinit var binding: Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(LOG_Activity3, "onCreate")

        val intentToActivity4 = Intent(this@Activity3, Activity4::class.java)
        val intentFromActivity3 = Intent(this@Activity3, Activity2::class.java)

        binding.buttonGoTo4.setOnClickListener {
            startActivity(intentToActivity4)
        }

        binding.buttonGoFrom3.setOnClickListener {
            startActivity(intentFromActivity3)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(LOG_Activity3, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_Activity3, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_Activity3, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_Activity3, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_Activity3, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_Activity3, "onRestart")
    }
}