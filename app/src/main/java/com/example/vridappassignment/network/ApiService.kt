package com.example.vridappassignment.network

import com.example.vridappassignment.model.BlogsItem
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("posts")
    suspend fun getBlogs(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ) : List<BlogsItem>

    @GET("posts/{id}")
    suspend fun getBlog(@Path("id") id: String) : BlogsItem
}