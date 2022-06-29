package com.example.android.marsphotos

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showPhoto(){
        startActivity(Intent(this, DisplaySinglePhoto::class.java));
    }

    fun refresh(){
        startActivity(Intent(this, MainActivity::class.java));
    }
}