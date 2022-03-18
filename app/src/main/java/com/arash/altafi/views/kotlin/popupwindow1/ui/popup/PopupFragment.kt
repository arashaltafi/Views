package com.arash.altafi.views.kotlin.popupwindow1.ui.popup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.arash.altafi.views.R
import com.hyy.highlightpro.HighlightPro
import com.hyy.highlightpro.parameter.Constraints
import com.hyy.highlightpro.parameter.HighlightParameter
import com.hyy.highlightpro.parameter.MarginOffset
import com.hyy.highlightpro.util.dp
import kotlinx.android.synthetic.main.fragment_popup.*

class PopupFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_popup, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

    }

    private fun initView() {
        btn_tips_bottom.setOnClickListener {
            showPopupWindowBottom()
        }
        btn_tips_top.setOnClickListener {
            showPopupWindowTop()
        }
        btn_tips_left.setOnClickListener {
            showPopupWindowLeft()
        }
        btn_tips_right.setOnClickListener {
            showPopupWindowRight()
        }
    }

    private fun showPopupWindowBottom() {
        HighlightPro.with(this)
            .setHighlightParameter {
                HighlightParameter.Builder()
                    .setHighlightViewId(R.id.btn_tips_bottom)
                    .setTipsViewId(R.layout.pop_tips_layout_bottom)
                    .setConstraints(Constraints.TopToBottomOfHighlight + Constraints.EndToEndOfHighlight)
                    .setMarginOffset(MarginOffset(end = (-2).dp))
                    .build()
            }
            .enableHighlight(false)//no highlight now is a popup window
            .interceptBackPressed(true)
            .show()
    }

    private fun showPopupWindowTop() {
        HighlightPro.with(this)
            .setHighlightParameter {
                HighlightParameter.Builder()
                    .setHighlightViewId(R.id.btn_tips_top)
                    .setTipsViewId(R.layout.pop_tips_layout_top)
                    .setConstraints(Constraints.BottomToTopOfHighlight + Constraints.EndToEndOfHighlight)
                    .setMarginOffset(MarginOffset(end = (-2).dp))
                    .build()
            }
            .enableHighlight(false)//no highlight now is a popup window
            .interceptBackPressed(true)
            .show()
    }

    private fun showPopupWindowLeft() {
        HighlightPro.with(this)
            .setHighlightParameter {
                HighlightParameter.Builder()
                    .setHighlightViewId(R.id.btn_tips_left)
                    .setTipsViewId(R.layout.pop_tips_layout_left)
                    .setConstraints(Constraints.EndToStartOfHighlight + Constraints.TopToTopOfHighlight)
                    .setMarginOffset(MarginOffset(top = (-2).dp))
                    .build()
            }
            .enableHighlight(false)//no highlight now is a popup window
            .interceptBackPressed(true)
            .show()
    }

    private fun showPopupWindowRight() {
        HighlightPro.with(this)
            .setHighlightParameter {
                HighlightParameter.Builder()
                    .setHighlightViewId(R.id.btn_tips_right)
                    .setTipsViewId(R.layout.pop_tips_layout_right)
                    .setConstraints(Constraints.StartToEndOfHighlight + Constraints.TopToTopOfHighlight)
                    .setMarginOffset(MarginOffset(top = (-2).dp))
                    .build()
            }
            .enableHighlight(false)//no highlight now is a popup window
            .interceptBackPressed(true)
            .show()
    }
}