package com.example.vridappassignment.data.datasource

import androidx.annotation.Keep
import com.example.vridappassignment.network.ApiService
import javax.inject.Inject

@Keep
class BlogDataSource @Inject constructor(private val apiService: ApiService) {
  suspend fun getBlogs(page: Int, perPage: Int) = apiService.getBlogs(page, perPage)

  suspend fun getBlog(id: String) = apiService.getBlog(id)
}
