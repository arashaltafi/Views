package com.arash.altafi.views.kotlin.popupwindow3


import android.app.Activity
import android.view.Gravity
import androidx.annotation.StringRes
import com.arash.altafi.views.R
import com.tapadoo.alerter.Alerter

fun Activity.popSuccess(
    @StringRes text: Int? = null,
    @StringRes title: Int? = null,
    duration: Long? = null, gravity: Int? = null
) = popSuccess(
    text?.let { getString(it) }, title?.let { getString(it) },
    duration, gravity
)

fun Activity.popError(
    @StringRes text: Int? = null,
    @StringRes title: Int? = null,
    duration: Long? = null, gravity: Int? = null
) = popError(text?.let { getString(it) }, title?.let { getString(it) },
    duration, gravity
)

fun Activity.popLoading(
    @StringRes text: Int? = null,
    @StringRes title: Int? = null,
    duration: Long? = null, gravity: Int? = null
) = popLoading(text?.let { getString(it) }, title?.let { getString(it) },
    duration, gravity
)

fun Activity.popLoading(
    text: String? = null,
    title: String? = null,
    duration: Long? = null, gravity: Int? = null
) = popMessage(
    text, title, duration, gravity
).apply { loading() }.show()

fun Activity.popSuccess(
    text: String? = null,
    title: String? = null,
    duration: Long? = null, gravity: Int? = null
) = popMessage(
    text, title, duration, gravity
).apply { success() }.show()

fun Activity.popError(
    text: String? = null,
    title: String? = null,
    duration: Long? = null, gravity: Int? = null
) = popMessage(
    text, title, duration, gravity
).apply { error() }.show()

private fun Activity.popMessage(
    text: String? = null, title: String? = null,
    duration: Long? = null, gravity: Int? = null
): Alerter {
    return Alerter.create(this).apply {
        default(duration ?: 3000, gravity ?: Gravity.BOTTOM)
        title?.let { setTitle(it) }
        text?.let { setText(it) }
    }
}

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

fun Alerter.bottom(): Alerter {
    setLayoutGravity(Gravity.BOTTOM)
    setEnterAnimation(R.anim.slide_fade_in_bottom)
    setExitAnimation(R.anim.slide_fade_out_bottom)
    return this
}

fun Alerter.top(): Alerter {
    setLayoutGravity(Gravity.TOP)
//    setEnterAnimation(R.anim.slide_up)// FIXME: 6/22/2021 animation has issue
//    setExitAnimation(R.anim.slide_down)// FIXME: 6/22/2021 default animations is good :)
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