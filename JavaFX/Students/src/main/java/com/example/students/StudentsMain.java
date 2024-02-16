package com.example.students;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentsMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        StudentCatalog model = new StudentCatalog();//import model
        StudentView view = new StudentView();//import view
        new Presenter(model, view);//pass the model and the view to the presenter
        Scene scene = new Scene(view);//create a new scene
        primaryStage.setScene(scene);//set e new scene
        primaryStage.setTitle("Students");//add a name to the window
        primaryStage.show();//show the scene
    }

    public static void main(String[] args) {
        Application.launch(args);
    }//launch the code above
}
