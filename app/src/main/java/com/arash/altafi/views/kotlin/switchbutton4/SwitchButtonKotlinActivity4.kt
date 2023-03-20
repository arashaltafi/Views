package com.arash.altafi.views.kotlin.switchbutton4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.lifecycleScope
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.ext.debounce
import com.rm.rmswitch.RMTristateSwitch
import kotlinx.android.synthetic.main.activity_switch_button_kotlin4.*

class SwitchButtonKotlinActivity4 : AppCompatActivity() {

    private val sharedPreferencesTheme = SharedPreferencesTheme()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button_kotlin4)

        sharedPreferencesTheme.sharedPrefTheme(this)
        init()
    }

    private fun init() {
        val selectedIndex = when (sharedPreferencesTheme.getTheme()) {
            "LIGHT" -> RMTristateSwitch.STATE_LEFT
            "AUTO" -> RMTristateSwitch.STATE_MIDDLE
            "DARK" -> RMTristateSwitch.STATE_RIGHT
            else -> RMTristateSwitch.STATE_MIDDLE
        }

        rmtTheme.state = selectedIndex

        val stringArray = resources.getStringArray(R.array.theme_array)
        ts.setText(stringArray[selectedIndex])

        val onChangeDebounce = debounce<String>(300L, lifecycleScope) {
            AppCompatDelegate.setDefaultNightMode(
                when (it) {
                    "AUTO" -> AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
                    "LIGHT" -> AppCompatDelegate.MODE_NIGHT_NO
                    "DARK" -> AppCompatDelegate.MODE_NIGHT_YES
                    else -> AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
                }
            )
        }
        rmtTheme.addSwitchObserver { _, state ->
            when (state) {
                RMTristateSwitch.STATE_LEFT -> {
                    ts.setText(stringArray[0])
                    sharedPreferencesTheme.saveTheme("LIGHT")
                }
                RMTristateSwitch.STATE_MIDDLE -> {
                    ts.setText(stringArray[1])
                    sharedPreferencesTheme.saveTheme("AUTO")
                }
                RMTristateSwitch.STATE_RIGHT -> {
                    ts.setText(stringArray[2])
                    sharedPreferencesTheme.saveTheme("DARK")
                }
            }

            onChangeDebounce.invoke(sharedPreferencesTheme.getTheme())

        }

    }

}