package com.arash.altafi.views.kotlin.shimmer1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_shimmer_kotlin1.*

class ShimmerKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shimmer_kotlin1)

        shimmer_view_container.startShimmer()
    }

    public override fun onResume() {
        super.onResume()
        shimmer_view_container.startShimmer()
    }

    public override fun onPause() {
        shimmer_view_container.stopShimmer()
        super.onPause()
    }

}