package com.boda.example;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GobangGame extends Application {

    private static final int BOARD_SIZE = 15; // 棋盘大小 15x15
    private int[][] board = new int[BOARD_SIZE][BOARD_SIZE]; // 0：空格，1：黑棋，2：白棋
    private int currentPlayer = 1; // 当前玩家，1 为黑棋，2 为白棋

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        // 创建棋盘
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                Rectangle cell = new Rectangle(40, 40); // 每个格子的大小为 40x40
                cell.setFill(Color.BEIGE);
                cell.setStroke(Color.BLACK);
                // 将当前的格子点击事件传递到事件处理器中
                cell.setOnMouseClicked(new CellClickHandler(i, j, grid));
                grid.add(cell, j, i);
            }
        }

        // 设置网格的背景
        Scene scene = new Scene(grid, 650, 650);
        primaryStage.setTitle("五子棋游戏");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 点击格子时的事件处理器
    private class CellClickHandler implements EventHandler<javafx.scene.input.MouseEvent> {
        private int row;
        private int col;
        private GridPane grid;

        public CellClickHandler(int row, int col, GridPane grid) {
            this.row = row;
            this.col = col;
            this.grid = grid;
        }

        @Override
        public void handle(javafx.scene.input.MouseEvent event) {
            if (board[row][col] != 0) {
                return; // 如果该位置已被占用，返回
            }

            // 根据当前玩家的棋子（1 为黑棋，2 为白棋）设置格子的状态
            board[row][col] = currentPlayer;

            // 在格子中绘制棋子
            Circle piece = new Circle(15);
            piece.setCenterX(20);
            piece.setCenterY(20);
            if (currentPlayer == 1) {
                piece.setFill(Color.BLACK); // 黑棋
            } else {
                piece.setFill(Color.WHITE); // 白棋
            }

            // 获取点击的格子
            Rectangle cell = (Rectangle) grid.getChildren().get(row * BOARD_SIZE + col);
            cell.setFill(Color.LIGHTGRAY); // 修改格子颜色

            grid.add(piece, col, row); // 在点击位置添加棋子

            // 检查是否获胜
            if (checkWin(row, col)) {
                showWinAlert();
            } else {
                // 切换玩家
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }
    }

    // 判断是否获胜
    private boolean checkWin(int row, int col) {
        int player = board[row][col];

        // 纵向、横向、斜向判断
        return checkDirection(row, col, 1, 0, player) || // 横向
                checkDirection(row, col, 0, 1, player) || // 纵向
                checkDirection(row, col, 1, 1, player) || // 斜向（从左上到右下）
                checkDirection(row, col, 1, -1, player);   // 斜向（从右上到左下）
    }

    // 判断某个方向是否连成五子
    private boolean checkDirection(int row, int col, int dRow, int dCol, int player) {
        int count = 1; // 当前棋子计算为1
        int r = row, c = col;

        // 向一个方向延伸
        for (int i = 1; i < 5; i++) {
            r += dRow;
            c += dCol;
            if (r >= 0 && r < BOARD_SIZE && c >= 0 && c < BOARD_SIZE && board[r][c] == player) {
                count++;
            } else {
                break;
            }
        }

        // 向反方向延伸
        r = row;
        c = col;
        for (int i = 1; i < 5; i++) {
            r -= dRow;
            c -= dCol;
            if (r >= 0 && r < BOARD_SIZE && c >= 0 && c < BOARD_SIZE && board[r][c] == player) {
                count++;
            } else {
                break;
            }
        }

        return count >= 5; // 如果连成5子，返回 true
    }

    // 游戏胜利提示
    private void showWinAlert() {
        String winner = (currentPlayer == 1) ? "黑棋" : "白棋";
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("游戏结束");
        alert.setHeaderText(winner + " 获胜！");
        alert.setContentText(winner + " 连成五子，恭喜！");
        alert.showAndWait();

        // 游戏结束后，重置棋盘
        resetGame();
    }

    // 重置游戏
    private void resetGame() {
        board = new int[BOARD_SIZE][BOARD_SIZE];
        currentPlayer = 1;
        start(new Stage()); // 重启游戏
    }
}
