package com.boda.xy;
//import java.io.File;
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.Slider;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Region;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaView;
//import javafx.stage.Stage;
import javafx.util.Duration;

import module javafx.controls;
import module javafx.media;

public class VideoPlayerDemo extends Application {
	   @Override
	   public void start(Stage myStage) {
//		    File path = new File("media\\dance.mp4");
//		    String source = path.toURI().toString();
//		    Media media = new Media(source);
           String path = "/media/video.mp4";
           Media media = new Media(
                   getClass().getResource(path).toExternalForm());

           MediaPlayer mediaPlayer = new MediaPlayer(media);
		    MediaView mediaView = new MediaView(mediaPlayer);
		    //创建播放按钮
		    Button playButton = new Button(">");
		    playButton.setOnAction(e-> {
			   if (playButton.getText().equals(">")){
				   mediaPlayer.play();
				   playButton.setText("||");
			   }else{
				   mediaPlayer.pause();
				   playButton.setText(">");
			   }
		    });
		   Button rewindButton = new Button("<<");
		   rewindButton.setOnAction(e->mediaPlayer.seek(Duration.ZERO));
		   // 创建滑动条
		   Slider volume = new Slider();
		   volume.setPrefWidth(150);
		   volume.setMaxWidth(Region.USE_PREF_SIZE);
		   volume.minWidth(30);
		   volume.setValue(50);
		   mediaPlayer.volumeProperty().bind(
	            volume.valueProperty().divide(100));
		   // 创建水平控件框
		   HBox hbox = new HBox(10);
		   hbox.setAlignment(Pos.CENTER);
		   hbox.getChildren().addAll(playButton,rewindButton,
	             new Label("音量"),volume);
		   // 创建根面板
		   BorderPane rootNode = new BorderPane();
		   rootNode.setCenter(mediaView);
		   rootNode.setBottom(hbox);
		   Scene scene = new Scene(rootNode, 600,450);
		   myStage.setScene(scene);
	     myStage.setTitle("播放视频");
		   myStage.show();
		 }

     public static void main(String[] args) {
        launch(args);
     }
}
