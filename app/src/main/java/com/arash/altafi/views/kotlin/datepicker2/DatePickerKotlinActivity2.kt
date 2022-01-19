package com.arash.altafi.views.kotlin.datepicker2

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.arash.altafi.views.R
import ir.hamsaa.persiandatepicker.Listener
import ir.hamsaa.persiandatepicker.PersianDatePickerDialog
import ir.hamsaa.persiandatepicker.api.PersianPickerDate
import ir.hamsaa.persiandatepicker.api.PersianPickerListener
import ir.hamsaa.persiandatepicker.util.PersianCalendar
import ir.hamsaa.persiandatepicker.util.PersianCalendarUtils
import kotlinx.android.synthetic.main.activity_date_picker_kotlin2.*

class DatePickerKotlinActivity2 : AppCompatActivity() {

    private lateinit var picker: PersianDatePickerDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker_kotlin2)

        init()
    }

    private fun init() {

        btn_show_data_picker_2.setOnClickListener {

            val typeface = Typeface.createFromAsset(assets, "vazir.ttf")

            picker = PersianDatePickerDialog(this)
                .setPositiveButtonString("باشه")
                .setNegativeButton("بیخیال")
                .setTodayButton("امروز")
                .setTodayButtonVisible(true)
                .setMinYear(1300)
                .setAllButtonsTextSize(12)
                .setMaxYear(PersianDatePickerDialog.THIS_YEAR)
                .setInitDate(1370, 3, 13)
                .setActionTextColor(Color.GRAY)
                .setTypeFace(typeface)
                .setTitleType(PersianDatePickerDialog.WEEKDAY_DAY_MONTH_YEAR)
                .setShowInBottomSheet(true)
                .setListener(object : PersianPickerListener {
                    override fun onDateSelected(persianPickerDate: PersianPickerDate) {
                        Log.d("test123321", "onDateSelected: " + persianPickerDate.timestamp) //675930448000
                        Log.d("test123321", "onDateSelected: " + persianPickerDate.gregorianDate) //Mon Jun 03 10:57:28 GMT+04:30 1991
                        Log.d("test123321", "onDateSelected: " + persianPickerDate.persianLongDate) // دوشنبه  13  خرداد  1370
                        Log.d("test123321", "onDateSelected: " + persianPickerDate.persianMonthName) //خرداد
                        Log.d("test123321", "onDateSelected: " + PersianCalendarUtils.isPersianLeapYear(persianPickerDate.persianYear)) //true
                        Toast.makeText(this@DatePickerKotlinActivity2, persianPickerDate.persianYear.toString() + "/" + persianPickerDate.persianMonth + "/" + persianPickerDate.persianDay, Toast.LENGTH_SHORT).show()
                    }

                    override fun onDismissed() {
                        Toast.makeText(this@DatePickerKotlinActivity2, "Dismissed", Toast.LENGTH_SHORT).show()
                    }
                })

            picker.show()

        }

        btn_show_dark_mode_data_picker_2.setOnClickListener {

            val typeface = Typeface.createFromAsset(assets, "vazir.ttf")

            val initDate = PersianCalendar()
            initDate.setPersianDate(1370, 3, 13)

            picker = PersianDatePickerDialog(this)
                .setPositiveButtonString("باشه")
                .setNegativeButton("بیخیال")
                .setTodayButton("امروز")
                .setTodayButtonVisible(true)
                .setMinYear(1300)
                .setMaxYear(PersianDatePickerDialog.THIS_YEAR)
                .setInitDate(initDate)
                .setTypeFace(typeface)
                .setBackgroundColor(Color.BLACK)
                .setTitleColor(Color.WHITE)
                .setActionTextColor(Color.RED)
                .setPickerBackgroundDrawable(R.drawable.darkmode_bg)
                .setTitleType(PersianDatePickerDialog.DAY_MONTH_YEAR)
                .setCancelable(false)
                .setListener(object : Listener {
                    override fun onDateSelected(persianCalendar: PersianCalendar) {
                        Toast.makeText(this@DatePickerKotlinActivity2, persianCalendar.persianYear.toString() + "/" + persianCalendar.persianMonth + "/" + persianCalendar.persianDay, Toast.LENGTH_SHORT).show()
                    }

                    override fun onDismissed() {
                        Toast.makeText(this@DatePickerKotlinActivity2, "Dismissed", Toast.LENGTH_SHORT).show()
                    }
                })
            picker.show()

        }

    }

}