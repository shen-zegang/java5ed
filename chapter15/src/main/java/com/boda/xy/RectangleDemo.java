package com.boda.xy;

import module javafx.controls;
public class RectangleDemo extends Application {
   @Override
   public void start(Stage myStage) {

       // 创建矩形
      Rectangle rec1 = new Rectangle(5, 5, 150, 70);
      rec1.setFill(Color.RED);
      rec1.setStroke(Color.BLUE);
      rec1.setStrokeWidth(3);

      myStage.setTitle("矩形示例");
      Group rootNode = new Group();
      Scene scene = new Scene(rootNode, 300, 130, Color.WHITE);
      rootNode.getChildren().add(rec1);

      myStage.setScene(scene);
      myStage.show();
    }
   public static void main(String[] args) {
       launch(args);
   }
}

