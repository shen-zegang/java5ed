package com.boda.xy;

//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Line;
//import javafx.scene.shape.StrokeLineCap;
//import javafx.stage.Stage;

import module javafx.controls;
public class LineDemo extends Application {
   @Override
   public void start(Stage myStage) {
	   var rootNode = new Group();
       Line myLine = new Line(10, 50, 200, 50);

       myLine.setStroke(Color.RED);
       myLine.setStrokeWidth(10);
       //myLine.setStrokeLineCap(StrokeLineCap.ROUND);
       myLine.getStrokeDashArray().addAll(5d,15d);
       myLine.setStrokeDashOffset(0);

	   rootNode.getChildren().add(myLine);
       myStage.setTitle("绘制直线");
       var scene = new Scene(rootNode, 300, 130, Color.WHITE);
       myStage.setScene(scene);
	   myStage.show();

    }
      public static void main(String[] args) {
        launch(args);
     }
}











////蓝线
//Line blueLine = new Line(10, 50, 200, 50);
//blueLine.setStroke(Color.BLUE);
//blueLine.setStrokeWidth(10);
//blueLine.setStrokeLineCap(StrokeLineCap.ROUND);
//rootNode.getChildren().add(blueLine);
//// 红线
//Line redLine = new Line(10, 90, 200, 90);
//redLine.setStroke(Color.RED);
//redLine.setStrokeWidth(10);
//redLine.setStrokeLineCap(StrokeLineCap.BUTT);
//// 创建虚线模式
//redLine.getStrokeDashArray().addAll(10d, 5d, 15d, 5d, 20d);
//redLine.setStrokeDashOffset(0);

//rootNode.getChildren().add(redLine);