package com.boda.xy;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage; 
public class AnchorPaneDemo extends Application {
	public static void main(String[] args) {
	       launch(args);
	    }
    @Override
    public void start(Stage stage) {
    	AnchorPane rootNode = new AnchorPane();
    	TextArea text = new TextArea();
    	text.setPrefRowCount(4);
    	text.setPrefColumnCount(15);
    	AnchorPane.setTopAnchor(text, 16.0);
    	AnchorPane.setLeftAnchor(text, 5.0);

    	Button button1 = new Button("确定");
    	Button button2 = new Button("取消");
    	HBox hb = new HBox();
    	hb.setPadding(new Insets(0, 10, 10, 10));
    	hb.setSpacing(10);
    	hb.getChildren().addAll(button1, button2);
    	AnchorPane.setBottomAnchor(hb, 8.0);
    	AnchorPane.setRightAnchor(hb, 5.0);
    	rootNode.getChildren().addAll(text,hb);
  	
        Scene scene = new Scene(rootNode, 350, 150);
        stage.setTitle("锚面板示例");
        stage.setScene(scene);
        stage.show();
    }
}
