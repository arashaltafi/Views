package com.arash.altafi.views.kotlin.shimmer3.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.shimmer3.utils.ShimmerUtils
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar!!.hide()

        init()
    }

    private fun init() {
        detail_veilLayout_header.shimmer = ShimmerUtils.getGrayShimmer(this)
        detail_veilLayout_body.shimmer = ShimmerUtils.getGrayShimmer(this)

        // delay-auto-unveil
        Handler(Looper.myLooper()!!).postDelayed(Runnable {
            detail_veilLayout_header.unVeil()
            detail_veilLayout_body.unVeil()
        }, 2000)

    }

}