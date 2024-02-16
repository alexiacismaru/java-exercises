package com.example.mailinglist;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

import java.io.IOException;
import java.util.List;

public class Presenter {
    private final MailingList model;//new Model attribute
    private final MailingListView view;//new View attribute

    private boolean isCurrentEmailAddressValid;//new boolean attribute

    public Presenter(MailingList model, MailingListView view) {
        this.model = model;
        this.view = view;

        this.isCurrentEmailAddressValid = false;

        try {
            this.model.loadFromDisk();//load a local disk file
        } catch (IOException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);//new Alert of type error
            alert.setTitle("Error");//add a title to the Alert
            alert.setHeaderText("Error while loading email addresses.");//add text to the Alert
            alert.setContentText(ex.getMessage());//get the exception
            alert.setResizable(true); // Due to a bug under Linux
            alert.showAndWait();//show the alert if it's necessary
        }

        this.addEventHandlers();
        this.updateView();
    }//constructor

    private void addEventHandlers() {
        this.view.getEmailTextField().textProperty().addListener((observable, oldValue, newValue) -> {
            if (EmailAddressVerification.isValidEmailAddress(newValue)) {
                this.isCurrentEmailAddressValid = true;
            } else {
                this.isCurrentEmailAddressValid = false;
            }
            updateView();
        });//add an event to the TextField and call updateView()

        final EventHandler<ActionEvent> eventHandler = event -> {
            if (!view.getAdd().isDisabled()) {//if adding in the view is disabled
                model.addEmailAddress(new EmailAddress(view.getEmailTextField().getText()));//new TextField in the model
                this.view.getEmailTextField().clear();//clear the TextField
                this.isCurrentEmailAddressValid = false;//set the email to not valid
                updateView();//call updateView()
            }
        };//add an event to the EventHandler

        this.view.getEmailTextField().setOnAction(eventHandler);//add the eventHandler written above
        this.view.getAdd().setOnAction(eventHandler);//add the eventHandler written above

        this.view.getDelete().setOnAction(event -> {
            if (this.view.getList().getSelectionModel().getSelectedIndex() != -1) {//if the index of the List element is not -1
                model.removeEmailAddress(view.getList().getSelectionModel().getSelectedItem());//remove the email address and
                                                                                              //get the selection number
                updateView();//call updateView
            }
        });//add an event to the getDelete

        this.view.getSave().setOnAction(event -> {
            try {
                model.saveToDisk();//load a local disk file
            } catch (IOException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);//new Alert of type error
                alert.setTitle("Error");//add a title to the Alert
                alert.setHeaderText("Error while saving email addresses.");//add text to the Alert
                alert.setContentText(ex.getMessage());//get the exception
                alert.setResizable(true); // Due to a bug under Linux
                alert.showAndWait();//show the alert if it's necessary
            }
        });//add an event to the getSave
    }

    private void updateView() {
        final List<String> addresses = this.model.getEmailAddresses();//List consisting of the emailAddresses in the model
        this.view.getList().setItems(FXCollections.observableArrayList(addresses));//creates a new empty observable list that
                                                                                   //is backed by an arraylist
        this.view.getDelete().setDisable(addresses.size() == 0);//disable the delete attribute and
                                                                //set the size of the addresses List to 0
        this.view.getAdd().setDisable(!this.isCurrentEmailAddressValid);//don't allow to add another address if the current
                                                                        //address is not valid
    }
}
