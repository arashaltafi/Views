package com.arash.altafi.views.kotlin.text2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_text_kotlin2.*

class TextKotlinActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_kotlin2)

        init()
    }

    private fun init() {

        txt_line_text_view.animationDuration = 10000F
        txt_line_text_view.animateText("This is LineTextView")

        txt_fade_text_view.animateText("This is FadeTextView")


        txt_type_text_view.typerSpeed = 100
        txt_type_text_view.charIncrease = 100
        txt_type_text_view.animateText("This is TyperTextView")

        txt_rainbow_text_view.colorSpeed = 1000F
        txt_rainbow_text_view.animateText("This is RainbowTextView")

        txt_scale_text_view.animateText("This is ScaleTextView")

        txt_fall_text_view.animateText("This is FallTextView")

        txt_type_text_view_2.animateText(getString(R.string.let_s_manage_your_task))

    }

}