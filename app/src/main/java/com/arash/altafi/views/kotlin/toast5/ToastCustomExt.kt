package com.arash.altafi.views.kotlin.toast5

import android.app.Activity
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.annotation.DrawableRes
import com.arash.altafi.views.databinding.LayoutToastBinding
import com.arash.altafi.views.kotlin.ext.setDrawable

/**
 * only use it when application is in foreground
 *
 * @param theView: to show up of the view
 */
fun Activity.toastCustom(text: String, @DrawableRes icon: Int? = null, theView: View? = null) {
    val viewBinding = LayoutToastBinding.inflate(LayoutInflater.from(this)).apply {
        tv.text = text
        icon?.let {
            tv.setDrawable(icon, 0, 0, 0)
        }
    }

    Toast(this).apply {

        theView?.let {
            val absoluteLocation = IntArray(2)
            theView.getLocationInWindow(absoluteLocation)
            setGravity(Gravity.BOTTOM or Gravity.FILL_HORIZONTAL, 0, 200)
        } ?: run {
            setGravity(Gravity.BOTTOM or Gravity.FILL_HORIZONTAL, 0, 200)
        }

        view = viewBinding.root
        duration = Toast.LENGTH_SHORT
        show()
    }
}