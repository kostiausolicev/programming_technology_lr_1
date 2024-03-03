package ru.kosti.lr_1_fx.model

data class OrderRequest(
    val item: FoodModel,
    val price: Int,
    val options: List<String> = emptyList()
)