package com.example.bcatu

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var bcaWeb: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Welcome to BCATU.com", Toast.LENGTH_SHORT).show()

        //Insert item in activity
         bcaWeb =findViewById<WebView>(R.id.bcawebView)

        //Block to run chrome
        bcaWeb.webViewClient = WebViewClient()

        //Run WebView Loder mens load BCATU
        bcaWeb.apply {
            loadUrl("https://bcatu.com")
        }
        bcaWeb.settings.setSupportZoom(true)
        bcaWeb.settings.javaScriptEnabled = true

        //When Back press


    }

    override fun onBackPressed() {
        // if your webview can go back it will go back
        if (bcaWeb.canGoBack())
            bcaWeb.goBack()
        // if your webview cannot go back
        // it will exit the application
        else
            super.onBackPressed()
    }
}