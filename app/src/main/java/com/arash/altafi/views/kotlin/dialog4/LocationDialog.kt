package com.arash.altafi.views.kotlin.dialog4

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import com.arash.altafi.views.R
import com.arash.altafi.views.databinding.DialogLocationBinding
import com.arash.altafi.views.kotlin.ext.runAfter

class LocationDialog(
    private val mContext: Context
) :
    BaseDialog<DialogLocationBinding>(mContext, R.style.location) {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> DialogLocationBinding
        get() = DialogLocationBinding::inflate

    private var dismissTimer: Long = -1
    var onClickListenerDialogCancel: (() -> Unit)? = null

    override fun viewHandler(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            tvCancel.setOnClickListener {
                onClickListenerDialogCancel?.invoke()
                dismiss()
            }
        }
    }

    fun show(dimBehind: Boolean, cancelable: Boolean = false) {
        window?.apply {
            setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            if (dimBehind.not()) {
                clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            }

            setFlags(
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
            )
            setFlags(
                WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
                WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH
            )
        }

        setCancelable(cancelable)
        setCanceledOnTouchOutside(cancelable)

        dismissTimer = TimeUtils.getCurrentMillis()

        super.show()
    }

    override fun show() {
        show(true, cancelable = false)
    }

    override fun dismiss() {
        val timeDifference = TimeUtils.getCurrentMillis() - dismissTimer
        if (
            dismissTimer > 0 && timeDifference >= 500L
        ) {
            super.dismiss()
        } else {
            runAfter(timeDifference, {
                super.dismiss()
            })
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return when (event.action) {
            MotionEvent.ACTION_OUTSIDE -> {
                true
            }
            else -> {
                super.onTouchEvent(event)
            }
        }
    }
}