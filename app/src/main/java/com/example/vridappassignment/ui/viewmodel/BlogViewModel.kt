package com.example.vridappassignment.ui.viewmodel

import androidx.annotation.Keep
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.vridappassignment.model.BlogsItem
import com.example.vridappassignment.pagination.BlogPagingSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

@Keep
@HiltViewModel
class BlogViewModel @Inject constructor(private val blogPagingSource: BlogPagingSource) :
  ViewModel() {
  private val _blogResponse: MutableStateFlow<PagingData<BlogsItem>> =
    MutableStateFlow(PagingData.empty())
  var blogResponse = _blogResponse.asStateFlow()
    private set

  init {
    viewModelScope.launch {
      Pager(config = PagingConfig(10, enablePlaceholders = true)) { blogPagingSource }
        .flow
        .cachedIn(viewModelScope)
        .collect { _blogResponse.value = it }
    }
  }
}
