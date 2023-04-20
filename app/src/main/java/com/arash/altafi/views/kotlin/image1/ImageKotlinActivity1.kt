package com.arash.altafi.views.kotlin.image1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_image_kotlin1.*

class ImageKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_kotlin1)

        init()
    }

    private fun init() {
        Glide
            .with(this)
            .load("https://arashaltafi.ir/url_sample/gif.webp")
            .into(image_1)
    }

}