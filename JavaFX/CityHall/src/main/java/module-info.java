module com.example.cityhall {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cityhall to javafx.fxml;
    exports com.example.cityhall;
}