package com.boda.xy;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
public class Program08 extends Application{
   @Override
   public void start(Stage stage){
	   Pane rootNode = new Pane();
	   Text text = new Text("不忘初心，牢记使命！");
	   text.setFont(Font.font("宋体",20));
	   text.setFill(Color.BLUE);
	   rootNode.getChildren().add(text);	  
 	   PathTransition pt = new PathTransition(Duration.millis(5000),
 			   new Line(500,25,-250,25),text); 
	   pt.setCycleCount(5);
	   pt.play();
	   	     
 	   Scene scene = new Scene(rootNode,250,50);
	   stage.setTitle("滚动字幕");
       stage.setScene(scene); 
       stage.show(); 
   }
   public static void main(String[]args){
	   Application.launch(args);
   } 
}
