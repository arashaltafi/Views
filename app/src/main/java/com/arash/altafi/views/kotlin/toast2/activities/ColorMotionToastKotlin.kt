package com.arash.altafi.views.kotlin.toast2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_color_motion_toast_kotlin.*
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class ColorMotionToastKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_motion_toast_kotlin)

        init()
    }

    private fun init() {

        btn_color_motion_toast_success_toast_2_kotlin.setOnClickListener {

            MotionToast.createColorToast(this,
                "Upload Completed!",
                "Success Message",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

        btn_color_motion_toast_error_toast_2_kotlin.setOnClickListener {

            MotionToast.createColorToast(this,
                "Profile Update Failed!",
                "Error Message",
                MotionToastStyle.ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

        btn_color_motion_toast_warning_toast_2_kotlin.setOnClickListener {

            MotionToast.createColorToast(this,
                "Please fill all the details!",
                "Warning Message",
                MotionToastStyle.WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

        btn_color_motion_toast_info_toast_2_kotlin.setOnClickListener {

            MotionToast.createColorToast(this,
                "This is information toast!",
                "Info Message",
                MotionToastStyle.INFO,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

        btn_color_motion_toast_delete_toast_2_kotlin.setOnClickListener {

            MotionToast.createColorToast(this,
                "Delete all history!",
                "Delete Message",
                MotionToastStyle.DELETE,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

    }

}