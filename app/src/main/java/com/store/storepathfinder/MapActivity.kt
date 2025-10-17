package com.store.storepathfinder

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val webView: WebView = findViewById(R.id.webView)
        webView.webViewClient = WebViewClient() // открываем внутри приложения

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        // 🔍 Включаем масштабирование
        webSettings.setSupportZoom(true)
        webSettings.builtInZoomControls = true
        webSettings.displayZoomControls = false // убирает старые кнопки лупы

        // 📱 Адаптируем страницу под экран
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true

        // 🌐 Загружаем твою страницу с картой
        webView.loadUrl("https://abdimuratovbahrom.github.io/tashkent-trade-center/")
    }
}
