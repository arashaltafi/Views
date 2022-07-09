package com.arash.altafi.views.kotlin.progressbar6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_progress_bar_kotlin6.*

class ProgressBarKotlinActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar_kotlin6)

        init()
    }

    private fun init() {
        light.setOnClickListener {
            if (!light.isOn()) light.on()
            else light.off()
        }
    }

}