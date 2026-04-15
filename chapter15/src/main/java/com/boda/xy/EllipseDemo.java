package com.boda.xy;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
public class EllipseDemo extends Application {
   @Override
   public void start(Stage myStage) {
       // 创建椭圆
      Ellipse ellipse = new Ellipse( 110,80, 80, 40); 
      ellipse.setStrokeWidth(3);
      ellipse.setStroke(Color.BLUE);
      ellipse.setFill(Color.WHITE);

      Group rootNode = new Group();
      Scene scene = new Scene(rootNode, 300, 130, Color.WHITE);
      rootNode.getChildren().add(ellipse);

      myStage.setTitle("矩形圆形");
      myStage.setScene(scene);
      myStage.show();
    }
   public static void main(String[] args) {
       launch(args);
   }
}

