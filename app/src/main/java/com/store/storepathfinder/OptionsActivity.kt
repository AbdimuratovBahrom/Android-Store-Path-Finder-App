package com.store.storepathfinder

import android.animation.ObjectAnimator
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.animation.DecelerateInterpolator
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OptionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        val openWebButton: Button = findViewById(R.id.openWebButton)
        val openMapButton: Button = findViewById(R.id.openMapButton)

        // Анимация появления кнопок
        animateButton(openWebButton)
        animateButton(openMapButton)

        // 1️⃣ Открыть веб-приложение
        openWebButton.setOnClickListener {
            val url = "https://store-path-finder-app.onrender.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // 2️⃣ Открыть карту
        openMapButton.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
    }

    private fun animateButton(button: Button) {
        button.alpha = 0f
        button.scaleX = 0.8f
        button.scaleY = 0.8f
        ObjectAnimator.ofFloat(button, "alpha", 0f, 1f).apply {
            duration = 600
            interpolator = DecelerateInterpolator()
            start()
        }
        ObjectAnimator.ofFloat(button, "scaleX", 0.8f, 1f).apply {
            duration = 600
            interpolator = DecelerateInterpolator()
            start()
        }
        ObjectAnimator.ofFloat(button, "scaleY", 0.8f, 1f).apply {
            duration = 600
            interpolator = DecelerateInterpolator()
            start()
        }
    }
}
