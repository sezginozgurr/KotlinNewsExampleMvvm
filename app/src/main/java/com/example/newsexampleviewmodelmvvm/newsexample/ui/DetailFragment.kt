package com.example.newsexampleviewmodelmvvm.newsexample.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.newsexampleviewmodelmvvm.R
import com.example.newsexampleviewmodelmvvm.newsexample.repository.MainViewModel
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment : Fragment(R.layout.fragment_detail) {

    private lateinit var detailViewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Glide.with(requireContext()).load(arguments?.getString("urlToImage"))
        //.into(detailImage)
        detailAuthor.text = arguments?.getString("author")
        txtPuslishAt.text = arguments?.getString("publishAt")
        detailContent.text = arguments?.getString("content")

/*        detailViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        detailViewModel.getNews()
        detailViewModel.news.observe(viewLifecycleOwner, {
            detailAuthor.text = it.articles[0].author
            detailContent.text = it.articles[0].content
        })*/
    }
}

