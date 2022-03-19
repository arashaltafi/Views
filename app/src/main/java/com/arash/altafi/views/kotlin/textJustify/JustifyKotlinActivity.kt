package com.arash.altafi.views.kotlin.textJustify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_justify_kotlin.*

class JustifyKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_justify_kotlin)

        init()
    }

    private fun init() {
        txt_justify_1_text_view.setText(getString(R.string.loremIpsum), true)
        txt_justify_2_text_view.setText(getString(R.string.lorem_persian), true)
    }

}