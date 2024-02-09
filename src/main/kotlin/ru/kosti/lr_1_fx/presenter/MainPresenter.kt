package ru.kosti.lr_1_fx.presenter

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.*

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

    }

    @FXML
    fun selectedFoodItem(actionEvent: ActionEvent) {

    }

    @FXML
    fun clickOrderButton(actionEvent: ActionEvent) {

    }

    @FXML
    fun showOrderButtonClick(actionEvent: ActionEvent) {

    }

}