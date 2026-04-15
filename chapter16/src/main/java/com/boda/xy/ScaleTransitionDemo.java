package com.boda.xy;

import java.io.File;

import javafx.animation.ScaleTransition;
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
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.paint.Color;
public class ScaleTransitionDemo extends Application{
	@Override
	public void start(Stage stage){	  
	   StackPane rootNode = new StackPane();
	   
	   Text text = new Text("Hello World");
	   text.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
	   text.setFill(Color.RED);
	   //创建缩放过渡对象 
	   ScaleTransition st = new ScaleTransition(Duration.millis(3000));
	   st.setByX(0.3);    //水平方向放大倍数
	   st.setByY(0.3);    //垂直方向放大倍数
	   st.setCycleCount(Animation.INDEFINITE);
	   st.setAutoReverse(true);
	   st.setNode(text);
	   st.play();
	   
	   rootNode.getChildren().add(text);
	   Scene scene = new Scene(rootNode,300,150);
	   stage.setTitle("缩放效果动画");
	   stage.setScene(scene); 
	   stage.show();    
	}

   public static void main(String[]args){
	   Application.launch(args);
   } 
}

