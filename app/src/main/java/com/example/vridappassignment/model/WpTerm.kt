package com.example.vridappassignment.model

data class WpTerm(
  val embeddable: Boolean, // true
  val href: String, // https://blog.vrid.in/wp-json/wp/v2/categories?post=5402
  val taxonomy: String // category
)