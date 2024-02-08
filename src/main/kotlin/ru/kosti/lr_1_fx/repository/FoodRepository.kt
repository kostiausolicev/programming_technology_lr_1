package ru.kosti.lr_1_fx.repository

import ru.kosti.lr_1_fx.model.FoodModel

class FoodRepository {
    fun getByName(name: String) =
        foods[name]

    fun getAllNames() =
        foods.keys.map { it }

    companion object {
        @JvmStatic
        val foods: HashMap<String, FoodModel> = HashMap()
    }
}