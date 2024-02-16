package com.example.imageslider;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ImageSliderMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        ImageSliderView view = new ImageSliderView();//import view
        new ImageSliderPresenter(view);//pass the view to the presenter
        primaryStage.setScene(new Scene(view));//set new scene
        primaryStage.setTitle("New York - Before and After 9/11");//add a title to the window
        primaryStage.setResizable(false);//user can't resize the window
        primaryStage.show();//show the scene
    }

    public static void main(String[] args) {
        Application.launch(args);//launch the code above
    }
}
