module com.example.birds {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.birds to javafx.fxml;
    exports com.example.birds;
}