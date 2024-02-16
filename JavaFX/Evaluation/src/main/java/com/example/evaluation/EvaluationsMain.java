package com.example.evaluation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EvaluationsMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        Evaluations model = new Evaluations();//import the model
        fillModel(model);//import the model
        EvaluationsView view = new EvaluationsView();//import the view
        new EvaluationsPresenter(model, view);//import the presenter
        primaryStage.setScene(new Scene(view));//set e new scene
        primaryStage.setTitle("Car Evaluations");//give the window a name
        primaryStage.setWidth(800.0);//set the width of the window to 800px
        primaryStage.setHeight(600.0);//set the height of the window to 600px
        primaryStage.show();//show thw window
    }

    private void fillModel(Evaluations model) {
        model.add("Fiat", new Evaluation(3.0, 5.0, 5.0));
        model.add("Audi", new Evaluation(6.0, 10.0, 4.0));
        model.add("Ford", new Evaluation(2.0, 3.0, 6.0));
    }//add elements to the model

    public static void main(String[] args) {
        launch(args);//launch the code above
    }
}
