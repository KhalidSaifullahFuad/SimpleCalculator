package com.fuad.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("calculator-view.fxml"));
        root.getStylesheets().add(getClass().getResource("font-family.css").toExternalForm());

        Scene scene = new Scene(root);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

//        scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
//            if(key.getCode()== KeyCode.ENTER) {
//                System.out.println("You pressed enter");
//            }
//        });
    }

    public static void main(String[] args) {
        launch();

    }
}