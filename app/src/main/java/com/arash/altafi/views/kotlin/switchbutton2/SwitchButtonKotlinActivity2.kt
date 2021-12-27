package com.arash.altafi.views.kotlin.switchbutton2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.arash.altafi.views.R
import io.ghyeok.stickyswitch.widget.StickySwitch
import kotlinx.android.synthetic.main.activity_switch_button_kotlin2.*

class SwitchButtonKotlinActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button_kotlin2)

        init()
    }

    private fun init() {

        // Set Selected Change Listener
        stickySwitch.onSelectedChangeListener = object : StickySwitch.OnSelectedChangeListener {
            override fun onSelectedChange(direction: StickySwitch.Direction, text: String) {
                Toast.makeText(this@SwitchButtonKotlinActivity2 , direction.name, Toast.LENGTH_SHORT).show()
            }
        }

    }

}