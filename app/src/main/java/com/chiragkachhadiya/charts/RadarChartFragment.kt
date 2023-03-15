package com.chiragkachhadiya.charts

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chiragkachhadiya.charts.databinding.FragmentRadarChartBinding
import com.github.mikephil.charting.data.RadarData
import com.github.mikephil.charting.data.RadarDataSet
import com.github.mikephil.charting.data.RadarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter

class RadarChartFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRadarChartBinding.inflate(inflater, container, false)

        val radarData = RadarData()
        radarData.addDataSet(getRadarData1())
        radarData.addDataSet(getRadarData2())

        val labels = listOf("2014", "2015", "2016", "2017", "2018", "2019", "2020")
        binding.radarChart.apply {
            xAxis.valueFormatter = IndexAxisValueFormatter(labels)
            data = radarData
            description.text = "Radar Chart Example"
        }

        return binding.root
    }

    private fun getRadarData1(): RadarDataSet {
        val radarEntries = mutableListOf<RadarEntry>()
        radarEntries.add(RadarEntry(420f))
        radarEntries.add(RadarEntry(475f))
        radarEntries.add(RadarEntry(508f))
        radarEntries.add(RadarEntry(660f))
        radarEntries.add(RadarEntry(550f))
        radarEntries.add(RadarEntry(630f))
        radarEntries.add(RadarEntry(470f))

        return RadarDataSet(radarEntries, "Data Set 1").apply {
            color = Color.RED
            lineWidth = 2f
            valueTextColor = Color.RED
            valueTextSize = 14f
        }
    }

    private fun getRadarData2(): RadarDataSet {
        val radarEntries = mutableListOf<RadarEntry>()
        radarEntries.add(RadarEntry(310f))
        radarEntries.add(RadarEntry(420f))
        radarEntries.add(RadarEntry(685f))
        radarEntries.add(RadarEntry(820f))
        radarEntries.add(RadarEntry(490f))
        radarEntries.add(RadarEntry(730f))
        radarEntries.add(RadarEntry(200f))

        return RadarDataSet(radarEntries, "Data Set 2").apply {
            color = Color.BLUE
            lineWidth = 2f
            valueTextColor = Color.BLUE
            valueTextSize = 14f
        }
    }
}