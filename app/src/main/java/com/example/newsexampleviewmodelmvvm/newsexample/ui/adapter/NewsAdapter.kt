package com.example.newsexampleviewmodelmvvm.newsexample.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsexampleviewmodelmvvm.R
import com.example.newsexampleviewmodelmvvm.newsexample.model.Article

class NewsAdapter(private val newsList: List<Article>, val onClick: (Article) -> Unit) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(container.context).inflate(
            R.layout.row_item_news, container, false
        )
    ) {
        val newsPhoto = itemView.findViewById(R.id.newsPhoto) as ImageView
        val newsAuthor = itemView.findViewById(R.id.txtAuthor) as TextView
        val newsPublishAt = itemView.findViewById(R.id.txtPuslishAt) as TextView
        val newsContent = itemView.findViewById(R.id.txtContent) as TextView
        fun bind(article: Article, onClick: (Article) -> Unit) {
            Glide.with(itemView.context).load(article.urlToImage).into(newsPhoto)
            newsAuthor.text = article.author
            newsPublishAt.text = article.publishedAt
            newsContent.text = article.content
            itemView.setOnClickListener { onClick(article) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(newsList[position], onClick)
    }

    override fun getItemCount(): Int = newsList.size
}