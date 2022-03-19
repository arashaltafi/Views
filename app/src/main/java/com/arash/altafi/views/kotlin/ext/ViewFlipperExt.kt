package com.arash.altafi.views.kotlin.ext

import android.widget.ViewFlipper

fun ViewFlipper.go(index: Int) {
    this.displayedChild = index
}