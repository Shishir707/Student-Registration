package com.example.mid_problem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class CourseRegistrationcontroller {

    @FXML
    private TableColumn<Dummy,String> courseCols;

    @FXML
    private ComboBox<String> courseComboBox;

    @FXML
    private TableColumn<Dummy,Integer> creditCols;

    @FXML
    private TextField creditTextField;

    @FXML
    private TableColumn<Dummy,Integer> idCols;

    @FXML
    private TextField idTextField;

    @FXML
    private TableColumn<Dummy, Integer> sectionCols;

    @FXML
    private ComboBox<Integer> sectionComboBox;

    @FXML
    private TableView<Dummy> studentTable;
    @FXML
    private CheckBox scholarshipCheckBox;
    @FXML
    private TextField scholarshipTextField;

    //handle the student registration course
    private ArrayList<RegisteredCourse> registration =new ArrayList<>();
    private ArrayList<Dummy> dummy =new ArrayList<>();
    int[] credit = {3,3,3,3,1,1,1,1};

    public void initialize() {

        courseComboBox.getItems().addAll("CSE101","CSE102","CSE103", "CSE104","CSE101L","CSE102L", "CSE103L","CSE104L");
        sectionComboBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        idCols.setCellValueFactory(new PropertyValueFactory<Dummy,Integer>("id"));
        courseCols.setCellValueFactory(new PropertyValueFactory<Dummy,String>("courseID"));
        sectionCols.setCellValueFactory(new PropertyValueFactory<Dummy,Integer>("section"));
        creditCols.setCellValueFactory(new PropertyValueFactory<Dummy,Integer>("courseCredit"));

    }
    @FXML
    void addCourseButton(ActionEvent event) {
        String courseID = courseComboBox.getValue();
        int  credit =  Integer.parseInt(creditTextField.getText());
        int section = sectionComboBox.getValue();

        RegisteredCourse data = new RegisteredCourse(credit, courseID, section);
        registration.add(data);
    }

    @FXML
    void registerButton(ActionEvent event) {
        studentTable.getItems().clear();
        int id=Integer.parseInt(idTextField.getText());
        for (RegisteredCourse i : registration) {
            Dummy d = new Dummy(id,i.getCourseID(), i.getSection(), i.getCourseCredit());
            dummy.add(d);
            studentTable.getItems().addAll(dummy);
        }
    }

}

