package com.arash.altafi.views.kotlin.unique

fun Any.getHashLong(): Long {
    return this.hashCode().toLong()
}

fun Any.getHashInt(): Int {
    return this.hashCode()
}