package com.example.newsexampleviewmodelmvvm.newsexample.retrofit

import com.example.newsexampleviewmodelmvvm.newsexample.model.Article
import com.example.newsexampleviewmodelmvvm.newsexample.model.NewsModel
import com.example.newsexampleviewmodelmvvm.newsexample.model.Source
import retrofit2.http.GET

interface ApiService {
    @GET("top-headlines?country=us&category=business&apiKey=3731ae5c419e41faa755f7a7d174fe60")
    suspend fun getArticle(): List<Article>

    @GET("top-headlines?country=us&category=business&apiKey=3731ae5c419e41faa755f7a7d174fe60")
    suspend fun getNews(): List<NewsModel>

    @GET("top-headlines?country=us&category=business&apiKey=3731ae5c419e41faa755f7a7d174fe60")
    suspend fun getSource(): List<Source>

}