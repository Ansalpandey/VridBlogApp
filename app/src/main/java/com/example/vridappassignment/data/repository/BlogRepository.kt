package com.example.vridappassignment.data.repository

import androidx.annotation.Keep
import com.example.vridappassignment.common.Resource
import com.example.vridappassignment.data.datasource.BlogDataSource
import com.example.vridappassignment.model.BlogsItem
import javax.inject.Inject

@Keep
class BlogRepository @Inject constructor(private val blogDataSource: BlogDataSource) {
  suspend fun getBlogList(page: Int, limit: Int): List<BlogsItem> = blogDataSource.getBlogs(page, limit)

  suspend fun getBlogDetail(id: String): Resource<BlogsItem> {
    return try {
      Resource.Success(data = blogDataSource.getBlog(id))
    } catch (e: Exception) {
      Resource.Error(message = e.message.toString())
    }
  }
}
