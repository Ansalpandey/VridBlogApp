package com.example.vridappassignment.ui.stateholder

import com.example.vridappassignment.model.BlogsItem

data class BlogDetailStateHolder(
  val isLoading: Boolean = false,
  val data: BlogsItem? = null,
  val error: String = "",
)
