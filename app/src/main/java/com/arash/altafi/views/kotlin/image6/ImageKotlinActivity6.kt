package com.arash.altafi.views.kotlin.image6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.glide.utils.loadCompat
import kotlinx.android.synthetic.main.activity_image_kotlin6.*

class ImageKotlinActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_kotlin6)

        init()
    }

    private fun init() {
        //If the length of the photo is larger than the size, the horizontal photo will rotate and vice versa
        val adi = LinearInterpolator()
        val generator = BackgroundTransitionGenerator()
        generator.SetMinRectFactor(1F)
        generator.setTransitionGenerator(10000, adi)
        val backGroundImage1 = moviesBackGroundImage1
        backGroundImage1.setTransitionGenerator(generator)
        backGroundImage1.loadCompat(R.drawable.arash)

        val backGroundImage2 = moviesBackGroundImage2
        backGroundImage2.setTransitionGenerator(generator)
        backGroundImage2.loadCompat(R.drawable.bg1)
    }

}