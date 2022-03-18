package com.arash.altafi.views.kotlin.popupwindow1.ui.util

import android.view.animation.Animation
import android.view.animation.BounceInterpolator
import android.view.animation.ScaleAnimation


object AnimUtil {
    fun getScaleAnimation(): Animation {
        val scaleAnimator = ScaleAnimation(
            0.5f,
            1f,
            0.5f,
            1f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        scaleAnimator.duration = 500
        scaleAnimator.interpolator = BounceInterpolator()
        return scaleAnimator
    }

}