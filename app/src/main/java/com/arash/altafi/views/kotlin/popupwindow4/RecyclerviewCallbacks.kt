package com.arash.altafi.views.kotlin.popupwindow4

import android.view.View

interface RecyclerviewCallbacks<T> {

    fun onItemClick(view: View, position: Int, item: T)

}