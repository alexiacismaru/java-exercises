package com.example.evaluation;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.BorderPane;

public class EvaluationsView extends BorderPane {
    private BarChart<String,Number> chart; //bar chart attribute

    public EvaluationsView() {
        this.initialiseNodes();
        this.layoutNodes();
    }//constructor

    private void initialiseNodes() {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        this.chart = new BarChart<>(xAxis, yAxis);
    }//creating a bar chart using a CategoryAxis and NumberAxis as parameters

    private void layoutNodes() {
        this.setCenter(this.chart);
    }//put the bar chart in the center of the BorderPane

    BarChart<String, Number> getBarChart() {
        return this.chart;
    }//getter
}

