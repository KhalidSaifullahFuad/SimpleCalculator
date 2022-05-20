package com.fuad.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {

    private long number1;

    private long number2;

    private char operator;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnBackspace;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDecimal;

    @FXML
    private Button btnDiv;

    @FXML
    private Button btnEight;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnFive;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnMul;

    @FXML
    private Button btnNine;

    @FXML
    private Button btnOne;

    @FXML
    private Button btnPercent;

    @FXML
    private Button btnSeven;

    @FXML
    private Button btnSign;

    @FXML
    private Button btnSix;

    @FXML
    private Button btnSub;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnZero;

    @FXML
    private Label display;

    @FXML
    void doDisplay(ActionEvent event) {
        String numberText = ((Button) event.getSource()).getText();
        String displayText = display.getText();
        display.setText(displayText.equals("0") ? numberText : display.getText() + numberText);
    }

    @FXML
    void doOperation(ActionEvent event) {
        String buttonText = ((Button)event.getSource()).getText();

        if(buttonText.equals("=")){

        }else{

        }
    }

}
