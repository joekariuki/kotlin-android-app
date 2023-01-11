package com.frontendmasters.coffeemasters

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


class DataManager {
    var menu: List<Category> by mutableStateOf(listOf())
    var cart: List<IteminCart> by mutableStateOf(listOf())

    fun cartAdd(product: Product) {
        var found = false
        cart.forEach {
            if (product.id==it.product.id) {
                it.quantity++
                found = true
            }
        }

        if (!found) {
            cart = listOf(*cart.toTypedArray(), IteminCart(product, 1))
        }
    }

    fun clear() {
        cart = listOf()
    }


    fun cartRemove(product: Product) {
        val aux = cart.toMutableList()
        aux.removeAll { it.product.id==product.id }
        cart = listOf(*aux.toTypedArray())
    }
}