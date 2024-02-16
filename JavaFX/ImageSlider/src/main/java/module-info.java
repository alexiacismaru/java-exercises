module com.example.imageslider {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.imageslider to javafx.fxml;
    exports com.example.imageslider;
}