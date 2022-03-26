package com.arash.altafi.views.kotlin.progressbar5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.arash.altafi.views.R
import com.google.android.material.slider.RangeSlider
import com.google.android.material.slider.Slider
import kotlinx.android.synthetic.main.activity_progress_bar_kotlin5.*
import kotlin.math.roundToInt

class ProgressBarKotlinActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar_kotlin5)

        continuous_slider_progress5.setLabelFormatter { value: Float ->
            return@setLabelFormatter "$${value.roundToInt()}"
        }

        continuous_slider_progress5.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            @SuppressLint("RestrictedApi")
            override fun onStartTrackingTouch(slider: Slider) {
                // Responds to when slider's touch event is being started
                Log.d("onStartTrackingTouch", slider.value.toString())
            }

            @SuppressLint("RestrictedApi")
            override fun onStopTrackingTouch(slider: Slider) {
                // Responds to when slider's touch event is being stopped
                Log.d("onStopTrackingTouch", slider.value.toString())
            }
        })

        continuous_slider_progress5.addOnChangeListener(Slider.OnChangeListener { slider, value, fromUser -> {
            Log.d("addOnChangeListener", slider.value.toString()) }
        })

        range_slider_progress5.addOnSliderTouchListener(object : RangeSlider.OnSliderTouchListener{
            @SuppressLint("RestrictedApi")
            override fun onStartTrackingTouch(slider: RangeSlider) {
                val values = range_slider_progress5.values
                Log.d("onStartTrackingTouch From", values[0].toString())
                Log.d("onStartTrackingTouch T0", values[1].toString())
            }

            @SuppressLint("RestrictedApi")
            override fun onStopTrackingTouch(slider: RangeSlider) {
                val values = range_slider_progress5.values
                Log.d("onStopTrackingTouch From", values[0].toString())
                Log.d("onStopTrackingTouch T0", values[1].toString())
            }
        })

        range_slider_progress5.addOnChangeListener(RangeSlider.OnChangeListener { slider, value, fromUser ->
            val values = range_slider_progress5.values
            Log.d("From", values[0].toString())
            Log.d("T0", values[1].toString())
        })

        range_slider_progress5.addOnChangeListener { rangeSlider, value, fromUser ->

            val values = rangeSlider.values

        }

    }
}