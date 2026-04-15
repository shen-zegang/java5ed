package com.boda.example;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EightQueen extends Application {
	//Image queen = new Image("images\\queen.jpg");
	Image queen = new Image(getClass().getResource("/images/queen.jpg").toExternalForm());
	Button[][] r = new Button[8][8];
	boolean[][] ok = new boolean[8][8];
	@Override
	public void start(Stage stage) {
		GridPane rootNode = new GridPane();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				ok[i][j] = true;
			}
		}

		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 7; j++) {
				r[i][j] = new Button();
				r[i][j].setPrefHeight(52);
				r[i][j].setPrefWidth(52);
				r[i][j].setPadding(new Insets(0, 0, 0, 0));
				if ((i + j) % 2 == 0) {
					r[i][j].setStyle("-fx-background-color:#ffffff");
				} else {
					r[i][j].setStyle("-fx-background-color:#000000");
				}
				rootNode.add(r[i][j], i, j);
				ButtonHandler handler = new ButtonHandler();
				r[i][j].setOnMouseClicked(handler);
			}
		}
		Scene scene = new Scene(rootNode, 416, 416);
		stage.setTitle("显示象棋盘");
		stage.setScene(scene);
		stage.show();
	}

	public class ButtonHandler implements EventHandler<MouseEvent> {
		@Override
		public void handle(MouseEvent event) {
			ImageView iv = new ImageView(queen);
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if ((Button) event.getSource() == r[i][j]) {
						if (ok[i][j]) {
							r[i][j].setGraphic(iv);
							ok[i][j] = false;
							for (int r = 0; r < 8; r++) {
								ok[r][j] = false;
							}//
							for (int c = 0; c < 8; c++) {
								ok[i][c] = false;
							}

							for (int r = i, c = j; r >= 0 && c >= 0; r--, c--) {
								ok[r][c] = false;
							}// 左上

							for (int r = i, c = j; r < 8 && c < 8; r++, c++) {
								ok[r][c] = false;
							}// 右下

							for (int r = i, c = j; r >= 0 && c < 8; r--, c++) {
								ok[r][c] = false;
							}//右上
							for (int r = i, c = j; r < 8 && c >= 0; r++, c--) {
								ok[r][c] = false;
							}//左下
						} else {
							// System.out.println("这里不能放皇后！");
							Alert alert = new Alert(Alert.AlertType.INFORMATION); // 创建一个消息对话框
							alert.setHeaderText("这里不能放皇后！"); // 设置对话框的头部文本
							// 设置对话框的内容文本
							//alert.setContentText("这里不能放置王后！");
							alert.show(); // 显示对话框
						}
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
