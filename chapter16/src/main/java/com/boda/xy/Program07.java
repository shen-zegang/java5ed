package com.boda.xy;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
public class Program07 extends Application{
   @Override
   public void start(Stage stage){
	  StackPane rootNode = new StackPane();
	  Text text = new Text(20,50,"Programming is fun");
      Font font = Font.font("Times New Roman", FontWeight.BOLD, 
      FontPosture.ITALIC, 20);
      text.setFont(font);
	  text.setFill(Color.RED);
	  rootNode.getChildren().add(text);	  
	  EventHandler<ActionEvent> eventHandler = e->{
		 if(text.getText().length()!=0){
			 text.setText("");
		 }else{
			 text.setText("Programming is fun");
		 }
	  };
	
	  Timeline animation = new Timeline(
	      new KeyFrame(Duration.millis(400),eventHandler));
	  animation.setCycleCount(Timeline.INDEFINITE);
	  animation.play();
	  
	  text.setOnMouseClicked(e->{
		 if(animation.getStatus()==Animation.Status.PAUSED){
			 animation.play();
		 }else{
			 animation.pause();
		 }
	  });
	  
	  Scene scene = new Scene(rootNode,250,50);
	  stage.setTitle("闪烁的文本");
      stage.setScene(scene); 
      stage.show(); 
   }
   public static void main(String[]args){
	   Application.launch(args);
   }   
}

