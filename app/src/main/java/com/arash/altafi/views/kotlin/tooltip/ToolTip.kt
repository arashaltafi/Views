package com.arash.altafi.views.kotlin.tooltip

import android.view.Gravity
import android.view.View
import androidx.core.content.ContextCompat
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.ext.getAttrColor
import com.arash.altafi.views.kotlin.ext.isDarkTheme
import io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip

object ToolTip {

    fun setToolTip(view: View, title: String, gravity: Int = Gravity.TOP) {
        SimpleTooltip.Builder(view.context)
            .anchorView(view)
            .text(title)
            .gravity(gravity)
            .animated(true)
            .focusable(true)
            .modal(true)
            .transparentOverlay(false)
            .dismissOnOutsideTouch(true)
            .dismissOnInsideTouch(true)
            .onDismissListener { it.dismiss() }
            .arrowColor(view.context.getAttrColor(R.attr.arrowColor))
            .backgroundColor(view.context.getAttrColor(R.attr.arrowColor))
            .textColor(
                if(view.context.isDarkTheme()) ContextCompat.getColor(view.context, R.color.gray)
                else ContextCompat.getColor(view.context, R.color.dark)
            )
            .build()
            .show()
    }

}