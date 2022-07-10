package com.arash.altafi.views.kotlin.chart3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_pie.setOnClickListener { navController.navigate(R.id.actionGoToPie) }
        btn_column.setOnClickListener { navController.navigate(R.id.actionGoToColunm) }
        btn_multi.setOnClickListener { navController.navigate(R.id.actionGoToMulti) }

    }

}