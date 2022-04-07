package com.example.assesmentproductbuysell

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.assesmentproductbuysell.Adapter.SellAdapter
import com.example.assesmentproductbuysell.databinding.FragmentSellBinding

class SellFragment : Fragment() {
    private lateinit var binding : FragmentSellBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSellBinding.inflate(inflater,container,false)
        val adapter = SellAdapter()
        binding.sellRecycleView.layoutManager = GridLayoutManager(activity,2)
        binding.sellRecycleView.adapter = adapter
        adapter.submitList(sellProductList)
        return binding.root
    }
}