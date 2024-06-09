package com.example.vridappassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.Keep
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.vridappassignment.navigation.NavGraph
import com.example.vridappassignment.ui.theme.AppBarColor
import com.example.vridappassignment.ui.theme.VridAppAssignmentTheme
import dagger.hilt.android.AndroidEntryPoint

@Keep
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  @OptIn(ExperimentalMaterial3Api::class)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      VridAppAssignmentTheme {
        Scaffold(
          topBar = {
            TopAppBar(
              colors = TopAppBarDefaults.topAppBarColors(AppBarColor),
              title = { Text(text = "VridApp", color = Color.White) },
            )
          },
          modifier = Modifier.fillMaxSize(),
        ) { innerPadding ->
          val navHostController = rememberNavController()
          NavGraph(navController = navHostController, modifier = Modifier.padding(innerPadding))
          //          BlogListScreen(
          //            navController = navHostController,
          //            modifier = Modifier.padding(innerPadding),
          //          )
        }
      }
    }
  }
}
