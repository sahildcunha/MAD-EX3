package com.example.ex3

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeButton = findViewById<Button>(R.id.homeButton)
        val profileButton = findViewById<Button>(R.id.profileButton)

        // Show Home Fragment when the app starts
        loadFragment(HomeFragment())

        // Open Home Fragment
        homeButton.setOnClickListener {
            loadFragment(HomeFragment())
        }

        // Open Profile Fragment
        profileButton.setOnClickListener {
            loadFragment(ProfileFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}