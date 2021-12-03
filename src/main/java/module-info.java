module com.example.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;



    opens com.example.gui;
    exports com.example.gui;
}