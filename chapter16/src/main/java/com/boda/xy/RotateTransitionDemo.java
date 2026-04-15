package com.boda.xy;
import java.io.File;

import javafx.animation.RotateTransition;
import javafx.animation.Animation;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.paint.Color;
public class RotateTransitionDemo extends Application{
	@Override
    public void start(Stage stage){	  
		StackPane rootNode = new StackPane();
		Text text = new Text("Hello World");
		text.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
		text.setFill(Color.RED);
		//创建旋转过渡对象 
		RotateTransition rt = new RotateTransition(Duration.millis(3000));
		rt.setByAngle(360);
		rt.setCycleCount(Animation.INDEFINITE);
		rt.setNode(text);
		rt.play();
    	rootNode.getChildren().add(text);
		Scene scene = new Scene(rootNode,250,200);
		stage.setTitle("旋转效果动画");
	    stage.setScene(scene); 
	    stage.show();    
	}

   public static void main(String[]args){
	   Application.launch(args);
   } 
}

