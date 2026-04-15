package com.boda.xy;
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
import module javafx.controls;

public class HelloWorld extends Application {
    @Override
    public void start(Stage stage) {
       Label label = new Label("第一个JavaFX程序");
        StackPane rootNode = new StackPane();    // 创建面板作为根节点
        rootNode.getChildren().add(label);       // 将标签添加到根节点上
        // 创建场景对象，指定根节点对象和大小
        Scene scene = new Scene(rootNode, 300, 100);
        stage.setTitle("JavaFX程序");
        stage.setScene(scene);            // 将场景设置到舞台中
        stage.show();                       // 显示舞台窗口
    }
    public static void main(String[] args) {
        // 启动JavaFX应用程序
        Application.launch(args);
    }
}
