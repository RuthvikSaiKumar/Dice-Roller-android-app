package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roller:Button=findViewById(R.id.roll)
        roller.setOnClickListener{
            Toast.makeText(this, "Dice Rolled!!", Toast.LENGTH_SHORT).show()
            var num=(1..6).random()
            val result:TextView=findViewById(R.id.result)
            result.text=num.toString()
        }
    }
}
