package ru.kosti.lr_1_fx.model

data class OrderModel(
    val id: Int = ++staticId,
    val item: FoodModel,
    val options: List<String>? = null
) {
    companion object {
        private var staticId = 0;
    }
}