module com.example.evaluation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.evaluation to javafx.fxml;
    exports com.example.evaluation;
}