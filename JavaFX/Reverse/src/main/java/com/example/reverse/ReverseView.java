package com.example.reverse;

import javafx.geometry.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ReverseView extends GridPane {//inherit from grid pane
    private TextField input;//TextField attribute
    private Button reverseButton;//Button attribute

    public ReverseView() {
        initialiseNodes();
        layoutNodes();
    }

    TextField getInput() {
        return input;
    }//private package getter that retrieve from the presenter

    Button getReverseButton() {
        return reverseButton;
    }//private package getter that retrieve from the presenter

    private void initialiseNodes() {
        reverseButton = new Button("Reverse");//create object for the attribute-- button contains the word reverse
        input = new TextField();//create object for the attribute
    }

    private void layoutNodes() {
        add(input, 0, 0);//add the input field to the center
        add(reverseButton, 0, 1);//set the button to the grid pane
        setHalignment(reverseButton, HPos.RIGHT);//set the button to the right of the window
        setVgap(10);//set the gap between the cells of the grip pane
        setPadding(new Insets(10, 10, 10, 10));//set padding to the pane
    }
}
