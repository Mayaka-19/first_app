package com.example.mayaka

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class web : AppCompatActivity() {
    lateinit var web_view:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        web_view=findViewById(R.id.webview)
        webview()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webview(){
        web_view.webViewClient= WebViewClient()
        web_view.apply {
            loadUrl("https://www.youtube.com/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true

        }
    }

    override fun onBackPressed() {
        if (web_view.canGoBack())web_view.goBack() else
        super.onBackPressed()
    }
}