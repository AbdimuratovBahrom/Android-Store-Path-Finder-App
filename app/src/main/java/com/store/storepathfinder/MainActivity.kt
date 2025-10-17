package com.store.storepathfinder

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Кнопка открытия сайта Render
        val openWebButton: Button = findViewById(R.id.openWebButton)
        openWebButton.setOnClickListener {
            val webIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://store-path-finder-app.onrender.com")
            )
            startActivity(webIntent)
        }

        // Кнопка открытия карты (веб-страница GitHub Pages)
        val openMapButton: Button = findViewById(R.id.openMapButton)
        openMapButton.setOnClickListener {
            val mapIntent = Intent(this, MapActivity::class.java)
            startActivity(mapIntent)
        }
    }
}
