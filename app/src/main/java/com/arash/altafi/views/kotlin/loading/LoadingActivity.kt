package com.arash.altafi.views.kotlin.loading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.databinding.ActivityLoadingBinding

class LoadingActivity : AppCompatActivity() {

    //https://github.com/HarlonWang/AVLoadingIndicatorView

    private val binding by lazy {
        ActivityLoadingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}