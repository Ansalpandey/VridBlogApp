package com.example.vridappassignment.pagination

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.vridappassignment.data.repository.BlogRepository
import com.example.vridappassignment.model.BlogsItem
import java.io.IOException
import javax.inject.Inject
import retrofit2.HttpException

class BlogPagingSource @Inject constructor(private val blogRepository: BlogRepository) :
  PagingSource<Int, BlogsItem>() {
  override fun getRefreshKey(state: PagingState<Int, BlogsItem>): Int? {
    return state.anchorPosition?.let { position ->
      state.closestPageToPosition(position)?.prevKey?.plus(1)
        ?: state.closestPageToPosition(position)?.nextKey?.minus(1)
    }
  }

  override suspend fun load(params: LoadParams<Int>): LoadResult<Int, BlogsItem> {
    val page = params.key ?: 1
    return try {
      val response = blogRepository.getBlogList(page, 10)

      LoadResult.Page(
        data = response,
        prevKey = null,
        nextKey = if (response.isNotEmpty()) page.plus(1) else null,
      )
    } catch (e: IOException) {
      LoadResult.Error(e)
    } catch (e: HttpException) {
      LoadResult.Error(e)
    }
  }
}
