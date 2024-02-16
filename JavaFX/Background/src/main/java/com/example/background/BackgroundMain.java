package com.example.background;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BackgroundMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        BackgroundModel model = new BackgroundModel();//import model
        BackgroundView view = new BackgroundView();//import view
        new BackgroundPresenter(model, view);//import presenter
        primaryStage.setScene(new Scene(view));//new scene
        primaryStage.setWidth(400);//the window is 400px wide
        primaryStage.setHeight(250);//the window is 250px tall
        primaryStage.setTitle("background");//add a title to the window
        primaryStage.show();//show stage
    }

    public static void main(String[] args) {
        launch(args);//launch the code
    }
}
