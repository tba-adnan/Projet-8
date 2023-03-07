package com.example.prototype_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // list -> input -> recycle view to display
        val tasks = mutableListOf<String>("task 1", "task 2")
        // to upgrade to API 33.

    }
}