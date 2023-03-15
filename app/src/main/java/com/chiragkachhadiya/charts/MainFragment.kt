package com.chiragkachhadiya.charts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.chiragkachhadiya.charts.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.barChart.setOnClickListener {
            findNavController().navigate(R.id.action_barChart)
        }
        binding.pieChart.setOnClickListener {
            findNavController().navigate(R.id.action_pieChart)
        }
        binding.radarChart.setOnClickListener {
            findNavController().navigate(R.id.action_radarChart)
        }
        return binding.root
    }
}