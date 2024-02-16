module com.example.contanct {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contanct to javafx.fxml;
    exports com.example.contanct;
}