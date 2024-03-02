package ru.kosti.lr_1_fx

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.ComboBox
import javafx.stage.Stage
import ru.kosti.lr_1_fx.model.FoodModel
import ru.kosti.lr_1_fx.repository.FoodRepository

class Lr1Application : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(Lr1Application::class.java.getResource("order-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 500.0, 240.0)
        val combobox = scene.lookup("#selectFoodComboBox") as ComboBox<String>
        initFoods()
        combobox.items.addAll(FoodRepository.foods.values.map { it.name })
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }

    private fun initFoods() {
        FoodRepository.foods["test_food"] = FoodModel("test_food", 50, "some text")
        FoodRepository.foods["burger"] = FoodModel("burger", 100, "meet, sauce, salade, buns")
        FoodRepository.foods["fries"] = FoodModel("fries", 20, "potato, salt")
    }
}

fun main() {
    Application.launch(Lr1Application::class.java)
}