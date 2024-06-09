package com.example.vridappassignment.ui.components

import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun WebViewJetpack(modifier: Modifier = Modifier, url: String) {

  AndroidView(
    factory = { context ->
      android.webkit.WebView(context).apply {
        settings.javaScriptEnabled = true
        webViewClient = WebViewClient()

        settings.loadWithOverviewMode = true
        settings.useWideViewPort = true
        settings.setSupportZoom(true)
      }
    },
    update = { webView -> webView.loadUrl(url) },
  )
}
