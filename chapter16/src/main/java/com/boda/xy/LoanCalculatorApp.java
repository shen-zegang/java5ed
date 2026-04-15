package com.boda.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculatorApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("贷款计算器");

        // 创建布局
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // 创建控件
        Label rateLabel = new Label("年利率 (%)：");
        TextField rateField = new TextField();
        rateField.setPromptText("年利率");

        Label amountLabel = new Label("贷款金额：");
        TextField amountField = new TextField();
        amountField.setPromptText("贷款金额");

        Label yearsLabel = new Label("贷款年数：");
        TextField yearsField = new TextField();
        yearsField.setPromptText("贷款年数");

        Button calculateButton = new Button("计算");

        // 将控件添加到布局

        grid.add(amountLabel, 0, 0);
        grid.add(amountField, 1, 0);
        grid.add(yearsLabel, 0, 1);
        grid.add(yearsField, 1, 1);
        grid.add(rateLabel, 0, 2);
        grid.add(rateField, 1, 2);

        grid.add(calculateButton, 1, 3);

        // 事件处理：计算按钮点击事件
        calculateButton.setOnAction(e -> {
            try {
                // 获取用户输入
                double annualRate = Double.parseDouble(rateField.getText()) / 100; // 转换为小数
                double loanAmount = Double.parseDouble(amountField.getText());
                int loanYears = Integer.parseInt(yearsField.getText());

                // 计算每月支付额和总偿还金额
                double monthlyRate = annualRate / 12;  // 每月利率
                int totalMonths = loanYears * 12; // 贷款总期数

                // 计算每月支付额
                double monthlyPayment = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, totalMonths))
                        / (Math.pow(1 + monthlyRate, totalMonths) - 1);

                // 计算总偿还金额
                double totalRepayment = monthlyPayment * totalMonths;

                // 显示结果
                showResultDialog(monthlyPayment, totalRepayment);
            } catch (NumberFormatException ex) {
                showErrorDialog("请输入有效的数字！");
            }
        });

        // 设置场景并显示窗口
        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 显示计算结果的对话框
    private void showResultDialog(double monthlyPayment, double totalRepayment) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("计算结果");
        alert.setHeaderText("贷款信息");
        alert.setContentText(String.format("每月支付额：%.2f 元\n总偿还金额：%.2f 元", monthlyPayment, totalRepayment));
        alert.showAndWait();
    }

    // 显示错误对话框
    private void showErrorDialog(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("错误");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

