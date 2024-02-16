package com.example.grid2;

import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class GridView extends BorderPane {
    private Canvas canvas;//new Canvas attribute
    private Label rowsLabel;//label for the rows
    private Slider rowsSlider;//slider for the rows
    private Label columnsLabel;//label for the columns
    private Slider columnsSlider;//slider for the columns

    public GridView() {
        this.initialiseNodes();
        this.layoutNodes();
    }//constructor

    private void initialiseNodes() {
        this.canvas = new Canvas(640.0, 400.0);//initialise the Canvas to 640x400px
        this.rowsLabel = new Label("Rows");//label the slider
        this.rowsSlider = new Slider(2.0, 20.0, 10.0);//the slider has a range from 2 -> 20
        this.rowsSlider.setShowTickMarks(true);//aspect of the slider
        this.rowsSlider.setShowTickLabels(true);//aspect of the slider
        this.columnsLabel = new Label("Columns");//label the slider
        this.columnsSlider = new Slider(2.0, 20.0, 10.0);//the slider has a range from 2 -> 20
        this.columnsSlider.setShowTickMarks(true);//aspect of the slider
        this.columnsSlider.setShowTickLabels(true);//aspect of the slider
    }

    private void layoutNodes() {
        final VBox controls = new VBox();//layout component which positions all its components in a vertical column, on top of each other
        controls.setAlignment(Pos.CENTER_LEFT);//set the VBox in the center left of the window
        controls.getChildren().add(this.rowsLabel);//list the current component in VBox
        controls.getChildren().add(this.rowsSlider);//list the current component in VBox
        controls.getChildren().add(this.columnsLabel);//list the current component in VBox
        controls.getChildren().add(this.columnsSlider);//list the current component in VBox

        this.setCenter(this.canvas);//set the Canvas in the center of the window
        this.setBottom(controls);//set the controls to the bottom odf the window
    }

    Slider getRowsSlider() {
        return rowsSlider;
    }//private package getter

    Slider getColumnsSlider() {
        return columnsSlider;
    }//private package getter

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

        gc.setFill(Color.WHITE);//paint the entire canvas white
        gc.fillRect(0.0, 0.0, totalWidth, totalHeight);//paint the entire canvas white
    }
}
