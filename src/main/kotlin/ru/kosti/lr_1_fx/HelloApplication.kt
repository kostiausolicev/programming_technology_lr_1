package ru.kosti.lr_1_fx

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.ComboBox
import javafx.stage.Stage
import ru.kosti.lr_1_fx.model.FoodModel
import ru.kosti.lr_1_fx.repository.FoodRepository

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("hello-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 500.0, 240.0)
        val combobox = scene.lookup("#selectFoodComboBox") as ComboBox<String>
        FoodRepository.foods["test_food"] = FoodModel("test_food", 50, "some text")
        combobox.items.addAll(FoodRepository.foods.values.map { it.name })
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}