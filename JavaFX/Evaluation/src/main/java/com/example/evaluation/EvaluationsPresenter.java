package com.example.evaluation;

import javafx.scene.chart.XYChart;

import java.util.Map;

public class EvaluationsPresenter {
    private final Evaluations model;//import from the model
    private final EvaluationsView view;//import from the view
    private static final String USER_RATING_LABEL = "User Rating";//attribute
    private static final String MILEAGE_LABEL = "Mileage";//attribute
    private static final String SAFETY_LABEL = "Safety";//attribute

    public EvaluationsPresenter(Evaluations model, EvaluationsView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }//constructor

    private void addEventHandlers() {
    }

    private void updateView() {//implement the updateView() method
        this.view.getBarChart().getXAxis().setLabel("Criteria");//get the X-axis from the bar chart and give it a label
        for (Map.Entry<String, Evaluation> evaluation : model.getResults().entrySet()) {//loop through the Map entries in the model
            XYChart.Series<String, Number> series = new XYChart.Series<>();//new series of data
            series.setName(evaluation.getKey());//set the name of the series to the brand --map key
            //the label of the data point is the name of the criterion --the class contains a constant for each label --code below
            series.getData().add(new XYChart.Data<String, Number>(USER_RATING_LABEL,
                    evaluation.getValue().getUserRating())
            );//the value is the score you get by calling the getter on the Evaluation
            series.getData().add(new XYChart.Data<String, Number>(MILEAGE_LABEL,
                    evaluation.getValue().getMileage()));//the value is the score you get by calling the getter on the Evaluation
            series.getData().add(new XYChart.Data<String, Number>(SAFETY_LABEL,
                    evaluation.getValue().getSafety()));//the value is the score you get by calling the getter on the Evaluation
            view.getBarChart().getData().add(series);//add the series to the bar chart
        }
    }
}
