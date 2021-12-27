package com.arash.altafi.views.kotlin.datepicker

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arash.altafi.views.R
import com.ozcanalasalvar.library.utils.DateUtils
import com.ozcanalasalvar.library.view.datePicker.DatePicker
import com.ozcanalasalvar.library.view.popup.DatePickerPopup
import com.ozcanalasalvar.library.view.popup.TimePickerPopup
import com.ozcanalasalvar.library.view.timePicker.TimePicker
import kotlinx.android.synthetic.main.activity_date_picker_kotlin.*

class DatePickerKotlinActivity : AppCompatActivity() {

    private lateinit var pickerPopup: TimePickerPopup
    private lateinit var datePickerPopup: DatePickerPopup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker_kotlin)

        init()
    }

    @SuppressLint("SetTextI18n")
    private fun init() {

        datePickerPopup = DatePickerPopup.Builder()
            .from(this)
            .offset(3)
            .darkModeEnabled(true)
            .pickerMode(DatePicker.MONTH_ON_FIRST)
            .textSize(19)
            .endDate(DateUtils.getTimeMiles(2050, 10, 25))
            .currentDate(DateUtils.getCurrentTime())
            .startDate(DateUtils.getTimeMiles(1995, 0, 1))
            .listener { dp, date, day, month, year ->
                Toast.makeText(this, "" + day + "/" + (month + 1) + "/" + year, Toast.LENGTH_SHORT).show()
            }
            .build()

        pickerPopup = TimePickerPopup.Builder()
            .from(this)
            .offset(3)
            .textSize(17)
            .setTime(12, 12)
            .listener { timePicker, hour, minute ->
                Toast.makeText(this, "$hour:$minute", Toast.LENGTH_SHORT).show()
            }
            .build()


        val datePicker = findViewById<DatePicker>(R.id.date_picker)
        datePicker.offset = 3
        datePicker.isDarkModeEnabled = true
        datePicker.setTextSize(19)
        datePicker.maxDate = DateUtils.getTimeMiles(2050, 10, 25)
        datePicker.date = DateUtils.getCurrentTime()
        datePicker.minDate = DateUtils.getTimeMiles(1995, 1, 12)
        datePicker.setPickerMode(DatePicker.DAY_ON_FIRST)


        datePicker.setDataSelectListener { date, day, month, year ->
            text_date.setText("$day / $month+1 / $year")
        }


        val timePicker = findViewById<TimePicker>(R.id.timepicker)
        timePicker.offset = 2
        timePicker.setTextSize(19)
        timePicker.hour = 9
        timePicker.minute = 5
        timePicker.setTimeSelectListener { hour, minute ->
            text_time.text = "$hour : $minute"
        }

        btn_date_picker.setOnClickListener {
            datePickerPopup.show()
        }

        btn_time_picker.setOnClickListener {
            pickerPopup.show()
        }

    }

}