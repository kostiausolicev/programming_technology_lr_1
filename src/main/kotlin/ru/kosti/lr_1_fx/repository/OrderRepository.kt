package ru.kosti.lr_1_fx.repository

import ru.kosti.lr_1_fx.model.OrderModel
import ru.kosti.lr_1_fx.model.OrderRequest

class OrderRepository {
    fun getById(id: Int) =
        orders[id]

    fun create(order: OrderRequest) =
        order.toModel()
            .also { orders[it.id] = it }

    fun delete(id: Int) =
        orders.remove(id)

    private fun OrderRequest.toModel() =
        OrderModel(
            item = this.item,
            price = this.price,
            options = this.options
        )

    companion object {
        @JvmStatic
        val orders: HashMap<Int, OrderModel> = HashMap()
    }
}