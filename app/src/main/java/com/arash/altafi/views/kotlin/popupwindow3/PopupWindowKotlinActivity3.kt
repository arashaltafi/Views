package com.arash.altafi.views.kotlin.popupwindow3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_popup_window_kotlin3.*

class PopupWindowKotlinActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_window_kotlin3)

        init()
    }

    private fun init() {
        btn_success_popup_3_kotlin.setOnClickListener {
            popSuccess("تست متن موفقیت آمیز")
        }

        btn_error_popup_3_kotlin.setOnClickListener {
            popError("تست متن خطا")
        }
    }

}