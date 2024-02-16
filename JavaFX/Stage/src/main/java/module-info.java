module com.example.stage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stage to javafx.fxml;
    exports com.example.stage;
}