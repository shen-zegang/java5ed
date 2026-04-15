package com.boda.xy;
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
import module javafx.controls;
public class PaneDemo extends Application {
	@Override
    public void start(Stage stage) {
       Pane rootNode = new Pane();
       //rootNode.setPrefSize(300,200);
	   Circle circle = new Circle(25,Color.BLUE);
       circle.setCenterX(100);
       circle.setCenterY(50);
       Rectangle rectangle = new Rectangle(100,30,Color.RED);
       rectangle.relocate(100,50);
       rectangle.setRotate(-33);
       rootNode.getChildren().addAll(circle,rectangle);
       Scene scene = new Scene(rootNode,300,120);
       stage.setTitle("Pane面板示例");
       stage.setScene(scene);
       stage.show();
     }

	   public static void main(String[] args) {
	       launch(args);
    }
}


