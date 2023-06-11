package com.arash.altafi.views.kotlin.image7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.databinding.ActivityImageKotlin7Binding

class ImageKotlinActivity7 : AppCompatActivity() {

    private val binding by lazy {
        ActivityImageKotlin7Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            ivLike1.isChecked = true
            ivLike2.isChecked = false
        }
    }
}