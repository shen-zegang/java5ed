package com.boda.example;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Tile {
    private final String name;
    private int row, col;
    private final int height, width;
    private final Pane view;
    private final Board board;

    private double dragOffsetX, dragOffsetY; // 鼠标拖动偏移量

    public Tile(String name, int row, int col, int height, int width, int tileSize, Board board) {
        this.name = name;
        this.row = row;
        this.col = col;
        this.height = height;
        this.width = width;
        this.board = board;

        Rectangle rectangle = new Rectangle(tileSize * width, tileSize * height);
        rectangle.setFill(Color.LIGHTBLUE);
        rectangle.setStroke(Color.BLACK);

        Text text = new Text(name);
        text.setX(tileSize * width / 2.0 - text.getLayoutBounds().getWidth() / 2);
        text.setY(tileSize * height / 2.0 + text.getLayoutBounds().getHeight() / 4);

        view = new Pane();
        view.getChildren().addAll(rectangle, text);

        // 初始化位置
        view.setLayoutX(tileSize * col);
        view.setLayoutY(tileSize * row);

        // 添加鼠标拖动事件
        addMouseListeners(tileSize);
    }

    public Pane getView() {
        return view;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    private void addMouseListeners(int tileSize) {
        // 记录鼠标按下时的位置
        view.setOnMousePressed(event -> {
            dragOffsetX = event.getSceneX() - view.getLayoutX();
            dragOffsetY = event.getSceneY() - view.getLayoutY();
        });

        // 拖动时实时更新位置
        view.setOnMouseDragged(event -> {
            view.setLayoutX(event.getSceneX() - dragOffsetX);
            view.setLayoutY(event.getSceneY() - dragOffsetY);
        });

        // 鼠标释放时处理逻辑
        view.setOnMouseReleased(event -> {
            int newCol = (int) Math.round(view.getLayoutX() / tileSize);
            int newRow = (int) Math.round(view.getLayoutY() / tileSize);

            // 尝试移动到新位置
            if (board.tryMoveTile(this, newRow, newCol)) {
                view.setLayoutX(newCol * tileSize);
                view.setLayoutY(newRow * tileSize);
            } else {
                // 还原到原位置
                view.setLayoutX(col * tileSize);
                view.setLayoutY(row * tileSize);
            }
        });
    }
}

