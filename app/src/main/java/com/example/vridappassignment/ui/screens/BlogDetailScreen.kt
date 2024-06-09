package com.example.vridappassignment.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.vridappassignment.ui.components.BlogDetailItem
import com.example.vridappassignment.ui.components.WebViewJetpack
import com.example.vridappassignment.ui.viewmodel.BlogDetailViewModel

@Composable
fun BlogDetailScreen(modifier: Modifier = Modifier, blogDetailViewModel: BlogDetailViewModel = hiltViewModel()) {
    val result = blogDetailViewModel.blogDetailStateHolder.value

    if (result.isLoading) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    }
    if (result.error.isNotBlank()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = result.error)
        }
    }
    result.data?.let {
        BlogDetailItem(url = it.link)
    }
    
}