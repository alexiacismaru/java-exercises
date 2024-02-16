package com.example.background;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class BackgroundView extends BorderPane {
    private Button backgroundButton;//new button

    public Button getBackgroundButton() {
        return backgroundButton;
    }//getter


    public BackgroundView() {
        initialiseNodes();
        layoutNodes();
    }//constructor

    private void initialiseNodes() {
        backgroundButton = new Button("Repaint");//add controls and write 'repaint' on the button
    }

    private void layoutNodes() {
        setBottom(backgroundButton);//set the button at the bottom of the window
        setAlignment(backgroundButton, Pos.BOTTOM_RIGHT);//set the button at the bottom right of the window
        setPadding(new Insets(10, 10, 10, 10));//add padding
    }
}
