package com.arash.altafi.views.kotlin.text1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_text_kotlin1.*

class TextKotlinActivity1 : AppCompatActivity() {

    lateinit var typeBio : TypeWriter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_kotlin1)

        val bio : String = getString(R.string.loremIpsum)

        typeBio = textTypeBio
        typeBio.text = ""
        typeBio.setCharacterDelay(1) //60
        typeBio.animateText(bio)
    }
}