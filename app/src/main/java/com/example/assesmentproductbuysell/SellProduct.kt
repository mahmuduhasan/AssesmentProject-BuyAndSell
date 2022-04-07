package com.example.assesmentproductbuysell

import com.example.assesmentproductbuysell.R

data class SellProduct(
    val id : Long,
    val name : String,
    val price : Double
)

val sellProductList = mutableListOf<SellProduct>()
