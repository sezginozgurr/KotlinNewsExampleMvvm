package com.example.newsexampleviewmodelmvvm.newsexample.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.newsexampleviewmodelmvvm.R
import com.example.newsexampleviewmodelmvvm.newsexample.model.Article
import com.example.newsexampleviewmodelmvvm.newsexample.repository.MainViewModel
import com.example.newsexampleviewmodelmvvm.newsexample.ui.adapter.NewsAdapter
import kotlinx.android.synthetic.main.fragment_home_page.*


class HomePageFragment : Fragment(R.layout.fragment_home_page) {

    private lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.zibab()
        setRecycle(listOf())
    }

    private fun setRecycle(recList: List<Article>) {
        recylerNews.adapter = NewsAdapter(recList)
    }
}