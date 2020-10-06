package com.example.newsexampleviewmodelmvvm.newsexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.newsexampleviewmodelmvvm.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}

// http://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=3731ae5c419e41faa755f7a7d174fe60