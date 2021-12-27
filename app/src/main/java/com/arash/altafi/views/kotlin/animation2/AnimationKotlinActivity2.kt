package com.arash.altafi.views.kotlin.animation2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.arash.altafi.views.R
import com.github.hujiaweibujidao.wava.Techniques
import com.github.hujiaweibujidao.wava.YoYo
import kotlinx.android.synthetic.main.activity_animation_kotlin2.*

class AnimationKotlinActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_kotlin2)

        init()
    }

    private fun init() {

        btn_animation_1_2.setOnClickListener {
            YoYo.with(Techniques.Tada).duration(1000).repeat(1).playOn(btn_animation_1_2)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Tada", Toast.LENGTH_SHORT).show()
            },700)
        }



        btn_animation_2_2.setOnClickListener {
            YoYo.with(Techniques.Swing).duration(400).repeat(1).playOn(btn_animation_2_2)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Swing", Toast.LENGTH_SHORT).show()
            },700)
        }

        btn_animation_3_2.setOnClickListener {
            YoYo.with(Techniques.Wave).duration(400).repeat(1).playOn(btn_animation_3_2)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Wave", Toast.LENGTH_SHORT).show()
            },700)
        }

        btn_animation_4_2.setOnClickListener {
            YoYo.with(Techniques.Bounce).duration(400).repeat(1).playOn(btn_animation_4_2)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Bounce", Toast.LENGTH_SHORT).show()
            },700)
        }

        btn_animation_5_2.setOnClickListener {
            YoYo.with(Techniques.Pulse).duration(400).repeat(1).playOn(btn_animation_5_2)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Pulse", Toast.LENGTH_SHORT).show()
            },700)
        }

        btn_animation_6_2.setOnClickListener {
            YoYo.with(Techniques.Flash).duration(400).repeat(1).playOn(btn_animation_6_2)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Flash", Toast.LENGTH_SHORT).show()
            },700)
        }

        btn_animation_7_2.setOnClickListener {
            YoYo.with(Techniques.Tada).duration(400).repeat(1).playOn(btn_animation_7_2)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Tada", Toast.LENGTH_SHORT).show()
            },700)
        }

    }

}

//Attension
//Flash, Pulse, RubberBand, Shake, Swing, Wobble, Bounce, Tada, StandUp, Wave
//
//Special
//Hinge, RollIn, RollOut,Landing,TakingOff,DropOut
//
//Bounce
//BounceIn, BounceInDown, BounceInLeft, BounceInRight, BounceInUp
//
//Fade
//FadeIn, FadeInUp, FadeInDown, FadeInLeft, FadeInRight
//
//FadeOut, FadeOutDown, FadeOutLeft, FadeOutRight, FadeOutUp
//
//Flip
//FlipInX, FlipOutX, FlipOutY
//
//Rotate
//RotateIn, RotateInDownLeft, RotateInDownRight, RotateInUpLeft, RotateInUpRight
//
//RotateOut, RotateOutDownLeft, RotateOutDownRight, RotateOutUpLeft, RotateOutUpRight
//
//Slide
//SlideInLeft, SlideInRight, SlideInUp, SlideInDown
//
//SlideOutLeft, SlideOutRight, SlideOutUp, SlideOutDown
//
//Zoom
//ZoomIn, ZoomInDown, ZoomInLeft, ZoomInRight, ZoomInUp
//
//ZoomOut, ZoomOutDown, ZoomOutLeft, ZoomOutRight, ZoomOutUp