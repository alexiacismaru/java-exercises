package com.example.grid2;

public class GridModel {
    private int rows;//new int attribute
    private int columns;//new int attribute

    public GridModel(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }//constructor

    public int getRows() {
        return rows;
    }//getter

    public int getColumns() {
        return columns;
    }//getter

    public void setRows(int rows) {
        this.rows = rows;
    }//setter

    public void setColumns(int columns) {
        this.columns = columns;
    }//setter
}
