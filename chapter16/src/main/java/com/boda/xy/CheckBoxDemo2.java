package com.boda.xy;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
public class CheckBoxDemo2 extends Application{
	public void start(Stage stage){
		CheckBox cb1 = new CheckBox();            // 创建不带文本的复选框
		CheckBox cb2 = new CheckBox("文学");      // 创建带文本的复选框
		cb1.setText("体育");                         // 设置复选框文本
		cb1.setSelected(true);                      // 设置复选框为选中状态

		
		Pane pane = new Pane();
		
		HBox hbox = new HBox();
		hbox.getChildren().addAll(cb1,cb2);
		// ���������
		BorderPane rootNode = new BorderPane();	
		
		rootNode.setCenter(hbox);
		rootNode.setBottom(pane);
		rootNode.setAlignment(cb1, Pos.CENTER);
		// �����¼�����������
		
			
	    Scene scene = new Scene(rootNode, 250, 80);		
		stage.setScene(scene);
		stage.setTitle("��ѡ��ʾ��");
		stage.show();
	}
	public static void main(String[] args) {
	   launch(args);
	}
}
