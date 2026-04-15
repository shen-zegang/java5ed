package com.boda.xy;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
public class TextDemo extends Application {
  @Override
  public void start(Stage myStage) {
	  String family = "Verdana";
	  double size = 30;
      Text text1 = new Text("Hello ");
	  text1.setFont(Font.font(family, size));
	  text1.setFill(Color.RED);
	  
	  Text text2 = new Text("Bold");
	  text2.setFill(Color.ORANGE);
	  text2.setFont(Font.font(family, FontWeight.BOLD, size));
	  
	  Text text3 = new Text(" World");
	  text3.setFill(Color.GREEN);
	  text3.setFont(Font.font(family, FontPosture.ITALIC, size));
      text3.setRotate(90);      // 节点按顺时针方向旋转90度
      // 创建TextFlow对象并添加三个文本对象
      TextFlow textFlow = new TextFlow();
	  textFlow.setLayoutX(40);
	  textFlow.setLayoutY(40);	
      textFlow.getChildren().addAll(text1, text2, text3);
      Group group = new Group(textFlow);
	  Scene scene = new Scene(group, 330, 120, Color.WHITE);
	  myStage.setTitle("Hello Rich Text");
	  myStage.setScene(scene);
	  myStage.show();

	  }

	  
	   public static void main(String[] args) {
	       launch(args);
	   }

}
