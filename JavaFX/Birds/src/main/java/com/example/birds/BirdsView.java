package com.example.birds;

import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class BirdsView extends BorderPane {
    private final Image birdImage;//new Image

    private MenuItem birdMenuItem;//new MenuItem
    private CheckBox birdCheckBox;//new CheckBox

    public BirdsView() {
        birdImage = new Image("/angrybird.png");//initialise the image

        initialiseNodes();
        layoutNodes();
    }//constructor

    private void initialiseNodes() {
        birdMenuItem = new MenuItem("Bird", new ImageView(birdImage));//initialise the MenuItem , add a name and an image
        birdCheckBox = new CheckBox();//initialise the CheckBox
        birdCheckBox.setGraphic(new ImageView(birdImage));//add an image to the CheckBox
    }

    private void layoutNodes() {
        Menu fileMenu = new Menu("File");//new menu with name
        fileMenu.getItems().add(birdMenuItem);//add the MenuItem to the Menu
        fileMenu.setGraphic(new ImageView(birdImage));//add an image to the Menu
        MenuBar menuBar = new MenuBar();//create new MenuBar
        menuBar.getMenus().add(fileMenu);//add the Menu to the MenuBar

        this.setTop(menuBar);//set the MenuBar at the top of the window
        this.setCenter(birdCheckBox);//set the CheckBox to the center of the window

        BorderPane.setMargin(birdCheckBox, new Insets(20.0));//add margins to the CheckBox
    }
}
