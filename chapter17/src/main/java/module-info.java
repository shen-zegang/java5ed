module com.boda.xy {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.zaxxer.hikari;

    opens com.boda.xy to javafx.fxml;
    exports com.boda.xy;
}