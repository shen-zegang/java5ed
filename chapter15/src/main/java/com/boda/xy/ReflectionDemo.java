package com.boda.xy;
import module javafx.controls;

public class ReflectionDemo extends Application {
	@Override
	  public void start(Stage stage) {
		Reflection reflection = new Reflection();
		reflection.setFraction(1.0);
		// 为文本设置倒影特效
		Text text = new Text(10.0,50.0,"文本倒影效果");
		text.setCache(true);
		text.setFill(Color.web("0x3b596d"));
		text.setFont(Font.font(null, FontWeight.BOLD, 30));
		text.setEffect(reflection);
	  
		  Group rootNode = new Group();
		  rootNode.getChildren().addAll(text);
		  Scene scene = new Scene(rootNode,300,200);
		  stage.setTitle("Effect");
		  stage.setScene(scene);
		  stage.show();                   // ��ʾ��̨����
    }
    public static void main(String[] args) {
        // ����JavaFXӦ�ó���
         Application.launch(args);
    }
}

