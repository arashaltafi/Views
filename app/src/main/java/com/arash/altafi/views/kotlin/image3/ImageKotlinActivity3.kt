package com.arash.altafi.views.kotlin.image3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_image_kotlin3.*

class ImageKotlinActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_kotlin3)

        init()
    }

    private fun init() {
        photo_View.setImageResource(R.drawable.arash)
    }

}