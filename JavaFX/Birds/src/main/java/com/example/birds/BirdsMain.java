package com.example.birds;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class BirdsMain extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }//launch the code below

    @Override
    public void start(Stage primaryStage) {
        BirdsView view = new BirdsView();//import view
        primaryStage.setTitle("Birds");//set the title of the window
        primaryStage.setScene(new Scene(view));//set new scene
        primaryStage.getIcons().add(new Image("/angrybird.png"));//add an icon to the window
        primaryStage.show();//show the scene
    }
}
