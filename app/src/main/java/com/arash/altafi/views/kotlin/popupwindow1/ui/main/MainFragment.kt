package com.arash.altafi.views.kotlin.popupwindow1.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.popupwindow1.ui.dialog.CustomDialog
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_highlight_more.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_highlightMoreFragment)
        }

        btn_highlight.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_highlightGuideFragment)
        }

        btn_popup.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_popupFragment)
        }

        btn_dialog.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        CustomDialog().show(childFragmentManager, CustomDialog.TAG)
    }

    companion object {
        fun create() : MainFragment {
            return MainFragment().apply {
                arguments = bundleOf(
                
                )
            }
        }
    }
}