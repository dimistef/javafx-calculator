package sample;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class Controller {
    @FXML private Label displayNumber;
    @FXML private Label displayOperator;
    @FXML private Label labelError;
    @FXML private TextField screen;

    private String firstNum = "";
    private String operator;
    private String currentNum = "";
    private int result;

    public void selectedOperator(String op) {
        operator = op;
        displayOperator.setText(operator);
        firstNum = currentNum;
        currentNum = "";
        displayNumber.setText(firstNum);
    }

    public void calculate (ActionEvent event) {
        int firstNumber = Integer.parseInt(firstNum);
        int secondNumber = Integer.parseInt(currentNum);
        displayOperator.setText("");

        if (operator.equals("+")) {
            result = firstNumber + secondNumber;
            displayNumber.setText(Integer.toString(result));
            currentNum = Integer.toString(result);
        }
        else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
            displayNumber.setText(Integer.toString(result));
            currentNum = Integer.toString(result);
        }
        else if (operator.equals("*")) {
            result = firstNumber * secondNumber;
            displayNumber.setText(Integer.toString(result));
            currentNum = Integer.toString(result);
        }
        else if (operator.equals("/")) {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
                displayNumber.setText(Integer.toString(result));
                currentNum = Integer.toString(result);
            } else {
                displayNumber.setText("");
                screen.setStyle("-fx-background-color: #990000;");
                displayOperator.setText("");
                labelError.setText("Can't divide by zero!");
                FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2.5), labelError);
                fadeTransition.setToValue(1.0);
                fadeTransition.setToValue(0.0);
                fadeTransition.setCycleCount(Animation.INDEFINITE);
                fadeTransition.play();
            }
        }
        firstNum = "";
    }

    public void clear (ActionEvent event) {
        currentNum = "";
        firstNum = "";
        displayNumber.setText("");
        displayOperator.setText("");
        labelError.setText("");
        screen.setStyle("-fx-background-color: DarkGreen;");
    }

    public void one (ActionEvent event) {
        currentNum = currentNum + "1";
        displayNumber.setText(currentNum);
        labelError.setText("");
        screen.setStyle("-fx-background-color: DarkGreen;");
    }

    public void two (ActionEvent event) {
        currentNum = currentNum + "2";
        displayNumber.setText(currentNum);
        labelError.setText("");
        screen.setStyle("-fx-background-color: DarkGreen;");
    }

    public void three(ActionEvent event) {
        currentNum = currentNum + "3";
        displayNumber.setText(currentNum);
        labelError.setText("");
        screen.setStyle("-fx-background-color: DarkGreen;");
    }

    public void four (ActionEvent event) {
        currentNum = currentNum + "4";
        displayNumber.setText(currentNum);
        labelError.setText("");
        screen.setStyle("-fx-background-color: DarkGreen;");
    }

    public void five (ActionEvent event) {
        currentNum = currentNum + "5";
        displayNumber.setText(currentNum);
        labelError.setText("");
        screen.setStyle("-fx-background-color: DarkGreen;");
    }

    public void six (ActionEvent event) {
        currentNum = currentNum + "6";
        displayNumber.setText(currentNum);
        labelError.setText("");
        screen.setStyle("-fx-background-color: DarkGreen;");
    }

    public void seven (ActionEvent event) {
        currentNum = currentNum + "7";
        displayNumber.setText(currentNum);
        labelError.setText("");
        screen.setStyle("-fx-background-color: DarkGreen;");
    }

    public void eight (ActionEvent event) {
        currentNum = currentNum + "8";
        displayNumber.setText(currentNum);
        labelError.setText("");
        screen.setStyle("-fx-background-color: DarkGreen;");
    }

    public void nine (ActionEvent event) {
        currentNum = currentNum + "9";
        displayNumber.setText(currentNum);
        labelError.setText("");
        screen.setStyle("-fx-background-color: DarkGreen;");
    }

    public void zero (ActionEvent event) {
        currentNum = currentNum + "0";
        displayNumber.setText(currentNum);
        labelError.setText("");
        screen.setStyle("-fx-background-color: DarkGreen;");
    }

    public void divide (ActionEvent event) {
        selectedOperator("/");
    }

    public void multiply (ActionEvent event) {
        selectedOperator("*");
    }

    public void subtract (ActionEvent event) {
        selectedOperator("-");
    }

    public void add (ActionEvent event) {
        selectedOperator("+");
    }
}