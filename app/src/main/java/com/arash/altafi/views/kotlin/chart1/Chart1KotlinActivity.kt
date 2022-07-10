package com.arash.altafi.views.kotlin.chart1

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.arash.altafi.views.R
import com.arash.altafi.views.kotlin.ext.toGone
import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.ValueFormatter
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import kotlinx.android.synthetic.main.activity_chart1_kotlin.*

class Chart1KotlinActivity : AppCompatActivity() {

    private val dates = mutableListOf<String>()
    private var values : MutableList<Entry> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart1_kotlin)

        init()
    }

    private fun init() {
        values.add(Entry(1F , 2F))
        values.add(Entry(3F , 6F))
        values.add(Entry(4F , 9F))
        values.add(Entry(34F , 75F))
        values.add(Entry(40F , 60F))
        values.add(Entry(50F , 40F))
        dates.add("1401/04/19")
        dates.add("1401/04/20")
        dates.add("1401/04/21")
        dates.add("1401/04/22")
        dates.add("1401/04/23")
        dates.add("1401/04/24")

        val typeFace: Typeface = Typeface.createFromAsset(assets , "vazir.ttf")

        val lineDataSet = LineDataSet(values , "نمودار قیمت محصول").apply {
            valueTypeface = typeFace
            color = ContextCompat.getColor(this@Chart1KotlinActivity , R.color.red)
            lineWidth = 2f
            valueTextSize = 10f
            valueTextColor = ContextCompat.getColor(this@Chart1KotlinActivity , R.color.green)
            setCircleColor(ContextCompat.getColor(this@Chart1KotlinActivity , R.color.yellow))
            setDrawFilled(true)
            fillDrawable = ContextCompat.getDrawable(this@Chart1KotlinActivity , R.drawable.shape_chart)
            progressbar.toGone()
        }

        val iLineDataSet:MutableList<ILineDataSet> = ArrayList()
        iLineDataSet.add(lineDataSet)

        val lineData = LineData(iLineDataSet)

        lineChart.data = lineData
        val xAxis = lineChart.xAxis
        xAxis.labelCount = 4
        xAxis.valueFormatter = MyAxis()
        lineChart.animateX(500)
        lineChart.invalidate()

        // set font for title
        val legend: Legend = lineChart.legend
        legend.typeface = typeFace
        // set font for Left Y
        val leftAxis : YAxis = lineChart.axisLeft
        leftAxis.typeface = typeFace
        // Disable Right Y
        lineChart.axisRight.isEnabled = false
        // Disable Description
        lineChart.description.isEnabled = false
        // set font for Top X
        xAxis.isEnabled = true
        xAxis.typeface = typeFace

        lineChart.setNoDataText(getString(R.string.emptyChart))
        lineChart.setNoDataTextColor(R.color.orange)
    }

    inner class MyAxis : ValueFormatter() {
        override fun getAxisLabel(value: Float, axis: AxisBase?): String {
            return dates.getOrNull(value.toInt()) ?: value.toString()
        }
    }

}