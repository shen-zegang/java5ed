package com.boda.xy;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage; 
public class Program05 extends Application {
	@Override
    public void start(Stage stage) {
    	Pane rootNode = new Pane();   	
    	rootNode.setStyle("-fx-background-color: white;-fx-border-color:red");
    	rootNode.setPrefSize(350,200);
        Circle blue = new Circle(80,80,45);
        blue.setStroke(Color.BLUE);
        blue.setStrokeWidth(10);
        blue.setFill(null);        
        Circle black = new Circle(182,80,45);
        black.setStroke(Color.BLACK);
        black.setStrokeWidth(10);
        black.setFill(null);        
        Circle red = new Circle(284,80,45);
        red.setStroke(Color.RED);
        red.setStrokeWidth(10);
        red.setFill(null);        
        Circle yellow = new Circle(130,125,45);
        yellow.setStroke(Color.YELLOW);
        yellow.setStrokeWidth(10);
        yellow.setFill(null);       
        Circle green = new Circle(232,125,45);
        green.setStroke(Color.GREEN);
        green.setStrokeWidth(10);
        green.setFill(null);        
        Arc arc1 = new Arc(80,80,45,45,-10,30);
        arc1.setStroke(Color.BLUE);
        arc1.setStrokeWidth(10);
        arc1.setFill(null);        
      Arc arc2 = new Arc(130,125,45,45,70,30);
      arc2.setStroke(Color.YELLOW);
      arc2.setStrokeWidth(10);
      arc2.setFill(null);

      Arc arc3 = new Arc(182,80,45,45,0,20);
      arc3.setStroke(Color.BLACK);
      arc3.setStrokeWidth(10);
      arc3.setFill(null);
      
      Arc arc4 = new Arc(232,125,45,45,70,30);
      arc4.setStroke(Color.GREEN);
      arc4.setStrokeWidth(10);
      arc4.setFill(null);
      
        rootNode.getChildren().addAll(blue,yellow,black,green,red,arc2,arc1,arc4,arc3);
        Scene scene = new Scene(rootNode);
        stage.setTitle("奥运五环旗");
        stage.setScene(scene);
        stage.show();
    }
	public static void main(String[] args) {
	       launch(args);
    }
}

