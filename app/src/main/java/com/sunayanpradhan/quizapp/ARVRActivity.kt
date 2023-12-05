package com.sunayanpradhan.quizapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class ARVRActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arvr)
        supportActionBar?.hide()

        val webView = findViewById<WebView>(R.id.web)

        webView.loadUrl("https://danieltk26.github.io/3D-Web-VR-Solar-System/")

        webView.settings.javaScriptEnabled = true

        webView.webViewClient = WebViewClient()
    }
}
