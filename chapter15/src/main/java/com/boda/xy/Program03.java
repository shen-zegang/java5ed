package com.boda.xy;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Program03 extends Application {
    @Override
    public void start(Stage stage) {
    	Text text = new Text(130,89,"数据库");
    	Ellipse ellipse = new Ellipse(150,50,80,20);
    	ellipse.setFill(Color.WHITE);
    	ellipse.setStroke(Color.BLACK);  	
    	Arc  arc = new Arc(150,100,80,20,0,-180);
    	arc.setType(ArcType.OPEN);
    	arc.setFill(Color.WHITE);
    	arc.setStroke(Color.BLACK);
    	Line line1 = new Line(70,50,70,100);
    	Line line2 = new Line(230,50,230,100);   	
    	Group rootNode = new Group();
    	rootNode.getChildren().addAll(ellipse,arc,text,line1,line2);  	
    	Scene scene = new Scene(rootNode, 300, 160);
        stage.setTitle("绘制圆柱示例");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
       launch(args);
    }	
}