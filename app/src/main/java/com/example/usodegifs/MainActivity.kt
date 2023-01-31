package com.example.usodegifs

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import lal.adhish.gifprogressbar.GifView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pGif: GifView = findViewById<View>(R.id.progressBar) as GifView
        pGif.setImageResource(R.drawable.loading02)

        val pGif2: GifView = findViewById<View>(R.id.progressBar2) as GifView
        pGif2.setImageResource(R.drawable.working)
    }
}