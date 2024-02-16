package com.example.grid;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;

public class GridView extends BorderPane {
    private Canvas canvas;//new Canvas attribute

    public GridView() {
        this.initialiseNodes();
        this.layoutNodes();
    }//constructor

    private void initialiseNodes() {
        this.canvas = new Canvas(640.0, 400.0);
    }//initialise the Canvas to 640x400px

    private void layoutNodes() {
        this.setCenter(this.canvas);
    }//set the Canvas in the center of the window

    void drawGrid(int rows, int columns) {
        final GraphicsContext gc = this.canvas.getGraphicsContext2D();//draw the lines

        final double totalWidth = this.canvas.getWidth();//get the width from the Canvas
        final double totalHeight = this.canvas.getHeight();//get the height from the Canvas
        final double rowHeight = totalHeight / rows;//rows are equal width
        final double columnWidth = totalWidth / columns;//columns are equal height

        for (int r = 1; r < rows; r++) {
            gc.strokeLine(0.0, rowHeight * r, totalWidth, rowHeight * r);
        }//number of rows

        for (int c = 1; c < columns; c++) {
            gc.strokeLine(columnWidth * c, 0.0, columnWidth * c, totalHeight);
        }//number of columns
    }
}

