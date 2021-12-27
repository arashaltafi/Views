package com.arash.altafi.views.kotlin.progressbar1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_progress_bar_kotlin1.*

class ProgressBarKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar_kotlin1)

        progress_1_view_kotlin.setProgressValues(70, 50, 90)
        val outerColor = ArrayList<Int>()
        outerColor.add(Color.parseColor("#fbab00"))
        outerColor.add(Color.parseColor("#f5004b"))
        progress_1_view_kotlin.setOuterProgressColor(outerColor)


        val innerColor = ArrayList<Int>()
        innerColor.add(Color.parseColor("#5eb3fc"))
        innerColor.add(Color.parseColor("#28007d"))
        progress_1_view_kotlin.setInnerProgressColor(innerColor)

        val centerColor = ArrayList<Int>()
        centerColor.add(Color.parseColor("#3affaa"))
        centerColor.add(Color.parseColor("#1b93ff"))
        progress_1_view_kotlin.setCenterProgressColor(centerColor)

    }
}