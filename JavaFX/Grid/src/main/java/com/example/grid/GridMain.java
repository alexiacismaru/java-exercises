package com.example.grid;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GridMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridModel model = new GridModel(10,10);//create a model with 10 rows and 10 columns
        GridView view = new GridView();//import view
        new GridPresenter(model, view);//pass the model and the view to the presenter which draws the grid
        primaryStage.setScene(new Scene(view));//set scene
        primaryStage.setTitle("Grid");//add a name to the window
        primaryStage.setResizable(false);//user can't resize the window
        primaryStage.show();//show the scene
    }
}
