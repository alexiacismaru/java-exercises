package com.example.mailinglist;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MailListMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        MailingList model = new MailingList();//import model
        MailingListView view = new MailingListView();//import view
        new Presenter(model, view);//pass the model and the view to the presenter
        primaryStage.setScene(new Scene(view));//set a new scene
        primaryStage.setTitle("Mailing list");//add a title to the window
        primaryStage.show();//show the scene
    }

    public static void main(String[] args) {
        Application.launch(args);
    }//launch the code above
}
