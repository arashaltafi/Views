package com.arash.altafi.views.kotlin.boomMenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arash.altafi.views.R
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton
import com.nightonke.boommenu.Piece.PiecePlaceEnum
import kotlinx.android.synthetic.main.activity_boom_menu.*

class BoomMenuActivity : AppCompatActivity() {

    private var imageResourceIndex = 0
    private var colorResourceIndex = 0
    private val imageResources = intArrayOf(
        R.drawable.instagram,
        R.drawable.whatsapp,
        R.drawable.twitter,
        R.drawable.facebook,
        R.drawable.path
    )
    private val colorResources = intArrayOf(
        Color.parseColor("#FFFFFF"),
        Color.parseColor("#25D366"),
        Color.parseColor("#1CB7EB"),
        Color.parseColor("#3C5A99"),
        Color.parseColor("#D42028")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boom_menu)

        init()
    }

    private fun init() {
        for (i in 0 until boom_1.buttonPlaceEnum.buttonNumber()){
            boom_1.addBuilder(getSimpleCircleButtonBuilder())
        }
    }

    private fun getImageResource(): Int {
        if (imageResourceIndex >= imageResources.size) imageResourceIndex = 0
        return imageResources[imageResourceIndex++]
    }

    private fun getColorResource(): Int {
        if (colorResourceIndex >= colorResources.size) colorResourceIndex = 0
        return colorResources[colorResourceIndex++]
    }

    private fun getSimpleCircleButtonBuilder(): SimpleCircleButton.Builder? {
        return SimpleCircleButton.Builder()
            .normalImageRes(getImageResource())
            .normalColor(getColorResource())
            .listener(){ index ->
                when (index) {
                    0 -> {
                        Toast.makeText(
                            this,
                            "Instagram",
                            Toast.LENGTH_SHORT).show();
                    }
                    1 -> {
                        Toast.makeText(
                            this,
                            "Whatsapp",
                            Toast.LENGTH_SHORT).show();
                    }
                    2 -> {
                        Toast.makeText(
                            this,
                            "Twitter",
                            Toast.LENGTH_SHORT).show();
                    }
                    3 -> {
                        Toast.makeText(
                            this,
                            "Facebook",
                            Toast.LENGTH_SHORT).show();
                    }
                    4 -> {
                        Toast.makeText(
                            this,
                            "Path",
                            Toast.LENGTH_SHORT).show();
                    }
                }
            }
    }

}