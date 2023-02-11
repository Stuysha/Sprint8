package com.example.sprint8ryabikina

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_screen)
        val buttonArrow = findViewById<androidx.appcompat.widget.Toolbar>(R.id.arrow)
        buttonArrow.setOnClickListener {
            onBackPressed()
        }
    }
}