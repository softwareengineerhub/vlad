module com.example.myfxapp01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfxapp01 to javafx.fxml;
    exports com.example.myfxapp01;
}