package com.boda.xy;
import module javafx.controls;

public class ButtonDemo extends Application{
   @Override
   public void start(Stage stage){
	   
		var rootNode = new HBox();
		rootNode.setPadding(new Insets(10));
		rootNode.setSpacing(8);
	    var button1 = new Button("命令按钮");
	    var home = new Image(getClass().getResourceAsStream("/images/home.png"));
	    var button2 = new Button("返回首页", new ImageView(home));
	    var shadow = new DropShadow();
	    //当鼠标进入时产生阴影效果
	    button2.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
	      button2.setEffect(shadow);
	    });
	   //当鼠标离开时取消阴影效果
	    button2.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
	      button2.setEffect(null);
	    });
	     
	    var stop = new Image(getClass().getResourceAsStream("/images/stop.png"));
	    var left = new Image(getClass().getResourceAsStream("/images/left.png"));
	    var right = new Image(getClass().getResourceAsStream("/images/right.png"));
	    
	    var button3 = new Button();
	    var button4 = new Button();
	    var button5 = new Button();
	    button3.setGraphic(new ImageView(stop));
	    button4.setGraphic(new ImageView(left));
	    button5.setGraphic(new ImageView(right));
	    // 将按钮添加到根面板中
        rootNode.getChildren().addAll(button1,button2,button3);
        rootNode.getChildren().addAll(button4,button5);
	    var scene = new Scene(rootNode, 460, 100);		
		stage.setScene(scene);
		stage.setTitle("按钮示例");
		stage.show();
     
   }
   public static void main(String[]args){
	   launch(args);
   }
}

