package com.example.students;

public class Student {
    private final String lastName;//new private String attribute
    private final String firstName;//new private String attribute
    private final int number;//new private int attribute
    private final String group;//new private String attribute

    public Student(String lastName, String firstName, int number, String group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.number = number;
        this.group = group;
    }//constructor

    public String getLastName() {
        return lastName;
    }//getter

    public String getFirstName() {
        return firstName;
    }//getter

    public int getNumber() {
        return number;
    }//getter

    public String getGroup() {
        return group;
    }//getter
}
