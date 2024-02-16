package com.example.evaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluations {
    private final Map<String,Evaluation> results = new HashMap<>();//create a new Map

    public void add(String name, Evaluation evaluation){
        results.put(name, evaluation);
    }//add the card brand and its evaluation to the Map

    public Map<String, Evaluation> getResults() {
        return results;
    }//getter
}
