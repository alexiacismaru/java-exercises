package com.example.imageslider;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ImageSliderView extends VBox {
    private static final Image BEFORE = new Image("images/before.jpg");//new Image
    private static final Image AFTER = new Image("images/after.jpg");//new Image

    private static final double IMAGE_WIDTH = 900.0;//the width of the images
    private static final double IMAGE_HEIGHT = 595.0;//the height of the images

    private Canvas canvas;//new Canvas
    private Slider slider;//new Slider

    public ImageSliderView() {
        this.initialiseNodes();
        this.layoutNodes();
    }//constructor

    private void initialiseNodes() {
        this.canvas = new Canvas();//initialise Canvas
        this.slider = new Slider(0.0, 100.0, 50.0);//initialise Slider
    }

    private void layoutNodes() {
        this.canvas.setWidth(IMAGE_WIDTH);//set the width of the Canvas
        this.canvas.setHeight(IMAGE_HEIGHT);//set the height of the Canvas
        this.slider.setMinWidth(IMAGE_WIDTH + 14.0);//set the minimum width of the Canvas

        this.setSpacing(5.0);//add spacing
        this.setPadding(new Insets(5.0, 5.0, 5.0, 5.0));//add padding
        this.setAlignment(Pos.CENTER);//set the Canvas in the middle of the window

        this.getChildren().add(this.canvas);//list the current component in VBox
        this.getChildren().add(this.slider);//list the current component in VBox
    }

    Slider getSlider() {
        return this.slider;
    }//getter

    /**
     * @param percentage A value from 0 to 100. The percentage of the "before" picture that should be displayed.
     */
    void updateCanvas(double percentage) {
        GraphicsContext graphics = this.canvas.getGraphicsContext2D();//draw the Canvas

        graphics.drawImage(BEFORE,
                0.0, 0.0, IMAGE_WIDTH * percentage / 100.0, IMAGE_HEIGHT,
                0.0, 0.0, IMAGE_WIDTH * percentage / 100.0, IMAGE_HEIGHT);
                //v0 = drawing the image from the left
                //v1 = before image
                //v2, v3 = left top coordinates of the image
                //v4, v5 = right bottom coordinates of the image
                //v6, v7 = left top coordinates in the canvas from where the image needs to be displayed
                //v8, v9 = right bottom coordinates in the canvas up to where the image needs to be displayed
        graphics.drawImage(AFTER,
                IMAGE_WIDTH * percentage / 100.0, 0.0, IMAGE_WIDTH, IMAGE_HEIGHT,
                IMAGE_WIDTH * percentage / 100.0, 0.0, IMAGE_WIDTH, IMAGE_HEIGHT);
                //draw the AFTER image from the slider (x=width*(1-percentage/100)) to the right (x=width)
        graphics.setStroke(Color.BLACK);//draw a vertical black line
        graphics.setLineWidth(3.0);//3px wide
        graphics.strokeLine(IMAGE_WIDTH * percentage / 100.0, 0.0, IMAGE_WIDTH * percentage / 100.0, IMAGE_HEIGHT);
        //from the bottom to the top at the slider position
    }
}
