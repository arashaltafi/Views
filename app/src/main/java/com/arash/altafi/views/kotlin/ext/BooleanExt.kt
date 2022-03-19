package com.arash.altafi.views.kotlin.ext

fun Boolean.toInt(): Int {
    return if (this) 1 else 0
}