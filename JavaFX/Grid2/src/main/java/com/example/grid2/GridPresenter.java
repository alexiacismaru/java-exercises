package com.example.grid2;

public class GridPresenter {
    private final GridModel model;//new Model attribute
    private final GridView view;//new View attribute

    public GridPresenter(GridModel model, GridView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }//constructor

    private void addEventHandlers() {
        this.view.getRowsSlider().setOnMouseDragged(event -> {//add an event to the slider
            this.model.setRows((int)this.view.getRowsSlider().getValue());//get the number of rows
            this.updateView();//call updateView() method
        });

        this.view.getColumnsSlider().setOnMouseDragged(event -> {//add an event to the slider
            this.model.setColumns((int)this.view.getColumnsSlider().getValue());//get the number of columns
            this.updateView();//call updateView() method
        });
    }

    private void updateView() {
        view.getColumnsSlider().adjustValue(model.getColumns());
        view.getRowsSlider().adjustValue(model.getRows());
        this.view.drawGrid(this.model.getRows(), this.model.getColumns());
    }//before drawing the grid set the slider values to the values in the model --this guarantees that the sliders are
     // at the correct position at startup
}
