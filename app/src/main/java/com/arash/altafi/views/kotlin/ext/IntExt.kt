package com.arash.altafi.views.kotlin.ext

import android.graphics.Color
import androidx.annotation.ColorInt


fun Int.toHexColor(): String {
    return "#" + Integer.toHexString(this).substring(2)
}

fun Int.toBoolean(): Boolean {
    return this == 1
}

@ColorInt
fun Int.withAlpha(alpha: Float): Int {
    var alphaa: Int = Color.alpha(this)
    val red: Int = Color.red(this)
    val green: Int = Color.green(this)
    val blue: Int = Color.blue(this)

    alphaa = (alpha * alphaa).toInt()

    return Color.argb(alphaa, red, green, blue)
}