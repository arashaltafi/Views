package com.arash.altafi.views.kotlin.popupwindow1.ui.highlight

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.toColorInt
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.arash.altafi.views.R
import com.hyy.highlightpro.HighlightPro
import com.hyy.highlightpro.parameter.Constraints
import com.hyy.highlightpro.parameter.HighlightParameter
import com.hyy.highlightpro.parameter.MarginOffset
import com.hyy.highlightpro.shape.CircleShape
import com.hyy.highlightpro.shape.OvalShape
import com.hyy.highlightpro.shape.RectShape
import com.hyy.highlightpro.util.dp
import com.arash.altafi.views.kotlin.popupwindow1.ui.util.AnimUtil
import com.arash.altafi.views.kotlin.popupwindow1.ui.util.PaintUtils

class HighlightMoreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_more_highlighting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

    }

    private fun initView() {
        Handler(Looper.myLooper()!!).postDelayed({
            showHighlightSteps()
        }, 500)
    }

    private fun showHighlightSteps() {
        HighlightPro.with(this)
            .setHighlightParameter {
                HighlightParameter.Builder()
                    .setHighlightViewId(R.id.btn_step_first)
                    .setTipsViewId(R.layout.guide_step_first)
                    .setHighlightShape(RectShape(4f.dp, 4f.dp, 6f))
                    .setHighlightHorizontalPadding(8f.dp)
                    .setConstraints(Constraints.StartToEndOfHighlight + Constraints.TopToTopOfHighlight)
                    .setMarginOffset(MarginOffset(start = 8.dp))
                    .setTipViewDisplayAnimation(AnimUtil.getScaleAnimation())
                    .build()
            }
            .setHighlightParameter {
                HighlightParameter.Builder()
                    .setHighlightViewId(R.id.btn_step_second)
                    .setTipsViewId(R.layout.guide_step_second)
                    .setHighlightShape(CircleShape().apply { setPaint(PaintUtils.getDashPaint()) })
                    .setHighlightHorizontalPadding(20f.dp)
                    .setHighlightVerticalPadding(20f.dp)
                    .setConstraints(Constraints.TopToBottomOfHighlight + Constraints.EndToEndOfHighlight)
                    .setMarginOffset(MarginOffset(top = 8.dp))
                    .setTipViewDisplayAnimation(AnimUtil.getScaleAnimation())
                    .build()
            }
            .setHighlightParameter {
                HighlightParameter.Builder()
                    .setHighlightViewId(R.id.btn_step_third)
                    .setTipsViewId(R.layout.guide_step_third)
                    .setHighlightShape(OvalShape())
                    .setHighlightHorizontalPadding(12f.dp)
                    .setHighlightVerticalPadding(12f.dp)
                    .setConstraints(Constraints.BottomToTopOfHighlight + Constraints.EndToEndOfHighlight)
                    .setMarginOffset(MarginOffset(bottom = 6.dp))
                    .setTipViewDisplayAnimation(AnimUtil.getScaleAnimation())
                    .build()
            }
            .setBackgroundColor("#80000000".toColorInt())
            .setOnShowCallback { index ->
                //do something
            }
            .setOnDismissCallback {
                //do something
            }
            .interceptBackPressed(true)
            .show()
    }

    companion object {
        const val TAG = "HYY-HighlightGuideFragment"

        fun create(): HighlightMoreFragment {
            return HighlightMoreFragment().apply {
                arguments = bundleOf(

                )
            }
        }
    }

}