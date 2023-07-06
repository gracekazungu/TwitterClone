package com.example.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.twitterclone.databinding.TweetListItemBinding

class TweetAdapter(var tweetlist:List<TweetData>):RecyclerView.Adapter<TweetViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        val binding=
            TweetListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false )
        return TweetViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return tweetlist.size
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        val currentTweet=tweetlist.get(position)
        val binding=holder.binding
        binding.tvDisplayName.text=currentTweet.displayName
        binding.tvHandle.text=currentTweet.handle
        binding.tvTweet.text=currentTweet.tweet
        binding.tvLikeCount.text=currentTweet.likeCount.toString()
        binding.tvCommentCount.text=currentTweet.commentCount.toString()
        binding.tvRtCount.text=currentTweet.rtCount.toString()
    }
}
class TweetViewHolder(var binding: TweetListItemBinding):ViewHolder(binding.root) {
}