package ru.kosti.lr_1_fx.model

import ru.kosti.lr_1_fx.model.FoodModel

data class OrderRequest(
    val item: FoodModel,
    val options: List<String>? = null
)