package com.example.stage;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class onStageController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}