package com.example.contanct;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        final Messenger model = new Messenger();//import model
        final ContactView view = new ContactView();//import view
        new ContactPresenter(model, view);//pass the model and the view to the presenter
        primaryStage.setScene(new Scene(view));//set new scene
        primaryStage.setTitle("Contact");//add a name to the window
        primaryStage.show();//show the scene
    }

    public static void main(String[] args) {
        Application.launch(args);//launch the code above
    }
}
