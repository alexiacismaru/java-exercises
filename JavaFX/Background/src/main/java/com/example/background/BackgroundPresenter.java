package com.example.background;

public class BackgroundPresenter {
    private BackgroundModel model;//import from the model class
    private BackgroundView view;//import from the view class

    public BackgroundPresenter(BackgroundModel model, BackgroundView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }//constructor

    private void addEventHandlers() {
        view.getBackgroundButton().setOnAction(event -> {//lambda expression
            model.setRandomColor();//call out the Random from the model class
            updateView();//call out updateView
        });
    }

    private void updateView() {
        view.setStyle(String.format("-fx-background-color:%s;", model.getBackground()));
    }//update the view with the random colour code
}
