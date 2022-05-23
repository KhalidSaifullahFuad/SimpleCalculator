package com.fuad.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {

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
    private Button btnSign;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnMul;

    @FXML
    private Button btnPercent;

    @FXML
    private Button btnSub;

    @FXML
    private Label secondaryDisplay;

    @FXML
    private Label display;

    private double number1;

    private double number2;

    private Button operator = null;

    private String displayText = "0";

    void initialize(){
        secondaryDisplay.setText("");
        displayText = "0";
        number1 = 0;
        number2 = 0;
        operator = null;
    }

    @FXML
    void doDisplay(ActionEvent event) {
        Button button = (Button) event.getSource();
        String numberText = button.getText();

        if (btnClear.equals(button)){
            initialize();
        } else if (btnBackspace.equals(button)) {
            displayText = displayText.length() == 1 ? "0" : displayText.replaceAll(".$", "");
        } else if (btnDecimal.equals(button)) {
            displayText = (displayText.equals("0") || !displayText.contains(".") ? displayText + "." : displayText);
        } else if (btnSign.equals(button)) {
            displayText = (Double.parseDouble(displayText) > 0 ? "-"+displayText : !displayText.equals("0") ? displayText.substring(1) : displayText);
        } else if (displayText.length() < 13) {
            displayText = (displayText.equals("0") ? numberText : displayText + numberText);
        }

        display.setText(displayText);
    }

    @FXML
    void doOperation(ActionEvent event) {
        Button button = (Button)event.getSource();

        if(btnEqual.equals(button)){
            if(operator != null){
                number2 = Double.parseDouble(display.getText());
                String result = calculate(number1, number2, operator);
                secondaryDisplay.setText(secondaryDisplay.getText() + " " + display.getText());
                display.setText(result);
                displayText = "";
            }
        }else{
            number1 = Double.parseDouble(display.getText());
            operator = button;
            secondaryDisplay.setText(display.getText() + " " + operator.getText());
            displayText = "";
        }
    }

    public String calculate(double number1, double number2, Button operator){

        double result = 0;

        if(btnAdd.equals(operator)) {
            result = number1 + number2;
        } else if (btnSub.equals(operator)) {
            result = number1 - number2;
        } else if (btnMul.equals(operator)) {
            result = number1 * number2;
        } else if (btnDiv.equals(operator)) {
            result = number1 / number2;
        }

        displayText = String.valueOf(result);

        return displayText.replaceAll("\\.0$", "");
    }

}
