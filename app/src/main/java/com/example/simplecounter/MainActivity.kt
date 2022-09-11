package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val upgradeButton = findViewById<Button>(R.id.upgradeButton)


        button.setOnClickListener {
            // Handle user taps based on counter and whether or not they've upgraded
            if (counter >= 100 && !upgradeButton.isVisible) {
                counter++
                counter++
                textView.text = counter.toString()
            } else {
                counter++
                textView.text = counter.toString()
                if (counter == 100) {
                    upgradeButton.visibility = View.VISIBLE
                }
            }
        }

        upgradeButton.setOnClickListener {
            // Upgrade button to allow user to add 2
            button.text = "Add 2"
            upgradeButton.isVisible = false
            Toast.makeText(it.context, "Upgrade Successful!", Toast.LENGTH_SHORT).show()
        }
    }
}