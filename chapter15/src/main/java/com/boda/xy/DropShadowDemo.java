package com.boda.xy;
import module javafx.controls;

public class DropShadowDemo extends Application {
	@Override
	  public void start(Stage stage) {
		DropShadow dropShadow = new DropShadow();
		dropShadow.setRadius(5.0);   
		dropShadow.setOffsetX(3.0);
		dropShadow.setOffsetY(3.0);
		dropShadow.setColor(Color.color(0.4, 0.5, 0.5));
		// 为文本设置阴影特效
		Text text = new Text(10,70,"JavaFX阴影效果");
		text.setCache(true);
		text.setFill(Color.web("0x3b596d"));
		text.setFont(Font.font(null, FontWeight.BOLD, 30));
		text.setEffect(dropShadow);
		
		// 为圆设置阴影特效
		DropShadow dropShadow2 = new DropShadow();
		dropShadow2.setOffsetX(6.0);
		dropShadow2.setOffsetY(4.0);
		Circle circle = new Circle(50.0,125.0,30.0,Color.STEELBLUE);
		circle.setCache(true);
		circle.setEffect(dropShadow2);


		Group rootNode = new Group();
		//rootNode.getChildren().addAll(text);
		rootNode.getChildren().addAll(text,circle);
		Scene scene = new Scene(rootNode,300,200);
		stage.setTitle("阴影特效");
		stage.setScene(scene);
		stage.show();                   // ��ʾ��̨����
    }
    public static void main(String[] args) {
         Application.launch(args);
    }
}

