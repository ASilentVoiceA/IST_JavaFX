package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import models.Discipline;
import models.Teacher;

public class Controller {
    @FXML
    ComboBox<String> weekDayComboBox;
    @FXML
    ComboBox<String> classComboBox;
    @FXML
    ComboBox<Discipline> disciplineComboBox;
    @FXML
    ComboBox<String> cabinetComboBox;
    @FXML
    ComboBox<Teacher> teacherComboBox;
    @FXML
    ComboBox<String> numberComboBox;
}
