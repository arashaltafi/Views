package com.arash.altafi.views.kotlin.ext

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.ScrollView
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment

fun Fragment.popSuccess(
    @StringRes text: Int? = null,
    @StringRes title: Int? = null,
    duration: Long? = null, gravity: Int? = null
) = popSuccess(text?.let { getString(it) }, title?.let { getString(it) },
    duration, gravity
)

fun Fragment.popError(
    @StringRes text: Int? = null, @StringRes title: Int? = null,
    duration: Long? = null, gravity: Int? = null
) = popError(text?.let { getString(it) }, title?.let { getString(it) },
    duration, gravity
)

fun Fragment.popLoading(
    @StringRes text: Int? = null, @StringRes title: Int? = null,
    duration: Long? = null, gravity: Int? = null
) = popLoading(text?.let { getString(it) }, title?.let { getString(it) },
    duration, gravity
)

fun Fragment.popSuccess(
    text: String? = null,
    title: String? = null,
    duration: Long? = null, gravity: Int? = null
) = requireActivity().popSuccess(text, title, duration, gravity)

fun Fragment.popError(
    text: String? = null, title: String? = null,
    duration: Long? = null, gravity: Int? = null
) = requireActivity().popError(text, title, duration, gravity)

fun Fragment.popLoading(
    text: String? = null, title: String? = null,
    duration: Long? = null, gravity: Int? = null
) = requireActivity().popLoading(text, title, duration, gravity)

fun Fragment.toast(msg: String) {
    requireContext().toast(msg)
}

private fun showItem(
    @LayoutRes layout: Int,
    rootView: View?,
    layoutInflater: LayoutInflater,
    toShow: Boolean,
    isMatchParent: Boolean = false
) {
    rootView?.cast<ViewGroup>()?.apply {
        val viewLayout = layoutInflater.inflate(layout, null)
        if (isMatchParent)
            viewLayout.setBackgroundColor(context.getAttrColor(android.R.attr.colorBackground))

        if (toShow) {
            val isAdded = addToCenter(this, viewLayout, isMatchParent)
            if (isAdded.not()) {
                "error show".logE("addView")
                throw Exception("should run on \'ConstraintLayout\' or \'RelativeLayout\' or \'ScrollView\' or \'CoordinatorLayout\'")
            }
        } else {
            this.cast<ViewGroup>()?.findViewWithTag<View>(viewLayout.tag)?.toGone()
        }

    }
}

private fun addToCenter(rootView: View, newView: View, isMatchParent: Boolean = false): Boolean =
    when (rootView) {
        is ConstraintLayout -> {
            rootView.addToCenter(newView, isMatchParent)
            true
        }
        is RelativeLayout -> {
            rootView.addToCenter(newView, isMatchParent)
            true
        }
        is CoordinatorLayout -> {
            rootView.addToCenter(newView, isMatchParent)
            true
        }
        is ScrollView -> {
            rootView.addToCenter(newView, isMatchParent)
            true
        }
        is NestedScrollView -> {
            rootView.addToCenter(newView, isMatchParent)
            true
        }
        else -> {
            false
        }
    }
