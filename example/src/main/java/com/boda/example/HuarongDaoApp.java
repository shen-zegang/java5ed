package com.boda.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HuarongDaoApp extends Application {
    private static final int TILE_SIZE = 100;
    private static final int ROWS = 5;
    private static final int COLS = 4;

    @Override
    public void start(Stage primaryStage) {
        Board board = new Board(ROWS, COLS, TILE_SIZE);

        Pane root = board.getPane();
        Scene scene = new Scene(root, COLS * TILE_SIZE, ROWS * TILE_SIZE);

        primaryStage.setTitle("华容道");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
