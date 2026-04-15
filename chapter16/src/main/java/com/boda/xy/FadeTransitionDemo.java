package com.boda.xy;
//import javafx.animation.Animation;
//import javafx.animation.FadeTransition;
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//import javafx.util.Duration;

import module javafx.controls;
public class FadeTransitionDemo extends Application{
    @Override
    public void start(Stage stage){
	    Text text = new Text("JavaFX Programming") ;
	    text.setFont(new Font(20));
    	text.setFill(Color.BLUE);
    	
    	FadeTransition ft = new FadeTransition(Duration.millis(2000));
    	ft.setFromValue(0.0);
    	ft.setToValue(1.0);
    	ft.setCycleCount(Animation.INDEFINITE);
    	ft.setAutoReverse(true);
    	ft.setNode(text);
    	ft.play();
    	
	    // 设置主舞台场景
 	    StackPane rootNode = new StackPane();
        rootNode.getChildren().add(text);	  
        Scene scene = new Scene(rootNode,250,100);
	    stage.setTitle("淡入淡出动画");
        stage.setScene(scene); 
        stage.show(); 
   }

   public static void main(String[]args){
	   Application.launch(args);
   } 
}

