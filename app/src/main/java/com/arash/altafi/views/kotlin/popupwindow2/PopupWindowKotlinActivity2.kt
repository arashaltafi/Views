package com.arash.altafi.views.kotlin.popupwindow2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.ext.toast
import kotlinx.android.synthetic.main.activity_popup_window_kotlin2.*

class PopupWindowKotlinActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_window_kotlin2)

        init()
    }

    private fun init() {
        btnPopUp.setOnClickListener {
            popupWindow(it)
        }
    }

    private fun popupWindow(view: View) {
        PopupUtil.showPopup(
            view,
            listOf(
                PopupUtil.PopupItem(
                    R.drawable.cancel,
                    getString(R.string.cancel)
                ) {
                    toast(getString(R.string.cancel))
                },
                PopupUtil.PopupItem(
                    R.drawable.confirm,
                    getString(R.string.ok)
                ) {
                    toast(getString(R.string.ok))
                }
            ),
            Gravity.BOTTOM.or(Gravity.END),
            setTint = false
        )
    }
}