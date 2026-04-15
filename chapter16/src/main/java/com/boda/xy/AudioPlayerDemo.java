package com.boda.xy;

//import java.io.File;
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaView;
//import javafx.stage.Stage;
import module javafx.media;
import module javafx.controls;

public class AudioPlayerDemo extends Application {
	@Override
    public void start(Stage myStage) {

         String path = "/media/china.mp3";
         Media media = new Media(getClass().getResource(path).toExternalForm());

	     MediaPlayer mediaPlayer = new MediaPlayer(media);
	     mediaPlayer.setAutoPlay(false);
	     MediaView mediaView = new MediaView(mediaPlayer);
	     mediaView.setOnError(e->System.out.println(e));
	     //创建水平控件框
	     HBox hbox = new HBox(10);
	     hbox.setPadding(new Insets(10,10,20,10));
	     hbox.setAlignment(Pos.CENTER);
	     Button play = new Button("播放"),
	    	 	   pause = new Button("暂停"), 
	    		   loop = new Button("循环"),
	    		   stop = new Button("停止");
	     hbox.getChildren().addAll(play,pause,loop,stop);
	     // 为按钮注册事件处理器
	     play.setOnAction(e->mediaPlayer.play());
	     pause.setOnAction(e->mediaPlayer.pause());
	     loop.setOnAction(
           e->{mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	                          mediaPlayer.play();
         });
	     stop.setOnAction(e->mediaPlayer.stop());
	     //创建根面板
	     BorderPane rootNode = new BorderPane();
	     rootNode.setCenter(mediaView);
	     rootNode.setBottom(hbox);
	     Scene scene = new Scene(rootNode, 250, 50);
	     myStage.setScene(scene);
	     myStage.setTitle("播放音频");
	     myStage.show();
     }

     public static void main(String[] args) {
        launch(args);
     }
}

