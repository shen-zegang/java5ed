package com.boda.xy;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class Program02 extends Application {
    @Override
    public void start(Stage stage) {
    	HBox hbox = new HBox(10);
    	Button btn1 = new Button("第一页"),
    	       btn2 = new Button("上一页"),
    	       btn3 = new Button("下一页"),
    	       btn4 = new Button("最后页");
    	hbox.setAlignment(Pos.CENTER);
    	hbox.getChildren().addAll(btn1,btn2,btn3,btn4);
    	
    	Pane pane = new Pane();   	
    	Label label = new Label("这是一个标签");
    	pane.getChildren().add(label);
    	
    	BorderPane rootNode = new BorderPane();
    	rootNode.setPadding(new Insets(10,10,10,10));
    	rootNode.setCenter(pane);
    	rootNode.setBottom(hbox);
        Scene scene = new Scene(rootNode, 300, 100);
        stage.setTitle("面板布局示例");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
       launch(args);
    }	
}
