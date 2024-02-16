package com.example.reverse;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ReversePresenter {
    private final Reverse model;
    private final ReverseView view;

    public ReversePresenter(Reverse model, ReverseView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }//constructor

    private void addEventHandlers() {
        view.getReverseButton().setOnAction(new ReverseHandler());
    }//add the button from the view and add an event handler to it --the event handler gets the text, sets the text,
    // reverses the text and calls the updateView() method

    private void updateView() {
        view.getInput().setText(model.getText());
    }//this method gets the text from the model and sets the text in the input field

    class ReverseHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            model.setText(view.getInput().getText());//add the text in the input field
            model.reverse();//calls the reverse method
            updateView();//calls updateView
        }
    }
}
