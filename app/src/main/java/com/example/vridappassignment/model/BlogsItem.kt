package com.example.vridappassignment.model

data class BlogsItem(
  val aioseoNotices: List<Any>,
  val author: Int, // 223152417
  val categories: List<Int>,
  val classList: List<String>,
  val commentStatus: String, // closed
  val content: Content,
  val date: String, // 2024-06-04T08:00:00
  val dateGmt: String, // 2024-06-04T02:30:00
  val excerpt: Excerpt,
  val featuredMedia: WpFeaturedmedia, // 5420
  val format: String, // standard
  val guid: Guid,
  val id: Int, // 5402
  val jetpackFeaturedMediaUrl: String, // https://i0.wp.com/blog.vrid.in/wp-content/uploads/2024/06/161.png?fit=1920%2C1080&ssl=1
  val jetpackLikesEnabled: Boolean, // true
  val jetpackPublicizeConnections: List<Any>,
  val jetpackRelatedPosts: List<Any>,
  val jetpackSharingEnabled: Boolean, // true
  val jetpackShortlink: String, // https://wp.me/pe5xoh-1p8
  val link: String, // https://blog.vrid.in/2024/06/04/what-should-you-do-after-falling-for-a-financial-scam-fraud-how-to-recover-your-money/
  val links: Links,
  val meta: Meta,
  val modified: String, // 2024-06-01T10:43:04
  val modifiedGmt: String, // 2024-06-01T05:13:04
  val pingStatus: String, // open
  val slug: String, // what-should-you-do-after-falling-for-a-financial-scam-fraud-how-to-recover-your-money
  val status: String, // publish
  val sticky: Boolean, // false
  val tags: List<Int>,
  val template: String, // blank
  val title: Title,
  val type: String // post
)