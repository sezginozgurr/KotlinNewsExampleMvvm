package com.example.newsexampleviewmodelmvvm.newsexample.repository

import com.example.newsexampleviewmodelmvvm.newsexample.model.NewsModel
import com.example.newsexampleviewmodelmvvm.newsexample.retrofit.ApiService
import com.example.newsexampleviewmodelmvvm.newsexample.retrofit.RetrofitInstance

class NewsRepository {
    private var service: ApiService = RetrofitInstance.appService

    suspend fun getList(): NewsModel = service.getNews()
}