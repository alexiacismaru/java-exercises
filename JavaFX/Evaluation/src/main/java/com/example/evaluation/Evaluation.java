package com.example.evaluation;

public class Evaluation {
    double userRating;//attribute
    double mileage;//attribute
    double Safety;//attribute

    public Evaluation(double userRating, double mileage, double safety) {
        this.userRating = userRating;
        this.mileage = mileage;
        Safety = safety;
    }//constructor

    public double getUserRating() {
        return userRating;
    }//getter

    public double getMileage() {
        return mileage;
    }//getter

    public double getSafety() {
        return Safety;
    }//getter
}
