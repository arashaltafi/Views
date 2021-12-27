package com.arash.altafi.views.kotlin.switchbutton1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.arash.altafi.views.R
import com.suke.widget.SwitchButton
import kotlinx.android.synthetic.main.activity_switch_button_kotlin1.*


class SwitchButtonKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button_kotlin1)

        init()
    }

    private fun init() {

        val switchButton = findViewById<SwitchButton>(R.id.switch_button_1)
        switchButton.isChecked = true
        switchButton.isChecked
        switchButton.toggle() //switch state
        switchButton.toggle(false) //switch without animation
        switchButton.setShadowEffect(true) //disable shadow effect
        switchButton.isEnabled = false //disable button
        switchButton.setEnableEffect(false) //disable the switch animation
        switchButton.setOnCheckedChangeListener(SwitchButton.OnCheckedChangeListener { view, isChecked ->
            //TODO do your job
        })

        switch_button_2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this , " true " , Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this , " false " , Toast.LENGTH_SHORT).show()
            }
        }

    }

}