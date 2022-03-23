package com.arash.altafi.views.kotlin.text3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.ext.applyValue
import kotlinx.android.synthetic.main.activity_text_kotlin3.*

class TextKotlinActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_kotlin3)

        init("آرش الطافی")
    }

    private fun init(title: String) {
        txt_title.text = getString(R.string.test_append).applyValue(title)
    }

}