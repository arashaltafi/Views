package com.arash.altafi.views.kotlin.ext

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.Gravity
import androidx.annotation.StringRes
import com.tapadoo.alerter.Alerter
/**
 * @param launcher: usually start activity
 */
fun <T> Activity.restartApp(launcher: Class<T>, bundle: Bundle? = null) {
    Intent(this, launcher).apply {
        bundle?.let {
            putExtras(it)
        }
        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(this)
    }

    finish()
    Runtime.getRuntime().exit(0)
}

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

fun Activity.popLoading(
    text: String? = null,
    title: String? = null,
    duration: Long? = null, gravity: Int? = null
) = popMessage(
    text, title, duration, gravity
).apply { loading() }.show()

private fun Activity.popMessage(
    text: String? = null, title: String? = null,
    duration: Long? = null, gravity: Int? = null
): Alerter {
    ("$text\n$title").logE("popMessage")

    return Alerter.create(this).apply {
        default(duration ?: 3000, gravity ?: Gravity.BOTTOM)
        title?.let { setTitle(it) }
        text?.let { setText(it) }
    }
}

fun Activity.isDarkTheme(): Boolean {
    return this.resources.configuration.uiMode and
            Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES
}