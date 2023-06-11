package com.arash.altafi.views.kotlin.toast2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_dark_color_motion_toast_kotlin.*
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class DarkColorMotionToastKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dark_color_motion_toast_kotlin)

        init()
    }

    private fun init() {

        btn_dark_color_motion_toast_success_toast_2_kotlin.setOnClickListener {

            MotionToast.darkColorToast(this,
                "Upload Completed!",
                "Success Message",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

        btn_dark_color_motion_toast_error_toast_2_kotlin.setOnClickListener {

            MotionToast.darkColorToast(this,
                "Profile Update Failed!",
                "Error Message",
                MotionToastStyle.ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

        btn_dark_color_motion_toast_warning_toast_2_kotlin.setOnClickListener {

            MotionToast.darkColorToast(this,
                "Please fill all the details!",
                "Warning Message",
                MotionToastStyle.WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

        btn_dark_color_motion_toast_info_toast_2_kotlin.setOnClickListener {

            MotionToast.darkColorToast(this,
                "This is information toast!",
                "Info Message",
                MotionToastStyle.INFO,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

        btn_dark_color_motion_toast_delete_toast_2_kotlin.setOnClickListener {

            MotionToast.darkColorToast(this,
                "Delete all history!",
                "Delete Message",
                MotionToastStyle.DELETE,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

    }

}