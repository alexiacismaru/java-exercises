package com.example.cityhall;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);//launch the code below
    }

    @Override
    public void start(Stage primaryStage) {
        final CityHallPane view = new CityHallPane();//import view
        final Presenter presenter = new Presenter(view);//import presenter
        primaryStage.setTitle("City Hall");//add a title to the widow
        primaryStage.setScene(new Scene(view));//set a new scene
        primaryStage.show();//show the scene
    }
}
