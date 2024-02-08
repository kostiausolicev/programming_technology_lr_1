package ru.kosti.lr_1_fx.model

data class OrderRequest(
    val item: FoodModel,
    val options: List<String>? = null
)