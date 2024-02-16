module com.example.background {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.background to javafx.fxml;
    exports com.example.background;
}