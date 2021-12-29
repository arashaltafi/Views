package com.arash.altafi.views.kotlin.triangleLabelView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_triangle_label_view_kotlin1.*

class TriangleLabelViewKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle_label_view_kotlin1)

        init()
    }

    private fun init() {

        label.secondaryText = "85" + "%"

    }

}