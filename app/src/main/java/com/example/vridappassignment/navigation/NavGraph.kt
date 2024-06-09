package com.example.vridappassignment.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.vridappassignment.ui.screens.BlogDetailScreen
import com.example.vridappassignment.ui.screens.BlogListScreen

@Composable
fun NavGraph(modifier: Modifier = Modifier, navController: NavHostController) {
  NavHost(navController = navController, startDestination = BlogNavigationItem.BlogList.route) {
    composable(route = BlogNavigationItem.BlogList.route) {
      BlogListScreen(navController = navController)
    }
    composable(route = BlogNavigationItem.BlogDetails.route + "/{id}") {
      it.arguments?.getString("id")
      BlogDetailScreen(modifier = Modifier.fillMaxSize().padding(6.dp))
    }
  }
}
