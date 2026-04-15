package com.boda.example;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class FiveChessDemo extends Application {
	public static Stage PRIMARY_STAGE;
	
	private Scene createScene() {
		HBox hbox = new HBox();	
		ChessPane chesspane = new ChessPane(PRIMARY_STAGE);
		var rootPane = new BorderPane();
		rootPane.setPadding(new Insets(20));
		hbox.setAlignment(Pos.CENTER);
		hbox.setPadding(new Insets(20));
		hbox.setSpacing(20);

		var startButton = new Button("重新开始");
		var exitButton = new Button("退出");
		var backButton = new Button("悔棋");

		startButton.setOnAction(event -> {
			restartGame();
			//chesspane.restartGame(PRIMARY_STAGE);
		});
		exitButton.setOnAction(event ->Platform.exit());
		backButton.setOnAction(event -> chesspane.goback(PRIMARY_STAGE));

		hbox.getChildren().addAll(backButton, startButton, exitButton);
		rootPane.setCenter(chesspane);
		rootPane.setBottom(hbox);
		var scene = new Scene(rootPane, 490, 550);
		return scene;
	}
	
	@Override
	public void start(Stage stage) {
		PRIMARY_STAGE = stage;
		var scene = createScene(); 			
		stage.setTitle("简单五子棋游戏");
		stage.setScene(scene);
		stage.show();
	}

	public void restartGame() {	
		Scene scene = createScene();
		PRIMARY_STAGE.setScene(scene);
		PRIMARY_STAGE.show();	
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}