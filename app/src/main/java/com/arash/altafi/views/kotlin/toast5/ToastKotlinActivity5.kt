package com.arash.altafi.views.kotlin.toast5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_toast_kotlin5.*

class ToastKotlinActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_kotlin5)

        init()
    }

    private fun init() {
        btnCustomToastWithIcon.setOnClickListener {
            toastCustom("This is a Test", R.drawable.confirm)
        }

        btnCustomToastWithoutIcon.setOnClickListener {
            toastCustom("This is a Test")
        }
    }

}