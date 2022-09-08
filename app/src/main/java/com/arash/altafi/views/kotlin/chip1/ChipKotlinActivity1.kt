package com.arash.altafi.views.kotlin.chip1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.arash.altafi.views.R
import kotlinx.android.synthetic.main.activity_chip_kotlin1.*

class ChipKotlinActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chip_kotlin1)

        init()
    }

    private fun init() {
        chip_music.setOnCheckedChangeListener { _, checked ->
            if (checked)
                chip_music.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_music_selected)
            else
                chip_music.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_music)
        }
        chip_file.setOnCheckedChangeListener { _, checked ->
            if (checked)
                chip_file.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_file_selected)
            else
                chip_file.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_file)
        }

        chip_music1.setOnCheckedChangeListener { _, checked ->
            if (checked)
                chip_music1.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_music_selected)
            else
                chip_music1.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_music)
        }
        chip_file1.setOnCheckedChangeListener { _, checked ->
            if (checked)
                chip_file1.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_file_selected)
            else
                chip_file1.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_file)
        }

        chip_music2.setOnCheckedChangeListener { _, checked ->
            if (checked)
                chip_music2.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_music_selected)
            else
                chip_music2.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_music)
        }
        chip_file2.setOnCheckedChangeListener { _, checked ->
            if (checked)
                chip_file2.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_file_selected)
            else
                chip_file2.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_file)
        }
    }

}