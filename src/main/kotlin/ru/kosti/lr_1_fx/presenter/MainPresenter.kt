package ru.kosti.lr_1_fx.presenter

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.*
import ru.kosti.lr_1_fx.repository.FoodRepository
import ru.kosti.lr_1_fx.repository.OrderRepository

class MainPresenter {
    // Show orders
    @FXML
    lateinit var ordersListView: ListView<String>

    @FXML
    lateinit var orderIdTextField: TextField

    // Complete order
    @FXML
    lateinit var orderPriceLabel: Label

    @FXML
    lateinit var compositionOrderLabel: Label

    @FXML
    lateinit var foodNameLabel: Label

    // Create order
    @FXML
    lateinit var withoutTomatoes: CheckBox

    @FXML
    lateinit var withoutCucumbers: CheckBox

    @FXML
    lateinit var extraSauce: CheckBox

    @FXML
    lateinit var selectFoodComboBox: ComboBox<String>

    @FXML
    lateinit var priceLabel: Label

    @FXML
    fun selectedSauce(actionEvent: ActionEvent) {
        val priceText = priceLabel.text
        val newPrice = if (extraSauce.isSelected)
            (priceText.split(' ')[1].toInt()) + 10
        else (priceText.split(' ')[1].toInt()) - 10
        priceLabel.text = priceLabel.text.split(' ')[0] + ' ' + newPrice.toString()
    }

    @FXML
    fun selectedFoodItem(actionEvent: ActionEvent) {
        val foodItem = selectFoodComboBox
            .value
            ?.let { foodRepository.getByName(it) }
            ?: throw Exception()
        val priceText = priceLabel.text
        val newPrice = (priceText.split(' ')[1].toInt()) + foodItem.price

        priceLabel.text = priceLabel.text.split(' ')[0] + ' ' + newPrice.toString()
    }

    @FXML
    fun clickOrderButton(actionEvent: ActionEvent) {

    }

    @FXML
    fun showOrderButtonClick(actionEvent: ActionEvent) {

    }

    companion object {
        @JvmStatic
        private val foodRepository = FoodRepository()

        @JvmStatic
        private val orderRepository = OrderRepository()
    }
}