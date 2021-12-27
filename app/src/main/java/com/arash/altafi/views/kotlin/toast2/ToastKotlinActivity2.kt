package com.arash.altafi.views.kotlin.toast2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.toast2.activities.ColorMotionToastKotlin
import com.arash.altafi.views.kotlin.toast2.activities.DarkColorMotionToastKotlin
import com.arash.altafi.views.kotlin.toast2.activities.DarkMotionToastKotlin
import com.arash.altafi.views.kotlin.toast2.activities.MotionToastKotlin
import kotlinx.android.synthetic.main.activity_toast_kotlin2.*
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class ToastKotlinActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_kotlin2)

        init()
    }

    private fun init() {

        btn_motion_toast2.setOnClickListener {
            startActivity(Intent(this , MotionToastKotlin::class.java))
        }

        btn_color_motion_toast2.setOnClickListener {
            startActivity(Intent(this , ColorMotionToastKotlin::class.java))
        }

        btn_dark_toast2.setOnClickListener {
            startActivity(Intent(this , DarkMotionToastKotlin::class.java))
        }

        btn_dark_color_toast2.setOnClickListener {
            startActivity(Intent(this , DarkColorMotionToastKotlin::class.java))
        }

    }

}