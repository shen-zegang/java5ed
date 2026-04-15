package com.boda.xy;

import javafx.application.Application;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.BorderPane;


import javafx.stage.Stage;
public class Program03 extends Application{
   @Override
   public void start(Stage stage){  
	  BorderPane rootNode = new BorderPane();	  
	  Label label = new Label("Hello,JavaFX");
	  TextField  text = new TextField("Hello,JavaFX");
	  label.textProperty().bind(text.textProperty());
	  rootNode.setPadding(new Insets(0,0,10,0));
	  rootNode.setCenter(label);
	  rootNode.setBottom(text);
	  Scene scene = new Scene(rootNode,300,100);
      stage.setTitle("属性绑定");   
      stage.setScene(scene);       
      stage.show();                 
   }
   public static void main(String[]args){
	   launch(args);
   }
}


