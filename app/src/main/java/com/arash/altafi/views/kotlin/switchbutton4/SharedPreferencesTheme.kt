package com.arash.altafi.views.kotlin.switchbutton4

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesTheme {

    companion object {
        private const val THEME = "THEME"
        private const val MY_PASS_CLASS = "my_pass_class"
    }

    private var preferences: SharedPreferences? = null

    fun sharedPrefTheme(context: Context) {
        preferences = context.getSharedPreferences(MY_PASS_CLASS, Context.MODE_PRIVATE)
    }

    fun saveTheme(theme: String?) {
        val editor: SharedPreferences.Editor = preferences!!.edit()
        editor.putString(THEME, theme)
        editor.apply()
    }

    fun getTheme(): String {
        return preferences?.getString(THEME, null) ?: ""

    }

    fun clear() {
        val editor: SharedPreferences.Editor = preferences!!.edit()
        editor.clear()
        editor.apply()
    }

    fun remove() {
        val editor: SharedPreferences.Editor = preferences!!.edit()
        editor.remove(THEME)
        editor.apply()
    }

}