module com.example.mid_problem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mid_problem to javafx.fxml;
    exports com.example.mid_problem;
}