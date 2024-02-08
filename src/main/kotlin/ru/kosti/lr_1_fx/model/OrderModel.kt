package ru.kosti.lr_1_fx.model

data class OrderModel(
    val id: Int = ++staticId,
    val item: FoodModel,
    val options: List<String>? = null
) {
    companion object {
        @JvmStatic
        private var staticId = 0;
    }
}