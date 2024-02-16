package com.example.contanct;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Messenger {
    public void send(Message message) throws IOException {
        save(message);
        //implement the save method of the Messenger class. Its responsibility is to persist the given Message object save(message);
    }

    private void save(Message message) throws IOException {
        PrintWriter os = null;
        try {
            os = new PrintWriter//PrintWriter that writes to the BufferedWriter just created
                    (new BufferedWriter//a BufferedWriter that writes to the FileWriter just created
                    (new FileWriter(String.format("%s_%s.txt", message.getLastName(), message.getFirstName()))));//a FileWriter that
                     // writes to a file called <LastName>_<FirstName>.txt
            os.format("Last name:    %s %n", message.getLastName());
            os.format("First name:   %s %n", message.getFirstName());
            os.format("Email:        %s %n", message.getEmail());
            os.format("Message body: %n%s", message.getMessageBody());//use the PrintWriter to write the message data to the
                                                                      // file in this format
        } finally {
            if (os != null) {
                os.close();
            }//save method is declared to throw any IOException that occurs
        }//take care to correctly close the PrintWriter under all circumstances --even when an exception occurs
    }
}
