package com.arash.altafi.views.kotlin.chart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.views.R
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.github.mikephil.charting.utils.ColorTemplate
import kotlinx.android.synthetic.main.activity_mpchart.*

class MpChartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mpchart)

        init()
    }

    private fun init() {
        val salesData = ArrayList<BarEntry>()
        val labels = ArrayList<String>()
        val ems = ArrayList<MonthSales>()

        ems.add(MonthSales("January", 5000))
        ems.add(MonthSales("February", 6000))
        ems.add(MonthSales("March", 8000))
        ems.add(MonthSales("April", 3000))
        ems.add(MonthSales("May", 9000))
        ems.add(MonthSales("June", 4000))
        ems.add(MonthSales("July", 9000))
        ems.add(MonthSales("August", 2000))
        ems.add(MonthSales("September", 1000))
        ems.add(MonthSales("October", 6000))
        ems.add(MonthSales("November", 3000))
        ems.add(MonthSales("December", 7000))

        for (i in ems.indices){
            val p = i.toFloat()
            val month = ems[i].month
            val sale = ems[i].sale.toFloat()
            salesData.add(BarEntry(p,sale))
            labels.add(month)
        }

        val barDataSet  = BarDataSet(salesData, "Month seals")
        val description = Description()
        description.text = "Months"
        barChart.description = description
        barDataSet.colors = ColorTemplate.COLORFUL_COLORS.asList()
        val barData = BarData(barDataSet)
        barChart.data = barData

        val xAxis = barChart.xAxis
        val indexLabels = IndexAxisValueFormatter(labels)
        xAxis.valueFormatter = indexLabels
        xAxis.position = XAxis.XAxisPosition.TOP
        xAxis.setDrawAxisLine(false)
        xAxis.setDrawGridLines(false)
        xAxis.granularity = 1f
        xAxis.labelCount = labels.size
        xAxis.labelRotationAngle = 270f
        barChart.animateY(2000)
        barChart.invalidate()
    }

}