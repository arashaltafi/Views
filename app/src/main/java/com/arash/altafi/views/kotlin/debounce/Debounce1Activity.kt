package com.arash.altafi.views.kotlin.debounce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.ext.debounce
import com.arash.altafi.views.kotlin.ext.toast
import kotlinx.android.synthetic.main.activity_debounce1.*

class Debounce1Activity : AppCompatActivity() {

    private var onChange: ((String) -> Unit)? = null
    private var onChangeDebounce: ((String) -> Unit)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debounce1)

        init()
    }

    private fun init() {
        onChangeDebounce = debounce(1000L, lifecycleScope) {
            toast(it)
        }

        onChange = {
            toast(it)
        }

        btnDebounceSample1.setOnClickListener {
            onChangeDebounce?.invoke("This is a sample 1")
        }

        btnDebounceSample2.setOnClickListener {
            onChange?.invoke("This is a sample 2")
        }
    }

}