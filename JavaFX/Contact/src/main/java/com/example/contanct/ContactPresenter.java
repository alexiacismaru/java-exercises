package com.example.contanct;

import javafx.scene.control.Alert;

public class ContactPresenter {
    private final Messenger model;//new Model object
    private final ContactView view;//new View object

    public ContactPresenter(Messenger model, ContactView view) {
        this.model = model;
        this.view = view;

        addEventHandlers();
    }//constructor

    private void addEventHandlers() {
        this.view.getSubmitButton().setOnAction(event -> {//add event to the button
            final String lastName = view.getLastNameInput().getText();//get the text from the lastName String
            final String firstName = view.getFirstNameInput().getText();//get the text from the firstName String
            final String email = view.getEmailInput().getText();//get the text from the email String
            final String messageBody = view.getMessageBodyInput().getText();//get the text from the messageBody String

            try {
                Message message = new Message(lastName, firstName, email, messageBody);
                model.send(message);//send message

                final Alert sendAlert = new Alert(Alert.AlertType.INFORMATION);//create new Alert --of type info-- window
                sendAlert.setHeaderText("Message sent");//header of the Alert window
                sendAlert.setContentText(String.format("To: %s %s", lastName, firstName));//text on the Alert
                sendAlert.showAndWait();//If the message has been "sent", and if no errors occurred, show an Alert that says
                                        // "Message sent" in the header, and to whom it was sent in the Alert's content

                updateView();//call updateView()
            } catch (Exception exc) {
                final Alert sendAlert = new Alert(Alert.AlertType.ERROR);//create new Alert --of type error-- window
                sendAlert.setHeaderText("Error sending message");//header of the Alert window
                sendAlert.setContentText(exc.toString());//turn the exception into a String
                sendAlert.showAndWait();//If something went wrong, show an Alert that says "Error sending message" in the header,
                                        // and the exception details in the Alert's content
            }
        });
    }

    private void updateView() {
        view.clearInput();
    }//call the clearInput() method
}
