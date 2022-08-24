package com.arash.altafi.views.kotlin.text5

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LinkData(
    val text: String,
    val type: LinkTypes,
) : Parcelable