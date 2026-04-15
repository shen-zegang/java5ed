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
public class FontDemo2 extends Application{
    @Override
    public void start(Stage stage){
	     Pane rootNode = new StackPane(); 
       Circle circle = new Circle();     
       circle.setRadius(50);
       circle.setStroke(Color.BLUE);
       circle.setFill(new Color(1.0,0.1,0.1,0.1));
       rootNode.getChildren().add(circle);
       // ����һ����ǩ����ӵ��������	
       Label label = new Label("JavaFX");
       Font font = Font.font("Times New Roman", FontWeight.BOLD, 
                               FontPosture.ITALIC, 20);
       label.setFont(font);                // ���ñ�ǩ�ı�����
       label.setTextFill(Color.BLUE);       // ���ñ�ǩ�ı���ɫ
       rootNode.getChildren().add(label);
       // ������̨����
       Scene scene = new Scene(rootNode, 240, 120);
       stage.setTitle("��ɫ����ʾ��");
       stage.setScene(scene);
       stage.show();
   }
   public static void main(String[]args){
	     launch(args);
   }
}

