package com.frontendmasters.coffeemasters

class Product(var id: Int, var name: String, price: Double,
        var image: String) {

    val imageUrl get() = "https://firtman.github.io/coffeematsers/api/images/${this.image}"
}

class Category(var name: String, products: MutableList<Product>)

class IteminCart(var product: Product, quantity: Int)