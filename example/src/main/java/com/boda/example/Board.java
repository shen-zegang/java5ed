package com.boda.example;

import javafx.scene.layout.Pane;

public class Board {
    private final Pane pane;
    private final Tile[][] board;
    private final int rows, cols, tileSize;

    public Board(int rows, int cols, int tileSize) {
        this.rows = rows;
        this.cols = cols;
        this.tileSize = tileSize;

        this.pane = new Pane();
        this.board = new Tile[rows][cols];

        initializeBoard();
    }

    public Pane getPane() {
        return pane;
    }

    private void initializeBoard() {
        // 添加各个方块 (可以调整初始布局)
        addTile("曹操", 0, 1, 2, 2);
        addTile("关羽", 2, 1, 1, 2);
        addTile("张飞", 0, 0, 2, 1);
        addTile("赵云", 0, 3, 2, 1);

        addTile("马超", 2, 0, 2, 1);
        addTile("黄忠", 2, 3, 2, 1);
        addTile("兵", 4, 0, 1, 1);
        addTile("兵", 4, 3, 1, 1);
        addTile("兵", 3, 1, 1, 1);
        addTile("兵", 3, 2, 1, 1);
    }

    private void addTile(String name, int row, int col, int height, int width) {
        Tile tile = new Tile(name, row, col, height, width, tileSize, this);
        pane.getChildren().add(tile.getView());
        placeTile(tile, row, col);
    }

    private void placeTile(Tile tile, int row, int col) {
        for (int r = row; r < row + tile.getHeight(); r++) {
            for (int c = col; c < col + tile.getWidth(); c++) {
                board[r][c] = tile;
            }
        }
    }

    public boolean tryMoveTile(Tile tile, int newRow, int newCol) {
        if (canMoveTile(tile, newRow, newCol)) {
            clearTile(tile);
            tile.setPosition(newRow, newCol);
            placeTile(tile, newRow, newCol);
            return true;
        }
        return false;
    }

    private boolean canMoveTile(Tile tile, int newRow, int newCol) {
        for (int r = newRow; r < newRow + tile.getHeight(); r++) {
            for (int c = newCol; c < newCol + tile.getWidth(); c++) {
                if (r < 0 || r >= rows || c < 0 || c >= cols || (board[r][c] != null && board[r][c] != tile)) {
                    return false;
                }
            }
        }
        return true;
    }

    private void clearTile(Tile tile) {
        for (int r = tile.getRow(); r < tile.getRow() + tile.getHeight(); r++) {
            for (int c = tile.getCol(); c < tile.getCol() + tile.getWidth(); c++) {
                board[r][c] = null;
            }
        }
    }
}
