package com.example.dice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DiceMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        DiceModel model = new DiceModel();//import the model adjustments
        DiceView view = new DiceView();//import the view adjustments
        DicePresenter presenter = new DicePresenter(model, view);//import the presenter adjustments
        Scene scene = new Scene(view);//new scene based on the view
        primaryStage.setTitle("Dice");//add a title to the window
        primaryStage.setScene(scene);//set the scene
        primaryStage.show();//show the view
    }

    public static void main(String[] args){
        launch(args);//launch code
    }
}
