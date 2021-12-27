package com.arash.altafi.views.kotlin.dialog3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arash.altafi.views.R
import com.marcoscg.dialogsheet.DialogSheet
import kotlinx.android.synthetic.main.activity_dialog_kotlin3.*

class DialogKotlinActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_kotlin3)

        init()
    }

    private fun init() {
        btn_dialog3_clicked_kotlin.setOnClickListener {
            val dialogSheet = DialogSheet(this)
                .setTitle(R.string.app_name)
                .setMessage(R.string.loremIpsum)
                .setColoredNavigationBar(true)
                .setTitleTextSize(20) // In SP
                .setCancelable(false)
                .setPositiveButton(android.R.string.ok) {
                    Toast.makeText(this , "ok" , Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton(android.R.string.cancel) {
                    Toast.makeText(this , "cancel" , Toast.LENGTH_SHORT).show()
                }
                .setNeutralButton("Neutral")
                .setRoundedCorners(false) // Default value is true
                .setBackgroundColor(Color.BLACK) // Your custom background color
                .setButtonsColorRes(R.color.colorAccent) // You can use dialogSheetAccent style attribute instead
                .setNeutralButtonColor(Color.WHITE)
                .show()
        }
    }

}