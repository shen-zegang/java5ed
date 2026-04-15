package com.boda.xy;
import java.io.File;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
public class PathTransitionDemo extends Application{
@Override
   public void start(Stage stage){	  
	 var rootNode = new Pane();
     var image = new Image("images/china.gif");
     var imageView = new ImageView(image);
     var image2 = new Image("images/xuhaifeng.jpg");
     var imageView2 = new ImageView(image2);
     rootNode.getChildren().addAll(imageView2,imageView);
     
     // 创建移动路径
	 var pt = new PathTransition(Duration.millis(45000),
			   new Line(100,150,100,50),imageView); 
     pt.play();
     // 创建音频并自动播放
	 var path = new File("src\\images\\china.mp3");
	 String source = path.toURI().toString();
	 var media = new Media(source);
     var mediaPlayer = new MediaPlayer(media);
     mediaPlayer.setAutoPlay(true);
     MediaView mediaView = new MediaView(mediaPlayer);
     rootNode.getChildren().add(mediaView);
     
     var scene = new Scene(rootNode,450,250);
     stage.setTitle("升国旗奏国歌");
     stage.setScene(scene); 
     stage.show();    
   }
   public static void main(String[]args){
	     Application.launch(args);
   } 
}
