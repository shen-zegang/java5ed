package com.boda.xy;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class Program04 extends Application{
   @Override
   public void start(Stage stage){
	  GridPane rootNode = new GridPane();
	  Rectangle [][] r = new Rectangle[8][8];
	  for(int i = 0;i <=7 ;i++){
		  for(int j = 0; j<=7;j++){
			  r[i][j] = new Rectangle();
			  r[i][j].setWidth(35); 
			  r[i][j].setHeight(35);
			  if((i+j)%2==0){
				  r[i][j].setFill(Color.WHITE);  
			  }else{
				  r[i][j].setFill(Color.BLACK);
			  }
			  rootNode.add(r[i][j], i, j);
		  }
	  }	     
      Scene scene = new Scene(rootNode);
      stage.setTitle("显示象棋盘");   
      stage.setScene(scene);       
      stage.show();                 
   }
   public static void main(String[]args){
	   launch(args);
   }
}

