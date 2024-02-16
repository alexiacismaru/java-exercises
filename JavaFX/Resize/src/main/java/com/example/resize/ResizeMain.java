package com.example.resize;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ResizeMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        final ResizeView view = new ResizeView();//import view
        final ResizePresenter presenter = new ResizePresenter(view);
        primaryStage.setScene(new Scene(view));//pass the model and the view to the presenter
        presenter.addWindowEventHandlers();//call EventHandlers() method
        presenter.updateWindowSize();//call updateWindowSize() method
        primaryStage.setTitle("Resize me!");//add a name to the window
        primaryStage.show();//show the scene
    }

    public static void main(String[] args) {
        Application.launch(args);//launch the code above
    }
}
