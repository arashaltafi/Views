package com.arash.altafi.views.kotlin.toast4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupWindow
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_toast_kotlin4.*

class ToastKotlinActivity4 : AppCompatActivity() {

    private var popupWindow: PopupWindow? = null
    private val popupWindowView: View by lazy {
        layoutInflater.inflate(R.layout.item_toast_4, null)
    }
    private val autoHideHandler: Handler by lazy {
        Handler(Looper.myLooper()!!)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_kotlin4)

        init()
    }

    private fun init() {
        btn_success_toast4.setOnClickListener {
            showPopupMessage("Hello world", MessageType.SUCCESS)
        }
        btn_error_toast4.setOnClickListener {
            showPopupMessage("Hello world", MessageType.ERROR, true)
        }
        btn_warning_toast4.setOnClickListener {
            showPopupMessage("Hello world", MessageType.WARNING)
        }
    }

    private fun showPopupMessage(message: String, messageType: MessageType, autoHide: Boolean = false) {
        if (popupWindow == null) {
            popupWindow = PopupWindow(popupWindowView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true)
        }
        setupPopupWindow(popupWindowView, message, messageType)
        popupWindow?.showAtLocation(popupWindowView, Gravity.TOP, 0, 250)
        if (autoHide) {
            autoHideHandler.removeCallbacksAndMessages(null)
            autoHideHandler.postDelayed({
                popupWindow?.dismiss()
            }, 2000)
        }
    }

    private fun setupPopupWindow(popupWindowView: View, message: String, messageType: MessageType) {
        val backgroundView = popupWindowView.findViewById<ConstraintLayout>(R.id.messagePopupWindowLayout)
        val iconView = popupWindowView.findViewById<ImageView>(R.id.imgError)
        val messageView = popupWindowView.findViewById<TextView>(R.id.tvMessage)
        messageView.text = message

        when (messageType) {
            MessageType.ERROR -> {
                backgroundView.setBackgroundColor(ContextCompat.getColor(this, R.color.light_red))
                iconView.background = ContextCompat.getDrawable(this, R.drawable.ic_baseline_error_24)
            }
            MessageType.SUCCESS -> {
                backgroundView.setBackgroundColor(ContextCompat.getColor(this, R.color.light_green))
                iconView.background = ContextCompat.getDrawable(this, R.drawable.ic_baseline_check_circle_24)
            }
            MessageType.WARNING -> {
                backgroundView.setBackgroundColor(ContextCompat.getColor(this, R.color.light_yellow))
                iconView.background = ContextCompat.getDrawable(this, R.drawable.ic_round_warning_24)
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        popupWindow?.let {
            popupWindow = null
        }
    }

    enum class MessageType {
        ERROR, SUCCESS, WARNING
    }

}