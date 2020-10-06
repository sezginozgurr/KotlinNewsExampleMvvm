package com.example.newsexampleviewmodelmvvm.newsexample.ui

interface UiEventManager {
    fun showToast(text: String)

    fun showProgressBar()

    fun hideProgressBar()
}