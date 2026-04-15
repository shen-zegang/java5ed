package com.boda.xy;

//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;

import module javafx.controls;
public class VBoxDemo extends Application {
    @Override
    public void start(Stage stage) {
    	VBox vbox = new VBox(10);
    	vbox.setPadding(new Insets(15,12,15,12));
    	Button red = new Button("红色"),
    		green = new Button("绿色"),
    		blue = new Button("蓝色"),
    		yellow = new Button("黄色");
    	blue.setPrefSize(100,20);
    	vbox.getChildren().addAll(red,green,blue,yellow);
    	//vbox.setAlignment(Pos.CENTER);
    	Scene scene = new Scene(vbox, 300, 200);
        stage.setTitle("VBox面板示例");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
       launch(args);
    }	
}