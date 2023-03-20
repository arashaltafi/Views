package com.arash.altafi.views.kotlin

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.arash.altafi.views.kotlin.switchbutton4.SharedPreferencesTheme

class App : Application() {

    private val sharedPreferencesTheme = SharedPreferencesTheme()

    override fun onCreate() {
        super.onCreate()

        sharedPreferencesTheme.sharedPrefTheme(this)
        AppCompatDelegate.setDefaultNightMode(
            when (sharedPreferencesTheme.getTheme()) {
                "AUTO" -> AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
                "LIGHT" -> AppCompatDelegate.MODE_NIGHT_NO
                "DARK" -> AppCompatDelegate.MODE_NIGHT_YES
                else -> AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
            }
        )
    }

}