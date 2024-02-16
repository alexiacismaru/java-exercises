package com.example.mailinglist;

public class EmailAddressException extends IllegalArgumentException {
    public EmailAddressException(String msg) {
        super(msg);
    }
}