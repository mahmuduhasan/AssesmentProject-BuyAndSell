package com.example.assesmentproductbuysell

import com.example.assesmentproductbuysell.R

data class BuyProduct(
    val id : Long,
    val name : String,
    val price : Double
)

var buyProductList = mutableListOf<BuyProduct>(
    BuyProduct(1,"Asus Headset", 299.99),
    BuyProduct(2,"Lenovo Headset", 599.59),
    BuyProduct(3,"Boat Headset", 199.99),
    BuyProduct(4,"HP Headset", 699.99),
    BuyProduct(5,"Walton Headset", 99.99),
    BuyProduct(6,"Sony Headset", 79.99),
)
