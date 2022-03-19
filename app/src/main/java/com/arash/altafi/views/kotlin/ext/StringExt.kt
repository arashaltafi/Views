package com.arash.altafi.views.kotlin.ext

import android.text.Html
import okhttp3.RequestBody
import java.util.*
import kotlin.math.abs

fun String.applyValue(vararg args: Any?): String {
    return String.format(Locale.US, this, *args)
}

fun String.removeHtml(): String =
    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
        Html.fromHtml(this, Html.FROM_HTML_MODE_COMPACT).toString()
    } else {
        Html.fromHtml(this).toString()
    }

fun String.getAbstract(length: Int = 200): String {
    val pureString = this.removeHtml()
    pureString.substring(if (pureString.length < length) pureString.length else length)
    return pureString.replace("\n\r", " ").replace("\n", " ")
}

fun String.toIntHash(): Int {
    /*
    *    algorithm (hashCode + reverse.hashCode / length) % int32.max
    */

    if (length == 0)
        return 0

    return abs(
        (hashCode() + reversed().hashCode())
                / (length * 2)
    ) % Int.MAX_VALUE
}

fun String.getDecodedUnicode(): String {
    var escaped = this
    if (escaped.indexOf("\\u") == -1) return escaped
    var processed = ""
    var position = escaped.indexOf("\\u")
    while (position != -1) {
        if (position != 0) processed += escaped.substring(0, position)
        val token = escaped.substring(position + 2, position + 6)
        escaped = escaped.substring(position + 6)
        processed += token.toInt(16).toChar()
        position = escaped.indexOf("\\u")
    }
    processed += escaped
    return processed
}