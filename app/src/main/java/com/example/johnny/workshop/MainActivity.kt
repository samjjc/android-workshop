package com.example.johnny.workshop

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0

        plus.setOnClickListener {
            count++
            text.text = count.toString()
        }

        minus.setOnClickListener {
            count--
            text.text = count.toString()
        }

        next.setOnClickListener {
            val intent = Intent(this, Part2::class.java)
            startActivity(intent)
        }
    }
}
