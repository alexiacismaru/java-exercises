package com.example.students;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class StudentView extends GridPane {
    private Label lastName;//new Label attribute
    private Label firstName;//new Label attribute
    private Label number;//new Label attribute
    private Label group;//new Label attribute
    private TextField firstNameInput;//new TextField attribute
    private TextField lastNameInput;//new TextField attribute
    private TextField numberInput;//new TextField attribute
    private TextField groupInput;//new TextField attribute
    private Button next;//new Button attribute
    private Button previous;//new Button attribute

    public StudentView() {
        initialiseNodes();
        layoutNodes();
    }//constructor

    private void initialiseNodes() {
        lastName = new Label("Last name");//initialise Label
        firstName = new Label("First name");//initialise Label
        number = new Label("Number");//initialise Label
        group = new Label("Group");//initialise Label
        firstNameInput = new TextField();//initialise TextField
        lastNameInput = new TextField();//initialise TextField
        numberInput = new TextField();//initialise TextField
        groupInput = new TextField();//initialise TextField
        next = new Button("Next");//initialise Button
        previous = new Button("Previous");//initialise Button

        groupInput.setEditable(false);//this text component is not editable
        firstNameInput.setEditable(false);//this text component is not editable
        numberInput.setEditable(false);//this text component is not editable
        lastNameInput.setEditable(false);//this text component is not editable
    }

    private void layoutNodes() {
        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10));
        add(lastName, 0, 0);
        add(firstNameInput, 1, 0);
        add(firstName, 0, 1);
        add(lastNameInput, 1, 1);
        add(number, 0, 2);
        add(numberInput, 1, 2);
        add(group, 0, 3);
        add(groupInput, 1, 3);
        add(previous, 0, 4);
        add(next, 1, 4);
        GridPane.setHalignment(next, HPos.RIGHT);
        GridPane.setHalignment(previous, HPos.LEFT);
        GridPane.setConstraints(firstNameInput, 1, 0, 1, 1, HPos.LEFT, VPos.BASELINE, Priority.ALWAYS, Priority.NEVER);
    }

    Button getPrevious() {
        return previous;
    }//getter

    Button getNext() {
        return next;
    }//getter

    TextField getFirstNameInput() {
        return firstNameInput;
    }//getter

    TextField getLastNameInput() {
        return lastNameInput;
    }//getter

    TextField getNumberInput() {
        return numberInput;
    }//getter

    TextField getGroupInput() {
        return groupInput;
    }//getter
}

