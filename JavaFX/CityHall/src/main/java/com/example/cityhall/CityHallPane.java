package com.example.cityhall;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CityHallPane extends VBox {
    private static final Image IMAGE = new Image("/cityhall.jpg");//new image

    private ImageView imageView;//new ImageView attribute
    private RadioButton normal;//new RadioButton attribute
    private RadioButton blackAndWhite;//new RadioButton attribute
    private RadioButton sepia;//new RadioButton attribute

    public CityHallPane() {
        this.initialiseNodes();
        this.layoutNodes();
    }//constructor

    private void initialiseNodes() {
        this.setPadding(new Insets(15.0, 15.0, 15.0, 15.0));//add padding
        this.setSpacing(15.0);//add spacing

        this.imageView = new ImageView(IMAGE);//initialise the image

        final ToggleGroup group = new ToggleGroup();//new ToggleGroup

        this.normal = new RadioButton("Normal");//add the name of the radio button
        this.normal.setToggleGroup(group);//add the button to the ToggleGroup
        this.normal.setSelected(true);//make it selected

        this.blackAndWhite = new RadioButton("Black & White");//add the name of the radio button
        this.blackAndWhite.setToggleGroup(group);//add the button to the ToggleGroup

        this.sepia = new RadioButton("Sepia");//add the name of the radio button
        this.sepia.setToggleGroup(group);//add the button to the ToggleGroup
    }

    private void layoutNodes() {
        this.getChildren().add(this.imageView);
        this.getChildren().add(this.normal);
        this.getChildren().add(this.blackAndWhite);
        this.getChildren().add(this.sepia);
    }//add controls to the view --!be careful of the order!--

    RadioButton getNormal() {
        return normal;
    }//private package getter

    RadioButton getBlackAndWhite() {
        return blackAndWhite;
    }//private package getter

    RadioButton getSepia() {
        return sepia;
    }//private package getter

    void resetEffect() {
        this.imageView.setEffect(null);
    }//apply the effect method

    void applyBlackAndWhiteEffect() {
        ColorAdjust blackAndWhite = new ColorAdjust();
        blackAndWhite.setSaturation(-1.0);
        this.imageView.setEffect(blackAndWhite);
    }//apply the effect method

    void applySepiaEffect() {
        SepiaTone sepiaTone = new SepiaTone();
        sepiaTone.setLevel(0.8);
        this.imageView.setEffect(sepiaTone);
    }//apply the effect method
}
