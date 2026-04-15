package com.boda.xy;
import module javafx.controls;

public class CircleDemo extends Application {
   @Override
   public void start(Stage myStage) {

      Group rootNode = new Group();  
      Scene scene = new Scene(rootNode, 300, 130, Color.WHITE);
       // 创建圆形
      Circle circle = new Circle();
      circle.setCenterX(100.0f);  // 设置圆的中心点坐标
      circle.setCenterY(70.0f);
      circle.setRadius(50.0f);      // 设置圆的半径
      circle.setFill(Color.BLUE);

      myStage.setTitle("矩形圆形");
      rootNode.getChildren().add(circle);
      myStage.setScene(scene);
      myStage.show();
    }
   public static void main(String[] args) {
       launch(args);
   }
}

