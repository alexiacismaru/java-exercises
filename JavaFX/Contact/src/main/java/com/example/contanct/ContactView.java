package com.example.contanct;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class ContactView extends GridPane {
    private Label lastName;//new Label attribute
    private Label firstName;//new Label attribute
    private Label email;//new Label attribute
    private Label messageBody;//new Label attribute
    private TextField lastNameInput;//new TextField attribute
    private TextField firstNameInput;//new TextField attribute
    private TextField emailInput;//new TextField attribute
    private TextArea messageBodyInput;//new TextField attribute
    private Button submitButton;//new Button attribute

    public ContactView() {
        this.initialiseNodes();
        this.layoutNodes();
    }//constructor

    private void initialiseNodes() {
        this.lastName = new Label("Last name");//initialise Label and add a name
        this.firstName = new Label("First name");//initialise Label and add a name
        this.email = new Label("Email");//initialise Label and add a name
        this.messageBody = new Label("Message");//initialise Label and add a name
        this.lastNameInput = new TextField();//initialise input
        this.firstNameInput = new TextField();//initialise input
        this.emailInput = new TextField();//initialise input
        this.messageBodyInput = new TextArea();//initialise input
        this.submitButton = new Button("Submit");//initialise button and add a name
    }

    private void layoutNodes() {
        this.setPadding(new Insets(10.0, 10.0, 10.0, 10.0));//set padding to the window
        this.setHgap(20.0);
        this.setVgap(10.0);

        GridPane.setConstraints(this.lastName, 0, 0, 1, 1, HPos.LEFT, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.lastName, 0, 0);//add constraints

        GridPane.setConstraints(this.lastNameInput, 1, 0, 1, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
        this.add(this.lastNameInput, 1, 0);//add constraints

        GridPane.setConstraints(this.firstName, 0, 1, 1, 1, HPos.LEFT, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.firstName, 0, 1);//add constraints

        GridPane.setConstraints(this.firstNameInput, 1, 1, 1, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
        this.add(this.firstNameInput, 1, 1);//add constraints

        GridPane.setConstraints(this.email, 0, 2, 1, 1, HPos.LEFT, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.email, 0, 2);//add constraints

        GridPane.setConstraints(this.emailInput, 1, 2, 1, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
        this.add(this.emailInput, 1, 2);//add constraints

        GridPane.setConstraints(this.messageBody, 0, 3, 2, 1, HPos.LEFT, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.messageBody, 0, 3);//add constraints

        GridPane.setConstraints(this.messageBodyInput, 0, 4, 2, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(this.messageBodyInput, 0, 4);//add constraints

        GridPane.setConstraints(this.submitButton, 0, 5, 2, 1, HPos.CENTER, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.submitButton, 0, 5);//add constraints
    }

    Button getSubmitButton() {
        return this.submitButton;
    }//getter

    TextField getLastNameInput() {
        return lastNameInput;
    }//getter

    TextField getFirstNameInput() {
        return firstNameInput;
    }//getter

    TextField getEmailInput() {
        return emailInput;
    }//getter

    TextArea getMessageBodyInput() {
        return messageBodyInput;
    }//getter

    void clearInput() {
        getLastNameInput().clear();
        getFirstNameInput().clear();
        getEmailInput().clear();
        getMessageBodyInput().clear();
        getLastNameInput().requestFocus();
    }//clear() method
}

