package com.example.mailinglist;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MailingList {
    private static final File FILE = new File("email_addresses.txt");//import file

    private final Set<EmailAddress> addresses;//create a new Set that will hold the email addresses

    public MailingList() {
        this.addresses = new TreeSet<>();
    }//constructor

    public void addEmailAddress(EmailAddress address) {
        this.addresses.add(address);
    }//method that adds addresses --String from the EmailAddress class-- to the set

    public List<String> getEmailAddresses() {
        final List<String> stringList = this.addresses.stream().map(EmailAddress::toString).collect(Collectors.toList());
        return Collections.unmodifiableList(stringList);
    }//steam() is used to process collections of objects
     //map() is used to transform one object into other by applying a function
     //collect() allows us to perform mutable fold operations (repackaging elements to some data structures and applying some
     //additional logic, concatenating them, etc.) on data elements held in a Stream instance

    public void removeEmailAddress(String address) {
        for (Iterator<EmailAddress> i = this.addresses.iterator(); i.hasNext(); ) {//iterator equals to the elements of the EmailAddress Set
            EmailAddress emailAddress = i.next();//represents the elements in the EmailAddress
            if (emailAddress.toString().equals(address)) {//if the emailAddress--Set-- is the same as the address--String--
                i.remove();//remove the element from the Iterator
                return;
            }
        }
    }
    //Iterator is an object that can be used to loop through collections like ArrayList and HashSet

    public void loadFromDisk() throws IOException {
        try (Scanner scanner = new Scanner(FILE)) {//create a Scanner that reads from FIlE
            String line;
            while (scanner.hasNextLine()) {//for as long there are lines available read the file line by line using the Scanner
                line = scanner.nextLine();
                addresses.add(new EmailAddress(line));//for each line create an EmailAddress and add it to addresses
            }
        }//exceptions are handled by the presenter
    }//make sure that the Scanner is closed

    public void saveToDisk() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(FILE)) {//create a PrintWriter that writes to FILE
            for (final EmailAddress address : addresses) {//iterate over all the email addresses of the addresses set
                printWriter.format("%s%n", address.toString());//use printWriter to write each of them on a separate line
            }
        }//exceptions are handled by the presenter
    }//make sure that the PrintWriter is closed
}
