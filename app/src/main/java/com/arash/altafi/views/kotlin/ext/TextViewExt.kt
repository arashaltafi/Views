package com.arash.altafi.views.kotlin.ext

import android.annotation.TargetApi
import android.os.Build
import android.view.View
import android.widget.TextView

fun TextView.clear() {
    this.text = ""
}

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
fun TextView.setDrawable(
    start: Int = 0, end: Int = 0,
    top: Int = 0, bottom: Int = 0
) {
    this.setCompoundDrawablesRelativeWithIntrinsicBounds(
        start, top,
        end, bottom
    )
}

fun TextView.setDrawableStart(res: Int) {
    this.setCompoundDrawablesRelativeWithIntrinsicBounds(
        res, 0,
        0, 0
    )
}

fun TextView.setDrawableEnd(res: Int) {
    this.setCompoundDrawablesRelativeWithIntrinsicBounds(
        0, 0,
        res, 0
    )
}

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
fun TextView.toggleText(minLine: Int) {
    maxLines = if (maxLines == minLine) {
        lineCount
    } else {
        minLine
    }
}

fun TextView.setTextOrGone(text: String, alsoGone: View? = null) {
    if (text.isEmpty()) {
        alsoGone?.toGone()
        this.toGone()
    } else
        this.text = text
}

fun TextView.addColon(withSpace: Boolean = false) {
    if (text.endsWith(":").not())
        if (withSpace)
            this.text = "%s :".applyValue(text)
        else
            this.text = "%s:".applyValue(text)
}