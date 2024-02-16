package com.example.evaluation;

import javafx.scene.chart.XYChart;

import java.util.List;
import java.util.Map;

public class EvaluationsByBrandPresenter {
    private final Evaluations model;//import from the model
    private final EvaluationsView view;//import from the view
    private static final String USER_RATING_LABEL = "User Rating";//attribute
    private static final String MILEAGE_LABEL = "Mileage";//attribute
    private static final String SAFETY_LABEL = "Safety";//attribute

    public EvaluationsByBrandPresenter(Evaluations model, EvaluationsView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }//constructor

    private void addEventHandlers() {
    }

    private void updateView() {
        this.view.getBarChart().getXAxis().setLabel("Cars");//get the X-axis from the bar chart and give it a label
        XYChart.Series<String, Number> ratingSeries = makeSeries(USER_RATING_LABEL);//new series of data
        XYChart.Series<String, Number> mileageSeries = makeSeries(MILEAGE_LABEL);//new series of data
        XYChart.Series<String, Number> safetySeries = makeSeries(SAFETY_LABEL);//new series of data
        for (Map.Entry<String, Evaluation> evaluation : model.getResults().entrySet()) {//loop through the Map entries in the model
            //the label of the data point is the name of the criterion --the class contains a constant for each label --code below
            ratingSeries.getData().add(new XYChart.Data<String, Number>(
                    evaluation.getKey(),
                    evaluation.getValue().getUserRating())
            );//the value is the score you get by calling the getter in the Evaluation
            mileageSeries.getData().add(new XYChart.Data<String, Number>(
                    evaluation.getKey(),
                    evaluation.getValue().getMileage())
            );//the value is the score you get by calling the getter in the Evaluation
            safetySeries.getData().add(new XYChart.Data<String, Number>(
                    evaluation.getKey(),
                    evaluation.getValue().getSafety())
            );//the value is the score you get by calling the getter in the Evaluation
        }
        view.getBarChart().getData().addAll(List.of(ratingSeries,mileageSeries,safetySeries));//add the Series to the bar chart
    }

    private XYChart.Series<String, Number> makeSeries(String userRatingLabel) {
        XYChart.Series<String, Number> ratingSeries = new XYChart.Series<>();
        ratingSeries.setName(userRatingLabel);
        return ratingSeries;
    }//group the score by brand
}
