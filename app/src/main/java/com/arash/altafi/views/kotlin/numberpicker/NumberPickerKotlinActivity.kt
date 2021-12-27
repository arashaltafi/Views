package com.arash.altafi.views.kotlin.numberpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import it.sephiroth.android.library.numberpicker.NumberPicker
import kotlinx.android.synthetic.main.activity_number_picker_kotlin.*

class NumberPickerKotlinActivity : AppCompatActivity() , NumberPicker.OnNumberPickerChangeListener {

    var num : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_picker_kotlin)

        init()
    }

    private fun init() {

        number_picker.setProgress(num,true)
        number_picker.numberPickerChangeListener

    }

    override fun onProgressChanged(numberPicker: NumberPicker, progress: Int, fromUser: Boolean) {
        num = progress
    }

    override fun onStartTrackingTouch(numberPicker: NumberPicker) {

    }

    override fun onStopTrackingTouch(numberPicker: NumberPicker) {

    }

}