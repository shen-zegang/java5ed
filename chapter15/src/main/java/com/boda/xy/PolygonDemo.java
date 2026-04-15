package com.boda.xy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class PolygonDemo extends Application {
   public static void main(String[] args) {
	  launch(args);
   }
   @Override
   public void start(Stage stage) {
      stage.setTitle("多边形示例");
      Polygon polygon1 = new Polygon(new double[]{
              45 , 10 ,
              10 , 80 ,
              80 , 80 ,
          });
      Polygon polygon2 = new Polygon(new double[]{
              135, 15,
              160, 30,
              160, 60,
              135, 75,
              110, 60,
              110, 30
          });

      Pane root = new Pane();
      root.setPrefSize(230, 100);
      polygon1.setFill(Color.RED);

      polygon2.setStroke(Color.DODGERBLUE);
      polygon2.setStrokeWidth(2);
      polygon2.setFill(null);
      root.getChildren().addAll(polygon1, polygon2);
     
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
   }
}