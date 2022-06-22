package com.arash.altafi.views.kotlin.text4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_text_kotlin4.*

class TextKotlinActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_kotlin4)

        init()
    }

    private fun init() {
        tvMarqueeShort.text = "Test Marquee"
        tvMarqueeShort.isSelected = true

        tvMarqueeBig.text = "This is a Test For Marquee in Android Studio"
        tvMarqueeBig.isSelected = true

        btnStopMarquee.setOnClickListener {
            tvMarqueeBig.isSelected = false
            tvMarqueeShort.isSelected = false
        }

        btnStartMarquee.setOnClickListener {
            tvMarqueeBig.isSelected = true
            tvMarqueeShort.isSelected = true
        }
    }

}