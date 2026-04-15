package com.boda.xy;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Task1 extends Application {
    @Override
    public void start(Stage stage) {
	    HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10); 
        // 设置控件框的样式
        hbox.setStyle("-fx-background-color:#336699;");    
        //创建两个按钮并把它们添加到水平控件框中
        TextField tf1 = new TextField();
        tf1.setPrefSize(200, 20);        // 设置按钮的优先大小
        TextField tf2 = new TextField();
        tf2.setPrefSize(200, 20);     
        tf1.setOnAction(e->{
	    	String text = tf1.getText();
	    	tf2.setText(text);
	      });    
        hbox.getChildren().addAll(tf1, tf2);
        Scene scene = new Scene(hbox, 300, 50);
        stage.setTitle("动作事件");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
       launch(args);
    }	
}
