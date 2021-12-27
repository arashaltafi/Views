package com.arash.altafi.views.kotlin.shimmer3.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.shimmer3.adapter.ShimmerAdapter3
import com.arash.altafi.views.kotlin.shimmer3.data.ListItemUtils
import com.arash.altafi.views.kotlin.shimmer3.model.Profile
import com.skydoves.androidveil.VeiledItemOnClickListener
import kotlinx.android.synthetic.main.activity_shimmer_kotlin3.*

class ShimmerKotlinActivity3 : AppCompatActivity() , VeiledItemOnClickListener , ShimmerAdapter3.ProfileViewHolder.Delegate {

    private lateinit var adapter : ShimmerAdapter3


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shimmer_kotlin3)

        init()
    }

    private fun init() {
        adapter = ShimmerAdapter3(this)
        veilRecyclerView.run {
            setVeilLayout(R.layout.item_shimmer_3, this@ShimmerKotlinActivity3)
            setAdapter(adapter)
            setLayoutManager(LinearLayoutManager(this@ShimmerKotlinActivity3))
            addVeiledItems(15)
        }

        // add profile times to adapter
        adapter.addProfiles(ListItemUtils.getProfiles(this))

        // delay-auto-unveil
        Handler(Looper.myLooper()!!).postDelayed(Runnable {
            veilRecyclerView.unVeil()
        } , 3000)

    }

    override fun onItemClicked(pos: Int) {
        Toast.makeText(this, "loading", Toast.LENGTH_SHORT).show()
    }

    override fun onItemClickListener(profile: Profile) {
        startActivity(Intent(this, DetailActivity::class.java))
    }

}