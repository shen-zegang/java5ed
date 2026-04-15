package com.boda.xy;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class ColorFontDemo extends Application{
    @Override
    public void start(Stage stage){
	      Pane rootNode = new StackPane(); 
	       Circle circle = new Circle();     
	       circle.setRadius(50);
	       circle.setStroke(Color.BLUE);
	       Color c = new Color(1.0,0.1,0.1,0.1);
	       //Color c = Color.web("0x0000ff",1.0);
	       circle.setFill(c);
	       rootNode.getChildren().add(circle);
	       	       
	       // 创建一个标签并添加到根面板中	
	       Label label = new Label("JavaFX编程");
	       Font font = Font.font("宋体", FontWeight.BOLD, 
	                   FontPosture.ITALIC, 50);
	       label.setFont(font);                // 设置标签文本字体
	       label.setTextFill(Color.BLUE);       // 设置标签文本颜色
	       rootNode.getChildren().add(label);
	       // 设置舞台场景
	       Scene scene = new Scene(rootNode, 240, 120);
	       stage.setTitle("颜色字体示例");
	       stage.setScene(scene);
	       stage.show();
   }
   public static void main(String[]args){
	     launch(args);
   }
}

