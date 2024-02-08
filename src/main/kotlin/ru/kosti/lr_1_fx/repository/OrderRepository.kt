package ru.kosti.lr_1_fx.repository

import ru.kosti.lr_1_fx.model.OrderModel
import ru.kosti.lr_1_fx.model.OrderRequest

class OrderRepository(
    val orders: HashMap<Int, OrderModel> = HashMap(),
) {
    fun getById(id: Int) =
        orders[id]

    fun getAll() =
        orders.values.map { it }

    fun crete(order: OrderRequest) =
        order.toModel()
            .let { orders.put(it.id, it) }

    fun delete(id: Int) =
        orders.remove(id)

    private fun OrderRequest.toModel() =
        OrderModel(
            item = this.item,
            options = this.options
        )
}