package com.example.assesmentproductbuysell

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.assesmentproductbuysell.Adapter.BuyAdapter
import com.example.assesmentproductbuysell.databinding.FragmentBuyBinding

class BuyFragment : Fragment() {
    private lateinit var binding : FragmentBuyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBuyBinding.inflate(inflater,container,false)
        val adapter = BuyAdapter()
        binding.buyProductRecycleView.layoutManager = GridLayoutManager(activity,2)
        binding.buyProductRecycleView.adapter = adapter
        adapter.submitList(buyProductList)
        return binding.root
    }

}