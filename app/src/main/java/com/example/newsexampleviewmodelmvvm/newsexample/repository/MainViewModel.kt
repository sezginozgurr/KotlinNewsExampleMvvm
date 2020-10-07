package com.example.newsexampleviewmodelmvvm.newsexample.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsexampleviewmodelmvvm.newsexample.model.NewsModel
import kotlinx.coroutines.launch

class MainViewModel() : ViewModel() {
    var repo: NewsRepository = NewsRepository()

    private val _news = MutableLiveData<NewsModel>()
    val news: LiveData<NewsModel>
        get() = _news

    fun getNews() {
        viewModelScope.launch {
            _news.value = repo.getList()
        }
    }
}