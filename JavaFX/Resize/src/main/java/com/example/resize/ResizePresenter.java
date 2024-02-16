package com.example.resize;

import javafx.stage.Window;

import java.util.HashMap;
import java.util.Map;

public class ResizePresenter {
    public enum Properties {X, Y, HEIGHT, WIDTH}//create a new enum inside a public class

    private static final double DEFAULT_X = 500.0;//new final double attribute
    private static final double DEFAULT_Y = 250.0;//new final double attribute
    private static final double DEFAULT_WIDTH = 600.0;//new final double attribute
    private static final double DEFAULT_HEIGHT = 400.0;//new final double attribute

    private final ResizeView view;//import view

    public ResizePresenter(ResizeView view) {
        this.view = view;
    }//constructor

    /*private void addEventHandlers() {
    }*/

    /*private void updateView() {
    }*/

    public void addWindowEventHandlers() {
        Window window = view.getScene().getWindow();//create a new Window imported from the view
        //Window --an object is a top-level window with no borders and no menubar. The default layout for a window is BorderLayout
        window.setOnCloseRequest(event -> {//lambda expression
            Map<String, Double> props = new HashMap<>();//new Map
            //Interface Map<K,V> --provides all the optional map operations, and permits null values and the null key
            //Class HashMap<K,V> --an object that maps keys to values. A map cannot contain duplicate keys; each key can map to
            //at most one value
            //K - the type of keys maintained by this map
            //V - the type of mapped values
            props.put(Properties.X.name(), window.getX());
            //pu() --puts the value of the named double field into the persistent field
            props.put(Properties.Y.name(), window.getY());
            props.put(Properties.WIDTH.name(), window.getWidth());
            props.put(Properties.HEIGHT.name(), window.getHeight());
            Settings.saveSettings(props);//save props
        });
    }

    public void updateWindowSize() {
        Window window = view.getScene().getWindow();
        final Map<String, Double> windowProps = Settings.loadSettings();
        if (windowProps != null) {
            window.setX(windowProps.get(Properties.X.name()));
            window.setY(windowProps.get(Properties.Y.name()));
            window.setWidth(windowProps.get(Properties.WIDTH.name()));
            window.setHeight(windowProps.get(Properties.HEIGHT.name()));
        } else {
            window.setX(DEFAULT_X);
            window.setY(DEFAULT_Y);
            window.setWidth(DEFAULT_WIDTH);
            window.setHeight(DEFAULT_HEIGHT);
        }
    }
}
