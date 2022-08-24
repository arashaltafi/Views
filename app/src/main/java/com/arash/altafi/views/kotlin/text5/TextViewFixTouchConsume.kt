package com.arash.altafi.views.kotlin.text5

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import com.google.android.material.textview.MaterialTextView

class TextViewFixTouchConsume : MaterialTextView {

    var useLinkHitResult = true
    var linkHit = false

    constructor(context: Context) : super(context) {}
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context, attrs: AttributeSet?, defStyle: Int)
            : super(context, attrs, defStyle) {
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        linkHit = false
        val res = super.onTouchEvent(event)
        return if (useLinkHitResult) linkHit else res
    }

}