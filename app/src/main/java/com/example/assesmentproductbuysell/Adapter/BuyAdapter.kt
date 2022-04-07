package com.example.assesmentproductbuysell.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.assesmentproductbuysell.BuyProduct
import com.example.assesmentproductbuysell.SellProduct
import com.example.assesmentproductbuysell.buyProductList
import com.example.assesmentproductbuysell.databinding.BuyProductViewBinding
import com.example.assesmentproductbuysell.sellProductList

class BuyAdapter : ListAdapter<BuyProduct, BuyAdapter.BuyViewHolder>(BuyDiffUtil()) {
    class BuyViewHolder(val binding: BuyProductViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun getBind(buyProduct: BuyProduct) {
            binding.product = buyProduct
        }
    }

    class BuyDiffUtil : DiffUtil.ItemCallback<BuyProduct>() {
        override fun areItemsTheSame(oldItem: BuyProduct, newItem: BuyProduct): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: BuyProduct, newItem: BuyProduct): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuyViewHolder {
        val binding = BuyProductViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BuyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BuyViewHolder, position: Int) {
        val product = getItem(position)
        holder.getBind(product)
        val id = System.currentTimeMillis()
        val name = product.name
        val price = product.price

        val sellProduct = SellProduct(id,name,price)
        holder.binding.buyButton.setOnClickListener {
            buyProductList.removeAt(position)
            sellProductList.add(sellProduct)
        }
    }
}