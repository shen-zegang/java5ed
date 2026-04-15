package com.boda.xy;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimelineDemo2 extends Application{
   @Override
 public void start(Stage primaryStage) throws Exception {  
   	    BorderPane border=new BorderPane();    	     	      
   	    //创建矩形，起点在x=100,y=50的位置  
   	    
 	    final Rectangle rect=new Rectangle(50, 50, 100, 50);  
   	    rect.setFill(Color.RED);  
   	    border.getChildren().add(rect);  
   	    //创建时间轴  
   	    final Timeline timeline=new Timeline();  
   	    timeline.setCycleCount(Timeline.INDEFINITE);//设置周期运行循环往复  
   	    timeline.setAutoReverse(true);//设置动画的自动往返效果  
   	      
   	    //将x的位置在1000ms内移动到300处  
   	    final KeyValue kv=new KeyValue(rect.xProperty(), 300);  
   	    final KeyFrame kf=new KeyFrame(Duration.millis(1000), kv);  
   	    //将关键帧加到时间轴中  
   	    timeline.getKeyFrames().add(kf);  
   	    timeline.play(); //运行  
   	    
   	    Scene scene=new Scene(border, 500, 150);   
   	    primaryStage.setScene(scene); 
   	    primaryStage.setTitle("时间轴动画");   
   	    primaryStage.show();   
   	}  

   public static void main(String[]args){
	   Application.launch(args);
   }
   
}
