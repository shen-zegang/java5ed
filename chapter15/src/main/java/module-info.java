module com.boda.xy {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.boda.xy to javafx.fxml;
    exports com.boda.xy;
}