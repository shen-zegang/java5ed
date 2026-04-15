package com.boda.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherApp extends Application {
    private static final String API_KEY = "69b4952f1b21a0a33665aeb870d1d3b5";
    private ImageView imageView;
    private Label weatherLabel;
    private Label descriptionLabel;
    private Label tempLabel;
    private Label cityLabel;
    private TextField cityTextField;  // 城市输入框
    private Button searchButton;  // 搜索按钮
    private String city = "Beijing";  // 默认城市为北京

    @Override
    public void start(Stage stage) {
        imageView = new ImageView();
        imageView.setFitHeight(100);
        imageView.setPreserveRatio(true);
        imageView.setEffect(new DropShadow());

        // 创建标题标签
        Label label = new Label("查询天气");

        // 创建天气显示标签
        weatherLabel = new Label();
        descriptionLabel = new Label();
        descriptionLabel.getStyleClass().add("desc");
        tempLabel = new Label();
        tempLabel.getStyleClass().add("temp");

        // 创建城市输入框
        cityLabel = new Label("城市");
        cityTextField = new TextField();
        cityTextField.setPromptText("输入城市名...");
        cityTextField.setText(city);  // 默认显示 "Beijing"

        // 创建搜索按钮
        searchButton = new Button("搜索");
        searchButton.setOnAction(e -> {
            city = cityTextField.getText();  // 获取输入的城市
            if (!city.isEmpty()) {
                retrieveWeather();  // 触发查询天气操作
            }
        });

        // 创建顶部的输入框和按钮区域
        HBox searchBox = new HBox(10, cityLabel,cityTextField, searchButton);
        searchBox.setAlignment(Pos.CENTER);

        // 创建根布局
        VBox root = new VBox(10, label, searchBox, imageView, weatherLabel, descriptionLabel, tempLabel);
        root.setAlignment(Pos.CENTER);

        // 创建场景并设置样式
        Scene scene = new Scene(root, 500, 300);
        scene.getStylesheets().add(WeatherApp.class.getResource("/styles.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("天气预报App");
        stage.show();

        // 初始时查询默认城市的天气
        retrieveWeather();
    }

    private void retrieveWeather() {
        try {
            String restUrl = "https://api.openweathermap.org/data/2.5/weather?appid="
                    + API_KEY + "&q=" + city;
            ObjectMapper objectMapper = new ObjectMapper();
            Model model = objectMapper.readValue(new URL(restUrl), Model.class);
            updateModel(model);
        } catch (Exception e) {
            // 如果发生异常（例如城市不存在），弹出警告框
            showErrorDialog("城市名输入错误", "无法找到您输入的城市，请检查城市名。");
        }
    }

    private void updateModel(Model model) throws MalformedURLException, URISyntaxException {
        if (model != null) {
            if (!model.getWeather().isEmpty()) {
                Weather w = model.getWeather().get(0);
                imageView.setImage(new Image(new URL("http://openweathermap.org/img/wn/" + w.getIcon() + "@2x.png").
                        toURI().toString()));
                // 映射英文描述到中文
//                String mainDescription = getWeatherDescriptionInChinese(w.getMain());
//                String detailedDescription = getWeatherDescriptionInChinese(w.getDescription());
//
//                weatherLabel.setText(mainDescription);
//                descriptionLabel.setText(detailedDescription);
                weatherLabel.setText(w.getMain());
                descriptionLabel.setText(w.getDescription());
            }
            tempLabel.setText(String.format("温度：%.2f °C - 湿度：%.1f%%",
                    model.getMain().getTemp() - 273.15, model.getMain().getHumidity()));
        }
    }
//    private String getWeatherDescriptionInChinese(String description) {
//        switch (description.toLowerCase()) {
//            case "clear":
//                return "晴朗";
//            case "clouds":
//                return "多云";
//            case "rain":
//                return "下雨";
//            case "snow":
//                return "下雪";
//            case "thunderstorm":
//                return "雷暴";
//            case "drizzle":
//                return "细雨";
//            case "mist":
//                return "雾霾";
//            default:
//                return description;  // 默认返回原描述
//        }
//    }
    // 显示错误对话框
    private void showErrorDialog(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
