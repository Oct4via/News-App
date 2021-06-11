package com.example.news.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.news.model.Article
import com.example.news.databinding.NewsItemBinding

class NewsViewHolder(private val binding: NewsItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Article) {
        binding.newsDescription.setText(item.description)
        binding.newsTitle.setText(item.title)
        Glide.with(binding.newsImage).load(item.urlToImage).into(binding.newsImage)
    }
}
