package com.example.grid;

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
    }

    private void updateView() {
        this.view.drawGrid(this.model.getRows(), this.model.getColumns());
    }//get the number of columns and rows from the model and call drawGrid on the view
}
