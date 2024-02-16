package com.example.calculator;

import javafx.scene.control.Button;
import javafx.stage.Window;

import java.util.Map;

public class Presenter {
    final private Calculator model;//add attributes for the model
    final private CalculatorPane view;//add attributes for the view

    public Presenter(Calculator model, CalculatorPane view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }//constructor

    private void addEventHandlers() {
        for (Map.Entry<OperandCharacter, Button> button : view.getOperandButtons().entrySet()) {
            button.getValue().setOnAction(e -> modelAction(() -> model.handleInput(button.getKey())));
        }//get the values from OperandCharacter class
        for (Map.Entry<Operator, Button> button : view.getOperatorButtons().entrySet()) {
            button.getValue().setOnAction(e -> modelAction(() -> model.handleInput(button.getKey())));
        }//get the values from Operator class
        view.getEqualsButton().setOnAction(e -> modelAction(() -> model.calculate()));//add an eventHandler to each button
        //Pressing the "=" button should result in a call to the calculate method.
        view.getClearButton().setOnAction(e -> {
            model.clear();
            updateView();
        });//add an eventHandler to each button
        //Pressing the "C" button should result in a call to the clear method.
    }
    //depending on the button, the corresponding method of the Calculator class should be called with the right parameter:
    //handleInput(OperandCharacter)
    //handleInput(Operator)

    private void modelAction(Runnable r) {
        try{
            r.run();
        }catch (CalculatorException e) {
            model.clear();
        }
        updateView();
    }



    private void updateView() {
        view.getDisplay().setText(model.getDisplay());//text field is updated to display the right text. The model contains the information to display
    }

    public void addWindowEventHandlers() {
        Window window = view.getScene().getWindow();
        // add window event handlers
    }
}
