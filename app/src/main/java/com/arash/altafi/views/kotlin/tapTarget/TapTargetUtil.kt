package com.arash.altafi.views.kotlin.tapTarget

import android.app.Activity
import android.view.View
import androidx.core.content.res.ResourcesCompat
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.ext.getAttrColor
import com.getkeepsafe.taptargetview.TapTarget
import com.getkeepsafe.taptargetview.TapTargetView

object TapTargetUtil {

    fun singleShow(
        activity: Activity,
        view: View?,
        title: String,
        description: String = "",
        onClick: () -> Unit
    ): TapTargetView? {
        return TapTargetView.showFor(
            activity, TapTarget.forView(view, title, description)
                .outerCircleColorInt(activity.getAttrColor(R.attr.colorBackGroundTapTarget))
                .outerCircleAlpha(0.98f)
                .targetCircleColorInt(activity.getAttrColor(R.attr.colorControlTapTarget))
                .titleTextSize(16)
                .titleTextColorInt(activity.getAttrColor(R.attr.colorControlTapTarget))
                .titleTypeface(ResourcesCompat.getFont(activity, R.font.font_medium))
                .descriptionTextSize(14)
                .descriptionTextColorInt(activity.getAttrColor(R.attr.colorControlTapTarget))
                .textColorInt(activity.getAttrColor(R.attr.colorControlTapTarget))
                .textTypeface(ResourcesCompat.getFont(activity, R.font.font_light))
                .drawShadow(true)
                .cancelable(false)
                .tintTarget(true)
                .transparentTarget(true)
                .targetRadius(20), object : TapTargetView.Listener() {
                override fun onTargetClick(view: TapTargetView) {
                    super.onTargetClick(view)
                    onClick.invoke()
                }

                override fun onOuterCircleClick(view: TapTargetView) {
                    super.onOuterCircleClick(view)
                    /*view.dismiss(true)*/
                }
            }
        )
    }

    fun multipleShowTarget(
        activity: Activity,
        view: View?,
        title: String,
        description: String,
    ): TapTarget {
        return TapTarget.forView(
            view,
            title,
            description
        )
            .outerCircleColorInt(activity.getAttrColor(R.attr.colorGlassTapTargetView))
            .outerCircleAlpha(0.9f)
            .titleTextSize(18)
            .descriptionTextSize(14)
            .descriptionTextColorInt(activity.getAttrColor(R.attr.colorControlHighlight))
            .textColorInt(activity.getAttrColor(R.attr.colorControlHighlight))
            .drawShadow(true)
            .cancelable(false)
            .tintTarget(true)
            .transparentTarget(true)
            .targetRadius(20)
    }

}