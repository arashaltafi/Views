package com.arash.altafi.views.kotlin.ext

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.view.View
import android.view.ViewAnimationUtils
import kotlin.math.hypot

enum class RevealModel {
    START,
    CENTER,
    END
}

fun View.reveal(
    duration: Long, model: RevealModel,
    endListener: (() -> Unit)? = null
) {
    val cxF = when (model) {
        RevealModel.START -> width
        RevealModel.CENTER -> width / 2
        else -> 0
    }

    val cyF = height / 2

    val radius = hypot(width.toDouble(), height.toDouble()).toFloat()

    ViewAnimationUtils.createCircularReveal(
        this, cxF, cyF, 0f, radius
    ).apply {
        setDuration(duration)
        addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationStart(animation: Animator?) {
                super.onAnimationStart(animation)
                toShow()
            }

            override fun onAnimationEnd(animation: Animator?) {
                super.onAnimationEnd(animation)
                enable()
                endListener?.invoke()
            }
        })
    }.start()
}

fun View.unReveal(
    duration: Long, model: RevealModel,
    endListener: (() -> Unit)? = null
) {

    val cxF = when (model) {
        RevealModel.START -> right
        RevealModel.CENTER -> width / 2
        else -> left
    }

    val cyF = height / 2

    val radius = hypot(width.toDouble(), height.toDouble()).toFloat()

    ViewAnimationUtils.createCircularReveal(
        this, cxF, cyF, radius, 0f
    ).apply {
        setDuration(duration)
        addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationStart(animation: Animator?) {
                super.onAnimationStart(animation)
                disable()
            }

            override fun onAnimationEnd(animation: Animator?) {
                super.onAnimationEnd(animation)
                toHide()
                endListener?.invoke()
            }
        })
    }.start()
}