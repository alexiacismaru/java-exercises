package com.example.contanct;

public class Message {
    private final String lastName;//attribute
    private final String firstName;//attribute
    private final String email;//attribute
    private final String messageBody;//attribute

    public Message(String lastName, String firstName, String email, String messageBody) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.messageBody = messageBody;
    }//constructor

    public String getLastName() {
        return lastName;
    }//getter

    public String getFirstName() {
        return firstName;
    }//getter

    public String getEmail() {
        return email;
    }//getter

    public String getMessageBody() {
        return messageBody;
    }//getter
}
