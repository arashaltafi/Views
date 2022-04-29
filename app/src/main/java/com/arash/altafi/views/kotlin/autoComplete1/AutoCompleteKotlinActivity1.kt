package com.arash.altafi.views.kotlin.autoComplete1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_auto_complete_kotlin1.*

class AutoCompleteKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete_kotlin1)

        init()
    }

    private fun init() {
        val items = listOf("Tehran", "Shiraz", "Mashhad", "Qom", "...")
        val adapter = ArrayAdapter(this, R.layout.item_auto_complete, items)
        menuAutocomplete.setAdapter(adapter)
    }

}