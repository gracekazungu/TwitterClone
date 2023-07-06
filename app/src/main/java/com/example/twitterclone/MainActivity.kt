package com.example.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayTweets()
    }
    fun displayTweets(){
        val tweet1=TweetData("","Grace","@machakos","lorem upsum",5,5,10)
        val tweet2=TweetData("","Dominic","@kenya","loremopsuam",6,56,2)

        val tweetList= listOf(tweet1,tweet2)
        val twtAdapter= TweetAdapter(tweetList)
        binding.rvtweet.layoutManager = LinearLayoutManager(this)
        binding.rvtweet.adapter=twtAdapter
    }
}