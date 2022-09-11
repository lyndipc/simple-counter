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

        // To improve efficiency, we could use increaseBy var
        // var increaseBy = 1

        button.setOnClickListener {
            // Handle user taps
//            Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()

            if (counter >= 100) {
                counter++
                counter++
                textView.text = counter.toString()
            } else {
                counter++
                textView.text = counter.toString()
                if (counter == 100) {
                    upgradeButton.isVisible = true
//                    upgradeButton.visibility = View.VISIBLE
                }
            }
        }

        upgradeButton.setOnClickListener {
            // Upgrade button to Add 2
            button.text = "Add 2"
            upgradeButton.isVisible = false
            Toast.makeText(it.context, "Successfully upgraded to add 2!", Toast.LENGTH_SHORT).show()
        }
    }
}