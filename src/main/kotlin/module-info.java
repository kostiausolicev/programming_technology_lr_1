module ru.kosti.lr_1_fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens ru.kosti.lr_1_fx to javafx.fxml;
    exports ru.kosti.lr_1_fx;
}