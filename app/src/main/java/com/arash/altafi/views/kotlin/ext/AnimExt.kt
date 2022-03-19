package com.arash.altafi.views.kotlin.ext

import android.animation.Animator
import android.view.View
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo

fun View.shakeError(listener: Animator.AnimatorListener? = null) {
    YoYo.with(Techniques.Shake)
        .duration(500)
        .repeat(0)
        .apply {
            if (listener != null)
                withListener(listener)
        }
        .playOn(this)
}