module com.example.mailinglist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mailinglist to javafx.fxml;
    exports com.example.mailinglist;
}