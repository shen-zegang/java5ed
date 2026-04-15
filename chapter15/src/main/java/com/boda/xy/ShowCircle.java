package com.boda.xy;
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.stage.Stage;

import module javafx.controls;
public class ShowCircle extends Application{
	@Override
	public void start(Stage stage){
	   Pane rootNode = new Pane();	    
	   Circle circle = new Circle(85,45,40,Color.WHITE);
	   circle.setStroke(Color.BLUE);
	   
	   circle.centerXProperty().bind(rootNode.widthProperty().divide(2));
	   circle.centerYProperty().bind(rootNode.heightProperty().divide(2));
	   
	   rootNode.getChildren().add(circle);
	   Scene scene = new Scene(rootNode, 100, 100);
	   stage.setTitle("显示圆对象"); 
	   stage.setScene(scene); 
	   stage.show();   
	}
	public static void main(String[] args) {
	    Application.launch(args);
    }
}


