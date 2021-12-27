package com.arash.altafi.views.kotlin.animation1

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import android.widget.Toast

import android.animation.AnimatorListenerAdapter
import android.os.Handler
import android.os.Looper

import android.view.animation.AccelerateDecelerateInterpolator
import com.github.hujiaweibujidao.wava.Techniques

import com.github.hujiaweibujidao.wava.YoYo
import kotlinx.android.synthetic.main.activity_animation_kotlin1.*


class AnimationKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_kotlin1)

        init()
    }

    private fun init() {

        btn_animation_1.setOnClickListener {
            YoYo.with(Techniques.FadeIn).duration(1000).repeat(1)
                .interpolate(AccelerateDecelerateInterpolator())
                .listen(object : AnimatorListenerAdapter() {
                    override fun onAnimationCancel(animation: Animator?) {
                        Toast.makeText(this@AnimationKotlinActivity1, "test", Toast.LENGTH_SHORT).show()
                    }
                })
                .playOn(btn_animation_1)
        }

        btn_animation_2.setOnClickListener {
            YoYo.with(Techniques.Swing).duration(400).repeat(1).playOn(btn_animation_2)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                 Toast.makeText(this,"Swing",Toast.LENGTH_SHORT).show()
            },700)
        }

        btn_animation_3.setOnClickListener {
            YoYo.with(Techniques.Wave).duration(400).repeat(1).playOn(btn_animation_3)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Wave",Toast.LENGTH_SHORT).show()
            },700)
        }

        btn_animation_4.setOnClickListener {
            YoYo.with(Techniques.Bounce).duration(400).repeat(1).playOn(btn_animation_4)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Bounce",Toast.LENGTH_SHORT).show()
            },700)
        }

        btn_animation_5.setOnClickListener {
            YoYo.with(Techniques.Pulse).duration(400).repeat(1).playOn(btn_animation_5)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Pulse",Toast.LENGTH_SHORT).show()
            },700)
        }

        btn_animation_6.setOnClickListener {
            YoYo.with(Techniques.Flash).duration(400).repeat(1).playOn(btn_animation_6)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Flash",Toast.LENGTH_SHORT).show()
            },700)
        }

        btn_animation_7.setOnClickListener {
            YoYo.with(Techniques.Tada).duration(400).repeat(1).playOn(btn_animation_7)
            Handler(Looper.myLooper()!!).postDelayed(Runnable {
                Toast.makeText(this,"Tada",Toast.LENGTH_SHORT).show()
            },700)
        }

    }

}