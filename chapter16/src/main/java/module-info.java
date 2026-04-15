module com.boda.xy {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;   //
    requires javafx.web;
    requires java.sql;

    opens com.boda.xy to javafx.fxml;
    exports com.boda.xy;
}