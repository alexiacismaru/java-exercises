module com.example.grid2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.grid2 to javafx.fxml;
    exports com.example.grid2;
}