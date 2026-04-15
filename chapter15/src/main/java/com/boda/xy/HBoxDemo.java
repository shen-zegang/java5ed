package com.boda.xy;
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;

import module javafx.controls;
public class HBoxDemo extends Application {
    @Override
    public void start(Stage stage) {
	      var hbox = new HBox();
	        hbox.setPadding(new Insets(15, 12, 15, 12));
	        hbox.setSpacing(10); 
	        hbox.setStyle("-fx-background-color:#336699;");    
	        
	        var button1 = new Button("确定");
	var button2 = new Button("取消");
	        button1.setPrefSize(200, 20);        
	        button2.setPrefSize(100, 20);
	        hbox.getChildren().addAll(button1, button2);
	        var scene = new Scene(hbox, 300, 50);
	        stage.setTitle("HBox示例");
	        stage.setScene(scene);
	        stage.show();

    }
    public static void main(String[] args) {
       launch(args);
    }	
}
