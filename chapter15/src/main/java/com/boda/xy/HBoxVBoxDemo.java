package com.boda.xy;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HBoxVBoxDemo extends Application {
	   @Override
	   public void start(Stage myStage) {
	      myStage.setTitle("面板嵌套示例");
	     
	      BorderPane rootNode = new BorderPane();
	      rootNode.setTop(getHBox());
	      rootNode.setLeft(getVBox());
	      
	      Scene scene = new Scene(rootNode, 400, 200, Color.WHITE);
	      myStage.setScene(scene);
	       myStage.show();
	   }
	   
	   private HBox getHBox(){
		   HBox hbox = new HBox();
		   hbox.setPadding(new Insets(15,15,15,15));
		   hbox.setSpacing(5);
		   hbox.setStyle("-fx-background-color:gold");
		   hbox.getChildren().add(new Button("计算机科学"));
		   hbox.getChildren().add(new Button("物联网工程"));
		   ImageView imageView = new ImageView(new Image("images/coffee.gif"));
		   hbox.getChildren().add(imageView);
		   return hbox;
	   }
	   private VBox getVBox(){
		   VBox vbox = new VBox();
		   vbox.setPadding(new Insets(15,5,5,5));
		   
		   vbox.getChildren().add(new Label("课程"));
		   
		   Label courses[] = {new Label("数据库原理"),new Label("操作系统"),
				   new Label("物联网概论"),new Label("大数据技术")};
		   for(Label course:courses){
			   VBox.setMargin(course, new Insets(0,0,0,15));
			   vbox.getChildren().add(course);
		   }
		   return vbox;
	   }	      
	   public static void main(String[] args) {
	        launch(args);
	   }
	}