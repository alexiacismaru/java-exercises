package com.example.dice;

import javafx.scene.image.Image;

public class DicePresenter {
    private static final String IMAGE_PACKAGE = "/images";//import images

    private final DiceModel model;//import from model
    private final DiceView view;//import from view

    public DicePresenter(DiceModel model, DiceView view) {
        this.model = model;
        this.view = view;
        updateView();
        addEventHandlers();
    }//constructor

    private void updateView() {
        view.getDie1().setImage(new Image(IMAGE_PACKAGE + "/die" + model.getNumberofPips1() + ".png"));
        view.getDie2().setImage(new Image(IMAGE_PACKAGE + "/die" + model.getNumberOfPips2() + ".png"));
    }//add an image to the die (ImageView) and the random number

    private void addEventHandlers() {
        view.getBtnThrow().setOnAction( event-> {//lambda expression
                    model.roll();//throw the dice
                    updateView();//call updateView
                }//roll the dice (randomise the numbers)
        );
    }
}
