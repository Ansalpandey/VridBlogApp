package com.example.vridappassignment.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BlogDetailItem(modifier: Modifier = Modifier, url: String) {
    Column (modifier = Modifier.fillMaxSize().padding(top = 60.dp)){
        WebViewJetpack(url = url)
    }
}