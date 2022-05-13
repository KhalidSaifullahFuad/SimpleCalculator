module com.fuad.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fuad.calculator to javafx.fxml;
    exports com.fuad.calculator;
}