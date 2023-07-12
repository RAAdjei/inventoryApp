module com.example.inventoryapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires com.dlsc.formsfx;

    opens com.example.inventoryapp to javafx.fxml;
    exports com.example.inventoryapp;
    exports com.example.inventoryapp.controller;
    opens com.example.inventoryapp.controller to javafx.fxml;
}