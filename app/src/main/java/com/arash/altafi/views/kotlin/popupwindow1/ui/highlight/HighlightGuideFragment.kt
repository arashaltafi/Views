package com.arash.altafi.views.kotlin.popupwindow1.ui.highlight

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.BounceInterpolator
import android.view.animation.TranslateAnimation
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.arash.altafi.views.R
import com.hyy.highlightpro.HighlightPro
import com.hyy.highlightpro.parameter.Constraints
import com.hyy.highlightpro.parameter.HighlightParameter
import com.hyy.highlightpro.parameter.MarginOffset
import com.hyy.highlightpro.shape.RectShape
import com.hyy.highlightpro.util.dp
import kotlinx.android.synthetic.main.fragment_highlight.*

class HighlightGuideFragment : Fragment() {

    private var verticalCheckId: Int = R.id.top_to_bottom
    private var horizontalCheckId: Int = R.id.end_to_end


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_highlight, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

    }

    private fun initView() {
        constrains_vertical.addOnButtonCheckedListener { group, checkedId, isChecked ->
            if (isChecked) {
                verticalCheckId = checkedId
            }
        }
        constraints_horizontal.addOnButtonCheckedListener { group, checkedId, isChecked ->
            if (isChecked) {
                horizontalCheckId = checkedId
            }
        }
        btn_show_highlight.setOnClickListener {
            showHighlight()
        }
    }

    private fun showHighlight() {
        //tipview animation
        val translateAnimation = TranslateAnimation(-500f,0f,0f,0f)
        translateAnimation.duration = 500
        translateAnimation.interpolator = BounceInterpolator()

        HighlightPro.with(this)
            .setHighlightParameter {
                HighlightParameter.Builder()
                    .setHighlightViewId(R.id.btn_hello_world)
                    .setTipsViewId(R.layout.guide_tips_layout)
                    .setHighlightShape(RectShape(4f.dp, 4f.dp, 6f))
                    .setHighlightHorizontalPadding(8f.dp)
                    .setConstraints(getConstraints())
                    .setMarginOffset(MarginOffset(4.dp, 4.dp, 4.dp, 4.dp))
                    .setTipViewDisplayAnimation(translateAnimation)
                    .build()
            }
            .interceptBackPressed(true)
            .show()
    }

    private fun getConstraints(): List<Constraints> =
        getVerticalConstraint() + geHorizontalConstraint()

    private fun getVerticalConstraint() = when (verticalCheckId) {
        R.id.top_to_top -> Constraints.TopToTopOfHighlight
        R.id.top_to_bottom -> Constraints.TopToBottomOfHighlight
        R.id.bottom_to_bottom -> Constraints.BottomToBottomOfHighlight
        else -> Constraints.BottomToTopOfHighlight
    }

    private fun geHorizontalConstraint() = when (horizontalCheckId) {
        R.id.start_to_start -> Constraints.StartToStartOfHighlight
        R.id.start_to_end -> Constraints.StartToEndOfHighlight
        R.id.end_to_end -> Constraints.EndToEndOfHighlight
        else -> Constraints.EndToStartOfHighlight
    }

    companion object {
        const val TAG = "HYY-HighlightGuideFragment"

        fun create(): HighlightGuideFragment {
            return HighlightGuideFragment().apply {
                arguments = bundleOf(

                )
            }
        }
    }

}