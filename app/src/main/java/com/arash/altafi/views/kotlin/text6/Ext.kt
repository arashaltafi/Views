package com.arash.altafi.views.kotlin.text6

import android.content.Context
import android.text.Spannable
import android.text.SpannableString
import android.text.style.BackgroundColorSpan
import android.text.style.ForegroundColorSpan
import android.util.TypedValue
import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
import java.util.ArrayList


fun String.indexAll(
    target: String
): List<Int> {

    if (this.length < 0)
        return emptyList()

    val result = ArrayList<Int>()
    var lastSeekIndex = -1
    while (true) {
        val indexTemp = this.indexOf(target, lastSeekIndex + 1, ignoreCase = true)
        if (indexTemp < 0)
            break
        result.add(indexTemp)
        lastSeekIndex = indexTemp
        if (indexTemp >= this.length)
            break
    }
    return result
}


fun TextView.highlightAll(
    target: String,
    @ColorInt textColor: Int
) {

    val raw: Spannable = SpannableString(this.text)

    //remove background spans
    val spansBackground = raw.getSpans(
        0,
        raw.length,
        BackgroundColorSpan::class.java
    )
    for (span in spansBackground) {
        raw.removeSpan(span)
    }

    //remove foreground spans
    val spansForeground = raw.getSpans(
        0,
        raw.length,
        ForegroundColorSpan::class.java
    )
    for (span in spansForeground) {
        raw.removeSpan(span)
    }

    //set spans
    raw.toString().indexAll(target).forEach {
        raw.setSpan(
            ForegroundColorSpan(textColor),
            it,
            it + target.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }

    this.text = raw

}

fun TextView.hasEllipsize(hasEllipsize: ((Boolean) -> Unit)) {
    val layout = layout
    if (layout != null) {
        val lines: Int = layout.lineCount
        if (lines > 0) {
            val ellipsisCount = layout.getEllipsisCount(lines - 1)
            if (ellipsisCount > 0)
                hasEllipsize.invoke(true)
            else
                hasEllipsize.invoke(false)
        }
    }
}

@ColorInt
fun Context.getAttrColor(@AttrRes attrID: Int): Int {
    val typedValue = TypedValue()
    val theme = this.theme
    theme.resolveAttribute(attrID, typedValue, true)
    return typedValue.data
}

fun Context.getAttr(attrID: Int): Int {
    val typedValue = TypedValue()
    val theme = this.theme
    theme.resolveAttribute(attrID, typedValue, true)
    return typedValue.data
}

fun Context.getDrawableCompat(res: Int): VectorDrawableCompat? {
    return VectorDrawableCompat.create(resources, res, theme)
}
