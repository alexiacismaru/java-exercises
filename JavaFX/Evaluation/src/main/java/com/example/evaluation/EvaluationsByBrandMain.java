package com.example.evaluation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EvaluationsByBrandMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        Evaluations model = new Evaluations();//import model
        fillModel( model);//import fillModel() method
        EvaluationsView view = new EvaluationsView();//import view
        new EvaluationsByBrandPresenter(model, view);//pass the model and the view to the presenter
        primaryStage.setScene(new Scene(view));//set a new scene
        primaryStage.setTitle("Car Evaluations");//give the window a name
        primaryStage.setWidth(800.0);//set the width of the window to 800px
        primaryStage.setHeight(600.0);//set the height of the window to 600px
        primaryStage.show();//show the window
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
