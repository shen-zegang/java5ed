package com.boda.xy;

import java.io.InputStream;
import module javafx.controls;
import module java.sql;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;

public class RetrieveStudent extends Application {
	  Connection conn = null;
	  Statement stmt = null;
	  ResultSet rst = null;
	  Label sno = new Label("请输入学号");
	  Label name = new Label("姓名：");
	  TextField tf = new TextField();
	  Button ok = new Button("确定");
	  Label photo = new Label();

	  @Override
	  public void init() {
		  var dburl = 
"jdbc:mysql://127.0.0.1:3306/webstore?serverTimezone=UTC";
		  try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  conn = DriverManager.getConnection(dburl, "root", "123456");
		  } catch (ClassNotFoundException cne) {
			  cne.printStackTrace();
		  } catch (SQLException sqle) {
			  sqle.printStackTrace();
		  }
	  }

@Override
	  public void start(Stage stage) {
		  VBox vbox1 = new VBox();
		  vbox1.setSpacing(10);
		  vbox1.getChildren().addAll(sno, tf, ok, name);
		  HBox hbox2 = new HBox();
		  hbox2.setSpacing(10);
		  hbox2.setPadding(new Insets(10, 10, 10, 10));
		  hbox2.getChildren().addAll(photo);
		  BorderPane rootPane = new BorderPane();
		  rootPane.setPadding(new Insets(10, 10, 10, 10));
		  rootPane.setCenter(hbox2);
		  rootPane.setRight(vbox1);

		  var handler = new ButtonHandler(); // 创建事件处理器对象
		  ok.setOnAction(handler);
		  Scene scene = new Scene(rootPane, 430, 300);
		  stage.setTitle("访问数据库");
		  stage.setScene(scene);
		  stage.show();
	}
	public class ButtonHandler implements EventHandler<ActionEvent> {
		   @Override
		   public void handle(ActionEvent event) {
			   String sno = tf.getText();
			   var sql = "SELECT id,name,photo FROM students WHERE id=?";
			   try {
				   PreparedStatement pstmt = conn.prepareStatement(sql);
				   pstmt.setInt(1, Integer.parseInt(sno));
				   var rst = pstmt.executeQuery();
			 	   if (rst.next()) {
					   InputStream input = rst.getBinaryStream(3);
					   Image img = new Image(input);
					   ImageView iv = new ImageView(img);
					   photo.setText("");
					   photo.setGraphic(iv);
					   name.setText("姓名：" + rst.getString(2));
				   } else {
					   photo.setText("没有该学生！");
				   }
			   } catch (SQLException sqle) {
				   sqle.printStackTrace();
			   }
		  }
	  }
	  public static void main(String[] args) {
		   launch(args);
	  }
}

