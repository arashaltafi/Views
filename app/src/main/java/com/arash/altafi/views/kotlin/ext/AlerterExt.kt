package com.arash.altafi.views.kotlin.ext

import android.view.Gravity
import com.arash.altafi.views.R
import com.tapadoo.alerter.Alerter

fun Alerter.default(
    duration: Long = 3000,
    gravity: Int
): Alerter {
    if (gravity == Gravity.BOTTOM)
        bottom() else top()

    enableIconPulse(false)
    enableClickAnimation(false)
    setDuration(duration)
    return this
}

fun Alerter.top(): Alerter {
    setLayoutGravity(Gravity.TOP)
//    setEnterAnimation(R.anim.slide_up)// FIXME: 6/22/2021 animation has issue
//    setExitAnimation(R.anim.slide_down)// FIXME: 6/22/2021 default animations is good :)
    return this
}

fun Alerter.bottom(): Alerter {
    setLayoutGravity(Gravity.BOTTOM)
    setEnterAnimation(R.anim.slide_fade_in_bottom)
    setExitAnimation(R.anim.slide_fade_out_bottom)
    return this
}

fun Alerter.error(): Alerter {
    setBackgroundResource(R.drawable.bg_alert_error)
    setIcon(R.drawable.ic_error)

    return this
}

fun Alerter.success(): Alerter {
    setBackgroundResource(R.drawable.bg_alert_success)
//    setBackgroundColorInt(Color.BLUE)
    setIcon(R.drawable.ic_success)
    return this
}

fun Alerter.info(): Alerter {
    setBackgroundResource(R.drawable.bg_alert_info)
    setIcon(R.drawable.ic_info)

    return this
}

fun Alerter.loading(): Alerter {
    showIcon(false)
    enableInfiniteDuration(true)
    enableProgress(true)
    return this
}
