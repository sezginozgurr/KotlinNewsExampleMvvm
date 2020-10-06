package com.example.newsexampleviewmodelmvvm.newsexample.model

import com.google.gson.annotations.SerializedName

data class NewsModel(
    @SerializedName("status")
    val status: String,
    @SerializedName("articles")
    val articles: List<Article>
) {
}