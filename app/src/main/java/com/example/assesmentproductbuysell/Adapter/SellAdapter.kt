package com.example.assesmentproductbuysell.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.assesmentproductbuysell.SellProduct
import com.example.assesmentproductbuysell.databinding.SellProductViewBinding

class SellAdapter : ListAdapter<SellProduct, SellAdapter.SellViewHolder>(SellDiffUtil()){
    class SellViewHolder(private val binding: SellProductViewBinding) : RecyclerView.ViewHolder(binding.root){
        fun sellBind(sellProduct : SellProduct){
            binding.product = sellProduct
        }
    }

    class SellDiffUtil : DiffUtil.ItemCallback<SellProduct>() {
        override fun areItemsTheSame(oldItem: SellProduct, newItem: SellProduct): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: SellProduct, newItem: SellProduct): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SellViewHolder {
        val binding = SellProductViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SellViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SellViewHolder, position: Int) {
        val product = getItem(position)
        holder.sellBind(product)
    }
}