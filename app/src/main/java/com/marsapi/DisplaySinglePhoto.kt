package com.example.android.marsphotos

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class DisplaySinglePhoto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.single_photo)
    }

    fun backButton(view: View){
        startActivity(Intent(this, MainActivity::class.java));
    }
}