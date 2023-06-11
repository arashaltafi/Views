package com.arash.altafi.views.kotlin.toast2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_motion_toast_kotlin.*
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class MotionToastKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_toast_kotlin)

        init()
    }

    private fun init() {

        btn_motion_toast_success_toast_2_kotlin.setOnClickListener {

            MotionToast.createToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

        btn_motion_toast_error_toast_2_kotlin.setOnClickListener {

            MotionToast.createToast(this,
                "Failed ☹️",
                "Profile Update Failed!",
                MotionToastStyle.ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

        btn_motion_toast_warning_toast_2_kotlin.setOnClickListener {

            MotionToast.createToast(this,
                "Please fill all the details!",
                "Warning message",
                MotionToastStyle.WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))

        }

        btn_motion_toast_info_toast_2_kotlin.setOnClickListener {

            MotionToast.createToast(
                this,
                "This is information toast!",
                "info message",
                MotionToastStyle.INFO,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))


        }

        btn_motion_toast_delete_toast_2_kotlin.setOnClickListener {

            MotionToast.createToast(this,
                "Delete all history!",
                "delete message",
                MotionToastStyle.DELETE,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.vazir))


        }

    }

}