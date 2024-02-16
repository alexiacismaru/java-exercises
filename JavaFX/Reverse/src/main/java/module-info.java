module com.example.reverse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reverse to javafx.fxml;
    exports com.example.reverse;
}