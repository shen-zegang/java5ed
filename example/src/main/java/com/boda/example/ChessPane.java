package com.boda.example;

import java.util.Optional;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChessPane extends Pane {
	public static final int MARGIN = 24;      // 边距
	public static final int GRID_SPAN = 30;       //格子跨度
	public static final int ROWS = 14;
	public static final int COLS = 14;
	Stone[] chessList = new Stone[(ROWS + 1) * (COLS + 1)];
	Circle[] cell = new Circle[(ROWS + 1) * (COLS + 1)];
	boolean isBlack = true;
	boolean gameOver = false;
	int chessCount;
	int xIndex, yIndex;
	Color colortemp;
	//Image image = new Image("images/board.jpg");
	Image image = new Image(getClass().getResource("/images/board.jpg").toExternalForm());

	ImageView imageView = new ImageView(image);
	Stage stage;
	
	public ChessPane(Stage stage) {	
		this.stage = stage;
		getChildren().addAll(imageView);
		var handler = new MouseHandler();
		imageView.setOnMouseClicked(handler);
		setPadding(new Insets(10));
	}

	public void goback(Stage stage) {
		if (chessCount == 0)
			return;
		//chessList[chessCount - 1] = null;		
		getChildren().remove(cell[chessCount]);		
		chessCount--;
		if (chessCount > 0) {
			xIndex = chessList[chessCount - 1].getX();
			yIndex = chessList[chessCount - 1].getY();
		}
		isBlack = !isBlack;
		stage.show();
	}

	public class MouseHandler implements EventHandler<MouseEvent> {
		@Override
		public void handle(MouseEvent event) {
			if (gameOver) return;
			var colorName = isBlack ? "黑棋" : "白棋";
            // 根据鼠标点击位置，得到落子位置
			xIndex = ((int) (event.getX()) - MARGIN + GRID_SPAN / 2) / GRID_SPAN;
			yIndex = ((int) (event.getY()) - MARGIN + GRID_SPAN / 2) / GRID_SPAN;

//			System.out.println(xIndex);
//			System.out.println(yIndex);
//			System.out.println(event.getX());
//			System.out.println(event.getY());

			if (xIndex < 0 || xIndex > ROWS || yIndex < 0 || yIndex > COLS)
				return;
//			if (findChess(xIndex, yIndex))
//				return;
			var ch = new Stone(xIndex, yIndex, isBlack ? Color.BLACK : Color.WHITE);
			chessList[chessCount] = ch;
			
	        int xPos=chessList[chessCount].getX()*GRID_SPAN+MARGIN-8;  
	        int yPos=chessList[chessCount].getY()*GRID_SPAN+MARGIN-8;  
	        chessCount++;
	        cell[chessCount] = new Circle(xPos, yPos, 12, ch.getColor());
			getChildren().add(cell[chessCount]);

			if (isWin()) {
				String msg = String.format("恭喜，%s赢了！", colorName);
				Alert alert = new Alert(Alert.AlertType.CONFIRMATION); // 创建一个确认对话框
				alert.setHeaderText(msg); // 设置对话框的头部文本
				alert.setContentText("还要继续比赛吗？");// 设置对话框的内容文本
				Optional<ButtonType> buttonType = alert.showAndWait();// 显示对话框，并等待按钮返回
				if (buttonType.get().getButtonData().equals(ButtonBar.ButtonData.OK_DONE)) { // 单击了确定按钮OK_DONE
					getChildren().removeAll(cell);
					stage.show();
                } else { // 单击了取消按钮CANCEL_CLOSE
                    Platform.exit();
                }      
				gameOver = true;
			}
			isBlack = !isBlack;
		}

//		private boolean findChess(int x, int y) {
//			for (var c : chessList) {
//				if (c != null && c.getX() == x && c.getY() == y)
//					return true;
//			}
//			return false;
//		}

		private boolean isWin() {
			int continueCount = 1;
			for (int x = xIndex - 1; x >= 0; x--) {
				var c = isBlack ? Color.BLACK : Color.WHITE;
				if (getChess(x, yIndex, c) != null) {
					continueCount++;
				} else
					break;
			}
			for (int x = xIndex + 1; x <= COLS; x++) {
				var c = isBlack ? Color.BLACK : Color.WHITE;
				if (getChess(x, yIndex, c) != null) {
					continueCount++;
				} else
					break;
			}
			if (continueCount >= 5) {
				return true;
			} else
				continueCount = 1;
			for (int y = yIndex - 1; y >= 0; y--) {
				var c = isBlack ? Color.BLACK : Color.WHITE;
				if (getChess(xIndex, y, c) != null) {
					continueCount++;
				} else
					break;
			}
			for (int y = yIndex + 1; y <= ROWS; y++) {
				var c = isBlack ? Color.BLACK : Color.WHITE;
				if (getChess(xIndex, y, c) != null)
					continueCount++;
				else
					break;
			}
			if (continueCount >= 5)
				return true;
			else
				continueCount = 1;
			for (int x = xIndex + 1, y = yIndex - 1; y >= 0 && x <= COLS; x++, y--) {
				var c = isBlack ? Color.BLACK : Color.WHITE;
				if (getChess(x, y, c) != null) {
					continueCount++;
				} else
					break;
			}
			for (int x = xIndex - 1, y = yIndex + 1; x >= 0 && y <= ROWS; x--, y++) {
				var c = isBlack ? Color.BLACK : Color.WHITE;
				if (getChess(x, y, c) != null) {
					continueCount++;
				} else
					break;
			}
			if (continueCount >= 5)
				return true;
			else
				continueCount = 1;
			for (int x = xIndex - 1, y = yIndex - 1; x >= 0 && y >= 0; x--, y--) {
				var c = isBlack ? Color.BLACK : Color.WHITE;
				if (getChess(x, y, c) != null)
					continueCount++;
				else
					break;
			}
			for (int x = xIndex + 1, y = yIndex + 1; x <= COLS && y <= ROWS; x++, y++) {
				var c = isBlack ? Color.BLACK : Color.WHITE;
				if (getChess(x, y, c) != null)
					continueCount++;
				else
					break;
			}
			if (continueCount >= 5)
				return true;
			else
				continueCount = 1;

			return false;
		}

		private Stone getChess(int xIndex, int yIndex, Color color) {
			for (var p : chessList) {
				if (p != null && p.getX() == xIndex && p.getY() == yIndex && p.getColor() == color)
					return p;
			}
			return null;
		}
	}
}
