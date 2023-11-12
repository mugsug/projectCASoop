module com.example.projectcasoop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectcasoop to javafx.fxml;
    exports com.example.projectcasoop;
}