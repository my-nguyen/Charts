package com.chiragkachhadiya.charts

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chiragkachhadiya.charts.databinding.FragmentBarChartBinding
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class BarChartFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBarChartBinding.inflate(inflater, container, false)

        val barEntries = mutableListOf<BarEntry>()
        barEntries.add(BarEntry(2014f, 420f))
        barEntries.add(BarEntry(2015f, 475f))
        barEntries.add(BarEntry(2016f, 508f))
        barEntries.add(BarEntry(2017f, 660f))
        barEntries.add(BarEntry(2018f, 550f))
        barEntries.add(BarEntry(2019f, 630f))
        barEntries.add(BarEntry(2020f, 470f))

        val barDataSet = BarDataSet(barEntries, "Visitors")
        barDataSet.apply {
            colors = ColorTemplate.MATERIAL_COLORS.toList()
            valueTextColor = Color.BLACK
            valueTextSize = 16f
        }

        binding.barChart.apply {
            setFitBars(true)
            data = BarData(barDataSet)
            description.text = "Bar Chart Example"
            animateY(2000)
        }

        return binding.root
    }
}