package com.example.students;

import java.util.List;

public class Presenter {
    private final StudentCatalog model;//new Model attribute
    private final StudentView view;//new View attribute

    private int currentStudent;//new int attribute

    public Presenter(StudentCatalog model, StudentView view) {
        this.model = model;
        this.view = view;
        currentStudent = 0;

        addEventHandlers();
        updateView();
    }//constructor

    private void addEventHandlers() {
        view.getPrevious().setOnAction(event -> {//add an event to getPrevious
            currentStudent--;
            updateView();//call updateView()
        });//clicking in the previous button makes the currentStudent attribute lower by 1

        view.getNext().setOnAction(event -> {//add an event to getNext
            currentStudent++;
            updateView();//call updateView()
        });//clicking in the next button makes the currentStudent attribute higher by 1
    }

    private void updateView() {
        if (currentStudent == 0) {//if currentStudent is equal to 0
            view.getPrevious().setDisable(true);//can't go back anymore
        } else {//otherwise
            view.getPrevious().setDisable(false);//can go back
        }

        if (currentStudent >= this.model.getStudents().size() - 1) {//currentStudent is bigger or equal to the size of the
                                                                    //students List
            view.getNext().setDisable(true);//can't go forward anymore
        } else {
            view.getNext().setDisable(false);//can go forward
        }

        final List<Student> students = model.getStudents();//new List storing the elements from the students List from the model
        if (!students.isEmpty()) {//if the List is not empty
            final Student student = students.get(currentStudent);//get the student
            view.getFirstNameInput().setText(student.getLastName());//the text that is presented by this text component to be the
                                                                    //specified text
            view.getLastNameInput().setText(student.getFirstName());//the text that is presented by this text component to be the
                                                                    //specified text
            view.getNumberInput().setText(String.valueOf(student.getNumber()));//the text that is presented by this text component to
                                                                               // be the specified text
            view.getGroupInput().setText(student.getGroup());//the text that is presented by this text component to be the specified text
        }
    }
}

