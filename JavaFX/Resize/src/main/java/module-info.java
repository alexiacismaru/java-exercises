module com.example.resize {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.resize to javafx.fxml;
    exports com.example.resize;
}