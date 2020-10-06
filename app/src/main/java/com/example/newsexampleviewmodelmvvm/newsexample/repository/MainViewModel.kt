package com.example.newsexampleviewmodelmvvm.newsexample.repository

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel() : ViewModel() {

    private val repository = NewsRepository()

    fun zibab() {
        Log.d("TAG", "zibab: ")
    }
}