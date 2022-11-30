package com.example.basicactivityproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val second=findViewById<Button>(R.id.gosecond)
        second.setOnClickListener {
//            supportFragmentManager.beginTransaction()
//                .add(android.R.id.content, SecondFragment()).commit();
//            finish();

            val x=Intent(applicationContext,SecondFragment::class.java)
            startActivity(x)
        }
    }
}