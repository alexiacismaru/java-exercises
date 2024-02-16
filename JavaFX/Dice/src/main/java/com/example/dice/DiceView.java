package com.example.dice;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class DiceView extends GridPane {
    private ImageView die1;//new image
    private ImageView die2;//new image
    private Button btnThrow;//new button

    public DiceView() {
        initialiseNodes();
        layoutNodes();
    }//constructor initializing the viw methods

    private void initialiseNodes() {
        die1 = new ImageView();//set controls
        die2 = new ImageView();//set controls
        btnThrow = new Button("Roll");//set controls and add the word 'roll' on the button
        btnThrow.setPrefWidth(80);//set the button 80px wide
    }//initialise attributes

    private void layoutNodes() {
        setPadding(new Insets(10));//set the padding in between elements to 10px
        setHgap(10);//set a gap of 10px between the cells of the GridPane
        setVgap(10);//set a gap of 10px between the cells of the GridPane

        add(die1, 0, 0);//add the controls to the GridPane
        add(die2, 1, 0);//add the controls to the GridPane
        add(btnThrow, 0, 1, 2, 1);//add the controls to the GridPane
        setHalignment(btnThrow, HPos.CENTER);//set the button in the center
    }

    ImageView getDie1() {
        return die1;
    }//private package getter

    ImageView getDie2() {
        return die2;
    }//private package getter

    Button getBtnThrow() {
        return btnThrow;
    }//private package getter
}

