package com.arash.altafi.views.kotlin.progressbar4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.ybq.android.spinkit.sprite.Sprite
import android.view.View
import android.widget.ProgressBar
import com.arash.altafi.views.R
import com.github.ybq.android.spinkit.style.*

class ProgressBarKotlinActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar_kotlin4)

        init()
    }

    private fun init() {

        val progressBar1 = findViewById<ProgressBar>(R.id.spin_kit_1)
        val doubleBounce1: Sprite = DoubleBounce()
        progressBar1.indeterminateDrawable = doubleBounce1

        val progressBar = findViewById<ProgressBar>(R.id.spin_kit_2)
        val doubleBounce: Sprite = RotatingPlane()
        progressBar.indeterminateDrawable = doubleBounce

        val progressBar3 = findViewById<ProgressBar>(R.id.spin_kit_3)
        val doubleBounce3: Sprite = Wave()
        progressBar3.indeterminateDrawable = doubleBounce3

        ///////////////////////////////////////////////

        val progressBar4 = findViewById<ProgressBar>(R.id.spin_kit_4)
        val doubleBounce4: Sprite = WanderingCubes()
        progressBar4.indeterminateDrawable = doubleBounce4

        val progressBar5 = findViewById<ProgressBar>(R.id.spin_kit_5)
        val doubleBounce5: Sprite = Pulse()
        progressBar5.indeterminateDrawable = doubleBounce5

        val progressBar6 = findViewById<ProgressBar>(R.id.spin_kit_6)
        val doubleBounce6: Sprite = ChasingDots()
        progressBar6.indeterminateDrawable = doubleBounce6

        ///////////////////////////////////////////////

        val progressBar7 = findViewById<ProgressBar>(R.id.spin_kit_7)
        val doubleBounce7: Sprite = RotatingCircle()
        progressBar7.indeterminateDrawable = doubleBounce7

        val progressBar8 = findViewById<ProgressBar>(R.id.spin_kit_8)
        val doubleBounce8: Sprite = FadingCircle()
        progressBar8.indeterminateDrawable = doubleBounce8

        val progressBar9 = findViewById<ProgressBar>(R.id.spin_kit_9)
        val doubleBounce9: Sprite = CubeGrid()
        progressBar9.indeterminateDrawable = doubleBounce9

    }

//    Styles :
//
//    RotatingPlane
//    DoubleBounce
//    Wave
//    WanderingCubes
//    Pulse
//    ChasingDots
//    ThreeBounce
//    Circle
//    CubeGrid
//    FadingCircle
//    FoldingCube
//    RotatingCircle

}