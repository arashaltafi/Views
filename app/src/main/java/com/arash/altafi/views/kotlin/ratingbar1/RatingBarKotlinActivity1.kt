package com.arash.altafi.views.kotlin.ratingbar1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_rating_bar_kotlin1.*

class RatingBarKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar_kotlin1)

        init()
    }

    private fun init() {


        ratingbar_1.rating = 2.78f

        ratingbar_2.rating = 4.33231165f

    }

}