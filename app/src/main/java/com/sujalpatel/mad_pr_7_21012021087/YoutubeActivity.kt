package com.sujalpatel.mad_pr_7_21012021087

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.sujalpatel.mad_pr_7_21012021087.databinding.ActivityMainBinding
import com.sujalpatel.mad_pr_7_21012021087.databinding.ActivityYoutubeBinding

class YoutubeActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityYoutubeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val youtubeId = "fJn9B64Znrk"
        val youtubeWebView = binding.YtVideo
        val webSettings : WebSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")

            binding.floatingActionButton2.setOnClickListener {
            Intent(this,MainActivity::class.java).apply { startActivity(this) }
        }
    }
}