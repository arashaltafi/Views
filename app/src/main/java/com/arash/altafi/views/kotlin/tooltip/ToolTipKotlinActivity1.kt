package com.arash.altafi.views.kotlin.tooltip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_tool_tip_kotlin1.*

class ToolTipKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_tip_kotlin1)

        init()
    }

    private fun init() {
        btnToolTip1.setOnClickListener {
            ToolTip.setToolTip(it, "sample 1")
        }

        btnToolTip2.setOnClickListener {
            ToolTip.setToolTip(it, "sample 2")
        }
    }

}