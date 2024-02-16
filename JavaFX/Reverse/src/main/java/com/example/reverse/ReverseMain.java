package com.example.reverse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ReverseMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        Reverse model = new Reverse("Enter text here: ");//model object with an initial text from the model
        ReverseView view = new ReverseView();//model object from the view
        new ReversePresenter(model, view);//model view presenter-- displays the model and the view
        primaryStage.setScene(new Scene(view));//set the new scene (the layout was decided in the view class)
        primaryStage.show();//show the scene
    }

    public static void main(String[] args) {
        launch(args);//launch the code above
    }
}
