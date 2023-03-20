package com.arash.altafi.views.kotlin.unique

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_unique_code.*

class UniqueCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unique_code)

        init()
    }

    private fun init() {
        btnGetRandomUnique.setOnClickListener {
            tvUnique.text = UniqueUtils.getRandomUnique().toString()
        }

        btnGetRandomUniqueId.setOnClickListener {
            tvUnique.text = UniqueUtils.getRandomUniqueId().toString()
        }

        btnGetRandomUniqueHashId.setOnClickListener {
            tvUnique.text = UniqueUtils.getRandomUniqueHashId().toString()
        }

        btnGetRandomUniqueHashIdCustom.setOnClickListener {
            tvUnique.text = UniqueUtils.getRandomUniqueHashId("arash").toString()
        }
    }

}