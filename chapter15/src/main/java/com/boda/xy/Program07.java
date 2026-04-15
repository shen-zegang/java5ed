package com.boda.xy;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Program07 extends Application{
   @Override
   public void start(Stage stage){  
	  HBox rootNode = new HBox();
	  rootNode.setPadding(new Insets(30,10,20,10));
	  Text [] text = new Text[5];
	  for(int i = 0;i<5;i++){
		  text[i] = new Text();
		  text[i].setText("Hello");
		  text[i].setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.ITALIC,20));
		  text[i].setFill(new Color(Math.random(),Math.random(),Math.random(),Math.random()));
		  text[i].setRotate(90);
		  rootNode.getChildren().add(text[i]);
	  }
	    
      Scene scene = new Scene(rootNode,300,90);
      stage.setTitle("显示多个文本");   
      stage.setScene(scene);       
      stage.show();                 
   }
   public static void main(String[]args){
	   launch(args);
   }
}


