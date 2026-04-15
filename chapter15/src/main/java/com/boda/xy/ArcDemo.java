package com.boda.xy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ArcDemo extends Application {
   @Override
   public void start(Stage stage){
	    Pane rootNode = new Pane();
		for(int startAngle = 0; startAngle<360;startAngle+=90){
		      Arc arc = new Arc(150,100,80,80,startAngle,45);
		      arc.setFill(Color.LIGHTGRAY);
		      arc.setType(ArcType.ROUND);
		      rootNode.getChildren().add(arc);  
		}         
	     Scene scene = new Scene(rootNode, 300, 200);
	     stage.setTitle("圆弧示例");
	     stage.setScene(scene);
	     stage.show();
	}
   
   public static void main(String[] args) {
     launch(args);
   }
}
