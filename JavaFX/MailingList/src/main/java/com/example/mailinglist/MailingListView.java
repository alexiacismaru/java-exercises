package com.example.mailinglist;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class MailingListView extends GridPane {
    private Label emailLabel;//new Label attribute
    private TextField emailTextField;//new TextField attribute
    private Button add;//new Button attribute
    private ListView<String> list;//new ListView<String> attribute
    private Button delete;//new Button attribute
    private Button save;//new Button attribute

    public MailingListView() {
        this.initialiseNodes();
        this.layoutNodes();
    }//constructor

    private void initialiseNodes() {
        this.emailLabel = new Label("Email address");//initialise Label and add a name to it
        this.emailTextField = new TextField();//initialise TextField
        this.add = new Button("Add >>");//initialise Button and add a name to it
        this.list = new ListView<>();//initialise ListView<>
        this.delete = new Button("Delete");//initialise Button and add a name to it
        this.save = new Button("Save");//initialise Button and add a name to it

        this.list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);//an enumeration used to specify how many items may
                                                                            // be selected
        this.add.setDisable(true);//disable a button
    }

    private void layoutNodes() {
        this.setPadding(new Insets(15.0));//set padding to the window
        this.setHgap(15.0);
        this.setVgap(15.0);

        GridPane.setConstraints(this.emailLabel, 0, 0, 1, 1, HPos.CENTER, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.emailLabel, 0, 0);//add constraints
        GridPane.setConstraints(this.emailTextField, 1, 0, 1, 1, HPos.CENTER, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.emailTextField, 1, 0);//add constraints
        GridPane.setConstraints(this.add, 0, 1, 2, 2, HPos.CENTER, VPos.TOP, Priority.NEVER, Priority.ALWAYS);
        this.add(this.add, 0, 1);//add constraints

        GridPane.setConstraints(this.list, 2, 0, 1, 2, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(this.list, 2, 0);//add constraints
        this.delete.setMaxWidth(Double.MAX_VALUE);//delete previous maximum width
        GridPane.setConstraints(this.delete, 2, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
        this.add(this.delete, 2, 2);//add constraints

        this.save.setPrefWidth(200.0);//add a preferred width
        GridPane.setConstraints(this.save, 0, 3, 3, 1, HPos.CENTER, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        this.add(this.save, 0, 3);//add constraints
    }

    Button getAdd() {
        return this.add;
    }//getter

    TextField getEmailTextField() {
        return this.emailTextField;
    }//getter

    ListView<String> getList() {
        return this.list;
    }//getter

    Button getDelete() {
        return this.delete;
    }//getter

    Button getSave() {
        return this.save;
    }//getter
}
