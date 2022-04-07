package com.example.assesmentproductbuysell

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.assesmentproductbuysell.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.myProductButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_sellFragment)
        }

        binding.buyButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_buyFragment)
        }
        return binding.root
    }

}