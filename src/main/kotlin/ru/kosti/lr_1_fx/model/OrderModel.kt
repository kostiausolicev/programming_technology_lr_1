package ru.kosti.lr_1_fx.model

data class OrderModel(
    val id: Int = ++staticId,
    val price: Int,
    val item: FoodModel,
    val options: List<String>? = null
) {
    override fun toString(): String =
        "Id: $id Name: ${item.name} Price: $price"

    companion object {
        @JvmStatic
        private var staticId = 0;
    }
}