package com.boda.xy;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Task2 extends Application {
    @Override
    public void start(Stage stage) {
    	BorderPane rootNode = new BorderPane();	  
    	Pane pane = new Pane(); 
    	HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);  
        //创建4个按钮并把它们添加到水平控件框中
        Button b1 = new Button("红色");
        Button b2 = new Button("绿色");
        Button b3 = new Button("蓝色");
        Button b4 = new Button("黄色");
        //Text text = new Text("HELLO,WORLD");
        //pane.getChildren().add(text);
        
         
        hbox.getChildren().addAll(b1,b2,b3,b4);
        hbox.setAlignment(Pos.CENTER);
        rootNode.setPadding(new Insets(0,0,10,0));
  	    rootNode.setCenter(pane);
  	    rootNode.setBottom(hbox);
  	    b1.setOnAction(e->{
  	    	pane.setStyle("-fx-background-color:#ff0000;");
	    });  
  	    b2.setOnAction(e->{
  	    	pane.setStyle("-fx-background-color:#00ff00;");
	    });  	    
  	    b3.setOnAction(e->{
	    	pane.setStyle("-fx-background-color:#0000ff;");
	    });  	    
     	b4.setOnAction(e->{
	    	pane.setStyle("-fx-background-color:#ffff00;");
        });  	    
  	   
  	    Scene scene = new Scene(rootNode,300,150);
        stage.setTitle("按钮示例");   
        stage.setScene(scene);       
        stage.show();                 
    }
    public static void main(String[] args) {
       launch(args);
    }	
}
