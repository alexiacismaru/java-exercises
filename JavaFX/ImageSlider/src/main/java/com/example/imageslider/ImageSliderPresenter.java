package com.example.imageslider;

public class ImageSliderPresenter {
    private final ImageSliderView view;//new View attribute

    public ImageSliderPresenter(ImageSliderView view) {
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }//constructor

    private void addEventHandlers() {
        this.view.getSlider().setOnMouseDragged(event -> this.updateView());
    }//event calling the updateView() method that allows the user to drag the slider

    private void updateView() {
        this.view.updateCanvas(this.view.getSlider().getValue());
    }//calls the updateView() method that gets the values of the slider
}
