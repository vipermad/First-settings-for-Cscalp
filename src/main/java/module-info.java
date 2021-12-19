module app {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires java.net.http;
    requires com.google.gson;
    requires javafx.graphics;

    opens app;
    exports app;
}