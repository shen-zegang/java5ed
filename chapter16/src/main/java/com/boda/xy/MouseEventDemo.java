package com.boda.xy;
import module javafx.controls;

public class MouseEventDemo extends Application {
	@Override
    public void start(Stage stage) {
	     final var label = new Label();
	     final var circle = new Circle(140,50,40, Color.RED); 
	     var pane = new Pane();   // 创建面板对象并将圆添加到它上面
	     pane.getChildren().addAll(circle);      
         var root = new BorderPane();
         root.setCenter(pane);
         root.setBottom(label);
        // 为圆对象设置鼠标事件处理器
        circle.setOnMouseEntered(e-> label.setText("鼠标进入圆"));
        circle.setOnMouseExited(e-> label.setText("鼠标离开圆"));
        circle.setOnMousePressed(e-> label.setText("鼠标被按下"));
   	    circle.setOnMouseDragged(e-> {
   		     circle.setCenterX(e.getX());
    	     circle.setCenterY(e.getY());}
        );
       var scene = new Scene(root, 280, 120);
       stage.setTitle("MouseEvent事件处理");
       stage.setScene(scene);
       stage.show();

   }
   public static void main(String[] args) {
	      launch(args);
   }
}
