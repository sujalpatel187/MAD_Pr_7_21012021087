package com.sujalpatel.mad_pr_7_21012021087

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.sujalpatel.mad_pr_7_21012021087.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val myVideoview = binding.video
        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myVideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoview)
        myVideoview.setVideoURI(uri)
        myVideoview.requestFocus()
        myVideoview.start()

//        val button = findViewById<FloatingActionButton>(R.id.floatingActionButton)
//        button.setOnClickListener {
//            Intent(this,YoutubeActivity::class.java).apply { startActivity(this) }
//        }

        binding.floatingActionButton.setOnClickListener{
            Intent(MainActivity@this,YoutubeActivity::class.java).also {
                startActivity(it)
            }
        }
    }

}