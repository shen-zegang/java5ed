package com.boda.xy;
import java.util.*;
import java.net.*;
import java.io.*;
import module javafx.controls;
public class ComputeArea extends Application {
    private TextField radiusTextField;      // 输入半径的文本框
    private Label resultLabel;              // 显示面积结果的标签
    @Override
    public void start(Stage stage) {
        // 创建输入提示标签和文本框
        Label promptLabel = new Label("请输入半径：");
        radiusTextField = new TextField();
        radiusTextField.setPromptText("例如：10");
        // 创建按钮
        Button calculateButton = new Button("确定");
        calculateButton.setOnAction(e -> calculateArea());
        // 布局输入框和按钮
        HBox inputBox = new HBox(10, promptLabel,
                radiusTextField, calculateButton);
        inputBox.setAlignment(Pos.CENTER);
        // 显示结果的标签
        resultLabel = new Label("面积：");
        // 主布局
        VBox root = new VBox(15, inputBox, resultLabel);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        // 创建场景
        Scene scene = new Scene(root, 350, 150);
        stage.setScene(scene);
        stage.setTitle("计算圆面积");
        stage.show();
    }
    private void calculateArea() {
        try {
            // 获取用户输入的半径
            String radiusText = radiusTextField.getText();
            double radius = Double.parseDouble(radiusText);
            // 构造请求 URL，通过请求参数项服务器传递数据
            String urlString =
                    "http://localhost:8080/api/calculateArea?radius=" + radius;
            URL url = new URI(urlString).toURL();
            // 打开 HTTP 连接
            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            // 获取返回结果
            Scanner scanner = new Scanner(connection.getInputStream());
            String response = scanner.nextLine();
            scanner.close();
            // 设置结果到标签
            resultLabel.setText("面积：" + response);
        } catch (NumberFormatException | URISyntaxException e) {
            showErrorDialog("输入错误", "请输入有效的数字！");
        } catch (Exception e) {
            showErrorDialog("请求错误", "无法连接到服务器，请确保服务器正在运行。");
        }
    }
    private void showErrorDialog(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    public static void main(String[] args) {
        launch();
    }
}
