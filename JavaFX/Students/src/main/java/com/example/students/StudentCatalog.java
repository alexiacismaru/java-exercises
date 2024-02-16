package com.example.students;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentCatalog {
    private final List<Student> students;//new List<>
    private final InputStream inputStream;//new InputStream attribute
    //InputStream = constructor for subclasses to call
    public StudentCatalog() {
        this.students = new ArrayList<>();
        this.inputStream = this.getClass().getClassLoader().getResourceAsStream("students.txt");//import file
        this.readStudents();
    }//constructor

    public List<Student> getStudents() {
        return this.students;
    }//get the students from Student

    private void readStudents() {
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {//new InputStreamReader that reads
                                                                                                    //from inputStream
            //new BufferedReader that reads from the InputStreamReader
            String line = reader.readLine();
            Student student;
            while (line != null) {
                String[] tokens = line.split(";");//each line is split by the delimiter --according to the one used in the file
                student = new Student(tokens[0], tokens[1], Integer.parseInt(tokens[2]), tokens[3]);
                students.add(student);//create a student object and add it to the list
                line = reader.readLine();//read the lines as long as they're not null
            }
        } catch (IOException ex) {
            ex.printStackTrace();//print the StackTrace exception when one is caught
        }//any IOSExceptions should be caught
    }//make sure the BufferedReader is closed
}

