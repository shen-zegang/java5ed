package com.boda.xy;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Program04 extends Application {
	@Override
     public void start(Stage stage) {
	   final Circle circle = new Circle(140,50,40, Color.WHITE); 
	   circle.setStroke(Color.BLACK);
	   StackPane rootNode = new StackPane();
	   rootNode.getChildren().addAll(circle);      
       
       circle.setOnMouseEntered(new EventHandler<MouseEvent>() {
    	   public void handle(MouseEvent me) {
    		     circle.setFill(Color.BLUE); 
    	     }
    	   });
      circle.setOnMouseExited(new EventHandler<MouseEvent>() {
    	        public void handle(MouseEvent me) {
    		       circle.setFill(Color.RED); 
    	        }
      });
      Scene scene = new Scene(rootNode, 280, 120);
      stage.setTitle("鼠标事件");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String[] args) {
	      launch(args);
   }
}

