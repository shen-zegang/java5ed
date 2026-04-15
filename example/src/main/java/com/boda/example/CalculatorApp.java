package com.boda.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    private TextField display = new TextField();
    private StringBuilder currentInput = new StringBuilder();
    private String operator = "";
    private double result = 0;
    private boolean isNewInput = true;
    private TextArea history = new TextArea();

    @Override
    public void start(Stage primaryStage) {
        // Main layout
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        // Display and history
        VBox topLayout = new VBox(10);
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setPrefHeight(50);

        // Set larger font size for the display TextField
        display.setStyle("-fx-font-size: 24px;");  // Set font size to 24px

        history.setEditable(false);
        history.setPrefHeight(100);
        history.setWrapText(true);

        // Set larger font size for the history TextArea
        history.setStyle("-fx-font-size: 16px;");  // Set font size for history

        topLayout.getChildren().addAll(display, history);

        // Buttons
        GridPane buttons = new GridPane();
        buttons.setHgap(10);
        buttons.setVgap(10);
        buttons.setAlignment(Pos.CENTER);

        String[] buttonLabels = {
                "7", "8", "9", "/", "C",
                "4", "5", "6", "*", "H",
                "1", "2", "3", "-", "=",
                "0", ".", "+", "", ""
        };

        for (int i = 0; i < buttonLabels.length; i++) {
            String label = buttonLabels[i];
            if (label.isEmpty()) continue;

            Button button = new Button(label);
            button.setPrefSize(60, 60);
            button.setOnAction(e -> handleButtonClick(label));

            int col = i % 5;
            int row = i / 5;
            buttons.add(button, col, row);
        }

        // Add layouts to the root
        root.setTop(topLayout);
        root.setCenter(buttons);

        // Set the scene
        Scene scene = new Scene(root, 400, 500);
        primaryStage.setTitle("JavaFX简易计算器");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(String label) {
        try {
            if (label.matches("[0-9.]")) {
                // Number or decimal point
                if (isNewInput) {
                    currentInput.setLength(0);
                    isNewInput = false;
                }
                currentInput.append(label);
                display.setText(currentInput.toString());
            } else if (label.matches("[+\\-*/]")) {
                // Operator
                calculateIntermediateResult();
                operator = label;
                isNewInput = true;
            } else if (label.equals("=")) {
                // Equals
                calculateIntermediateResult();
                display.setText(Double.toString(result));
                history.appendText(display.getText() + "\n");
                operator = "";
                isNewInput = true;
            } else if (label.equals("C")) {
                // Clear
                clear();
            } else if (label.equals("H")) {
                // Clear History
                history.clear();
            }
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    private void calculateIntermediateResult() {
        double currentNumber = currentInput.length() == 0 ? 0 : Double.parseDouble(currentInput.toString());
        if (operator.isEmpty()) {
            result = currentNumber;
        } else {
            switch (operator) {
                case "+" -> result += currentNumber;
                case "-" -> result -= currentNumber;
                case "*" -> result *= currentNumber;
                case "/" -> {
                    if (currentNumber == 0) throw new ArithmeticException("Division by zero");
                    result /= currentNumber;
                }
            }
        }
        display.setText(Double.toString(result));
        isNewInput = true;
    }

    private void clear() {
        display.clear();
        currentInput.setLength(0);
        operator = "";
        result = 0;
        isNewInput = true;
    }

    public static void main(String[] args) {
        launch(args);
    }
}


