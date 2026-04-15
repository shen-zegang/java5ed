package com.boda.xy;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Program01 extends Application {
    @Override
    public void start(Stage stage) {
    	HBox hbox1 = new HBox(10);
    	HBox hbox2 = new HBox(10);
    	for(int i = 1;i<=3;i++){
    		hbox1.getChildren().add(new Button("Button "+i));
    		hbox2.getChildren().add(new Button("Button "+(i+3)));
    	}
    	
    	FlowPane rootNode = new FlowPane();
    	rootNode.setPadding(new Insets(15, 10, 15, 10));
    	rootNode.setVgap(10);
    	rootNode.setHgap(10);
    	rootNode.getChildren().addAll(hbox1,hbox2);

        Scene scene = new Scene(rootNode, 300, 100);
        stage.setTitle("面板布局示例");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
       launch(args);
    }	
}
