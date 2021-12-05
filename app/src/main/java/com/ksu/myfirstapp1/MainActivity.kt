package com.ksu.myfirstapp1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val HELLO_KEY = "Hello"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}
