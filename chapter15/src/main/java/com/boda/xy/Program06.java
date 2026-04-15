package com.boda.xy;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
public class Program06 extends Application {
   @Override
   public void start(Stage myStage) {
      myStage.setTitle("绘制五角星");
      Group rootNode = new Group();  
      Scene scene = new Scene(rootNode, 300, 150, Color.WHITE);
      // 根据10个顶点坐标创建多边形
      Polygon polygon = new Polygon(new double[]{
              100, 30,
              88.774,65.549,
              52.447, 65.549,
              81.836, 85.902,
              70.611, 120.451,
              100.00, 99.099,
              129.390, 120.451,
              118.164, 85.902,
              147.553, 65.549,
              111.226, 65.549
          });
       polygon.setStroke(Color.BLUE);
       polygon.setFill(Color.RED);
       // 绘制五角星的外接圆
       Circle circle = new Circle(100,80,50);
       circle.setStroke(Color.DODGERBLUE);
       circle.setStrokeWidth(1);
       circle.setFill(null);      // 取消圆的填充颜色
       rootNode.getChildren().addAll(polygon,circle);
       myStage.setScene(scene);
       myStage.show();
      }
     public static void main(String[] args) {
        launch(args);
     }
}

