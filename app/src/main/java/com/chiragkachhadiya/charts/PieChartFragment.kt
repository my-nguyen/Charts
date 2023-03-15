package com.chiragkachhadiya.charts

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chiragkachhadiya.charts.databinding.FragmentPieChartBinding
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate

class PieChartFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPieChartBinding.inflate(inflater, container, false)

        val pieEntries = mutableListOf<PieEntry>()
        pieEntries.add(PieEntry(508f, "2016"))
        pieEntries.add(PieEntry(600f, "2017"))
        pieEntries.add(PieEntry(750f, "2018"))
        pieEntries.add(PieEntry(600f, "2019"))
        pieEntries.add(PieEntry(670f, "2020"))

        val pieDataSet = PieDataSet(pieEntries, "Visitors")
        pieDataSet.apply {
            colors = ColorTemplate.MATERIAL_COLORS.toList()
            valueTextColor = Color.BLACK
            valueTextSize = 16f
        }

        binding.pieChart.apply {
            data = PieData(pieDataSet)
            description.isEnabled = false
            centerText = "Visitors"
            animate()
        }

        return binding.root
    }
}