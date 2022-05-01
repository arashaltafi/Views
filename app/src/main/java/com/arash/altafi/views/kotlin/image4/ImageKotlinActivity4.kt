package com.arash.altafi.views.kotlin.image4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_image_kotlin4.*

class ImageKotlinActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_kotlin4)

        init()
    }

    private fun init() {
        imageView4.setImageResource(R.drawable.arash)
    }

}