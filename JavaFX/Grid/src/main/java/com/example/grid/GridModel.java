package com.example.grid;

public class GridModel {
    private int rows;//attribute that stores the number of rows
    private int columns;//attribute that stores the number of columns

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
