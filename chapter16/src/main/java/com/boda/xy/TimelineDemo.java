package com.boda.xy;
//import javafx.animation.Animation;
//import javafx.animation.KeyFrame;
//import javafx.animation.Timeline;
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//import javafx.util.Duration;
import module javafx.controls;
public class TimelineDemo extends Application{
   int i = 1;
   @Override
   public void start(Stage stage){
	     Pane rootNode = new Pane();
	     // 创建第1个图像并添加到根面板中
	     //Image image = new Image("images/T"+i+".gif");
         Image image = new Image(getClass().getResourceAsStream("/images/T1.gif"));
         ImageView imageView = new ImageView(image);
	     rootNode.getChildren().add(imageView);
	     // 创建事件处理器对象
	     EventHandler<ActionEvent> eventHandler = e->{
             Image img = new Image(getClass().getResourceAsStream("/images/T" + i + ".gif"));
		     //Image img = new Image("images/T"+i+".gif");
		     imageView.setImage(img);    //显示当前图像文件
		     i = i % 17 +1;                // 当i的值超过17，i从1开始
	     };
	     // 创建动画对象
	    KeyFrame keyFrame = new KeyFrame(Duration.millis(400), eventHandler);
Timeline animation = new Timeline(keyFrame);
	    animation.setCycleCount(Timeline.INDEFINITE);
	    animation.play();           // 启动动画
	    // 单击鼠标可以暂停和继续执行动画
	    imageView.setOnMouseClicked(e->{
		   if(animation.getStatus()==Animation.Status.PAUSED){
			   animation.play();
		   }else{
			   animation.pause();
		 }
	    });  
	    Scene scene = new Scene(rootNode,200,120);
	    stage.setTitle("动画演示");
      stage.setScene(scene); 
      stage.show(); 
   }
   public static void main(String[]args){
	   Application.launch(args);
   } 
}
