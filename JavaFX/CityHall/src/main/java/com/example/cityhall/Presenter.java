package com.example.cityhall;

public class Presenter {
    private final CityHallPane view;

    public Presenter(CityHallPane view) {
        this.view = view;//import view

        this.addEventHandlers();//initialise method
    }

    private void addEventHandlers() {
        this.view.getNormal().setOnAction(event -> Presenter.this.view.resetEffect());//add an EventHandler --method resetEffect--
        this.view.getBlackAndWhite().setOnAction(event -> Presenter.this.view.applyBlackAndWhiteEffect());//add an EventHandler --method applyBlackAndWhiteEffect--
        this.view.getSepia().setOnAction(event -> Presenter.this.view.applySepiaEffect());//add an EventHandler --method applySepiaEffect--
    }
}
