package com.example.vridappassignment.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.vridappassignment.navigation.BlogNavigationItem
import com.example.vridappassignment.ui.components.BlogListItem
import com.example.vridappassignment.ui.viewmodel.BlogViewModel

@Composable
fun BlogListScreen(
  modifier: Modifier = Modifier,
  navController: NavHostController,
  viewModel: BlogViewModel = hiltViewModel(),
) {
  val result = viewModel.blogResponse.collectAsLazyPagingItems()

  LazyColumn (modifier = Modifier.fillMaxSize().padding(top = 100.dp)){
    items(result.itemCount) {
      result[it]?.let { it1 ->
        BlogListItem(blogsItem = it1) {
          navController.navigate(BlogNavigationItem.BlogDetails.route + "/${it}")
        }
      }
    }
  }
}
