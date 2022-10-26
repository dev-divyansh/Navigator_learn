package com.divyansh.navigator_learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //logic for navigation

        // created instances for fragments

        var frag_google = Fragment_One()
        var frag_yahoo = Fragment_two()

        // creating instances for button

        var btn_google : Button = findViewById(R.id.button)
        var btn_yahoo : Button = findViewById(R.id.button2)


        // writing code to switch fragments

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frView , frag_google)
            commit()
        }

        // setting on click listener for button google

        btn_google.setOnClickListener {
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.frView , frag_google)
                addToBackStack(null)
                commit()
            }
        }

        // setting on click Listener for button yahoo

        btn_yahoo.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.frView , frag_yahoo)
                addToBackStack(null)
                commit()
            }
        }



    }
}