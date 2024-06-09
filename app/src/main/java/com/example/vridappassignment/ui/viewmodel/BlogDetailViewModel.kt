package com.example.vridappassignment.ui.viewmodel

import androidx.annotation.Keep
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vridappassignment.common.Resource
import com.example.vridappassignment.data.repository.BlogRepository
import com.example.vridappassignment.ui.stateholder.BlogDetailStateHolder
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@Keep
@HiltViewModel
class BlogDetailViewModel
@Inject
constructor(private val blogRepository: BlogRepository, savedStateHandle: SavedStateHandle) :
  ViewModel() {
  val blogDetailStateHolder = mutableStateOf(BlogDetailStateHolder())

  init {
    blogDetailStateHolder.value = BlogDetailStateHolder(isLoading = true)
    viewModelScope.launch {
      savedStateHandle.getStateFlow("id", "0").collectLatest { getBlogDetails(it) }
    }
  }

  private fun getBlogDetails(id: String) =
    viewModelScope.launch {
      when (val result = blogRepository.getBlogDetail(id)) {
        is Resource.Error -> {
          blogDetailStateHolder.value = BlogDetailStateHolder(error = result.message.toString())
        }
        is Resource.Success -> {
          blogDetailStateHolder.value = BlogDetailStateHolder(data = result.data)
        }
        else -> {}
      }
    }
}
