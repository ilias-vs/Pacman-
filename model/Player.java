package model;

public class Player {
    public int rows;
    public int cols;
    public int key;
    public int points;

    public Player(int rows, int cols, int key,int points) {
        this.rows = rows;
        this.cols = cols;
        this.key = key;
        this.points=points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
