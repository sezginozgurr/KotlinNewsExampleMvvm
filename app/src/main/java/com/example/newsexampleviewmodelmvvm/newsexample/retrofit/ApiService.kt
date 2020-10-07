package com.example.newsexampleviewmodelmvvm.newsexample.retrofit

import com.example.newsexampleviewmodelmvvm.newsexample.model.NewsModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines")
    suspend fun getNews(
        @Query("country") country: String = "us",
        @Query("category") category: String = "business",
        @Query("apiKey") apiKey: String = "3731ae5c419e41faa755f7a7d174fe60",
    ): NewsModel
}