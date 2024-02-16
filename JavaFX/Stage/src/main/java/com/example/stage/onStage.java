package com.example.stage;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class onStage extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label helloLabel = new Label("Hello JavaFX!");//node-- writing on the screen
        BorderPane root = new BorderPane(helloLabel);//scenegraph
        Scene scene = new Scene(root);//scene
        primaryStage.setScene(scene);//set the scene-- Stage can contain one scene at a time
        primaryStage.setHeight(500);//set the height
        primaryStage.setWidth(600);//set the width
        //primaryStage. setResizable(false);//the user cannot resize the window
        primaryStage.setTitle("Stage assignment");//set a title for the window
        primaryStage.setMaxWidth(700);//the user can stretch the window but only to a max of 700px
        scene.setCursor(Cursor.CROSSHAIR);//new cursor type
        primaryStage.show();//show the scene

        Stage newStage = new Stage();//new window
        Scene newScene = new Scene(new Group());//add a new scene group (allows you to have multiple windows)
        newStage.setTitle("Another title");//add a title to the window
        newScene.setFill(Color.YELLOW);//change the background colour to yellow
        newStage.setScene(newScene);//add a new stage
        newStage.show();//show the new stage
    }

    public static void main(String[] args) {
        launch(args);//launch all the code above
    }
}