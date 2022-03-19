package com.arash.altafi.views.kotlin.ext

fun Boolean?.orFalse(): Boolean {
    return this ?: false
}