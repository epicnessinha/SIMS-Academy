package org.academiadecodigo.bootcamp;

public class Position {

    private int row;
    private int col;

    public Position(int row, int col){
        this.row = row;
        this.col = col;

    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int rowToY(int row) {
        return PADDING + cellSize * row;
    }

    public int columnToX(int column) {
        return PADDING + cellSize * column;
    }
}

