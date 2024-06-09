package com.example.vridappassignment.navigation

sealed class BlogNavigationItem(val route: String) {
  data object BlogList : BlogNavigationItem("blog_list")

  data object BlogDetails : BlogNavigationItem("blog_details")
}
