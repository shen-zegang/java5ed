module com.boda.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires com.fasterxml.jackson.databind;

    opens com.boda.example to javafx.fxml;
    exports com.boda.example;
}