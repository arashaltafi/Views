package com.arash.altafi.views.kotlin.shimmer2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_shimmer_kotlin2.*

class ShimmerKotlinActivity2 : AppCompatActivity() {

    private lateinit var adapter : ShimmerAdapter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shimmer_kotlin2)

        init()
    }

    private fun init() {
        adapter = ShimmerAdapter2(arrayListOf())
        rc_shimmer_2.addItemDecoration(DividerItemDecoration(rc_shimmer_2.context, RecyclerView.VERTICAL))
        rc_shimmer_2.adapter = adapter
        rc_shimmer_2.layoutManager = LinearLayoutManager(this)

        getData()
    }

    private fun getData() {
        AndroidNetworking.initialize(this)
        //api for mock data (json array)
        AndroidNetworking.get("https://5e510330f2c0d300147c034c.mockapi.io/users")
            .build()
            .getAsObjectList(User::class.java, object : ParsedRequestListener<List<User>> {
                @SuppressLint("NotifyDataSetChanged")
                override fun onResponse(users: List<User>) {
                    shimmerFrameLayout.stopShimmer()
                    shimmerFrameLayout.visibility = View.GONE
                    rc_shimmer_2.visibility = View.VISIBLE
                    adapter.addData(users)
                    adapter.notifyDataSetChanged()
                }

                override fun onError(anError: ANError) {
                    shimmerFrameLayout.stopShimmer()
                    shimmerFrameLayout.visibility = View.GONE
                    Toast.makeText(this@ShimmerKotlinActivity2, "خطا در اتصال", Toast.LENGTH_LONG).show()
                }

            })
    }

    override fun onResume() {
        super.onResume()
        shimmerFrameLayout.startShimmer()
    }

    override fun onPause() {
        shimmerFrameLayout.stopShimmer()
        super.onPause()
    }

}