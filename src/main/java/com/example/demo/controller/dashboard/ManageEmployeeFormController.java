package com.example.demo.controller.dashboard;

import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static java.util.Objects.*;

public class ManageEmployeeFormController {
    public JFXComboBox comboBox;
    public AnchorPane employeeChangePane;


    public void addOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/employee/addEmployeeForm.fxml"));
        employeeChangePane.getChildren().clear();
        employeeChangePane.getChildren().add(anchorPane);
    }

    public void deleteOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/employee/deleteEmployeeForm.fxml"));
        employeeChangePane.getChildren().clear();
        employeeChangePane.getChildren().add(anchorPane);
    }

    public void viewOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/employee/viewEmployeeForm.fxml"));
        employeeChangePane.getChildren().clear();
        employeeChangePane.getChildren().add(anchorPane);
    }

    public void updateOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(requireNonNull(getClass().getResource("/com/example/view/employee/updateEmployeeForm.fxml")));
        employeeChangePane.getChildren().clear();
        employeeChangePane.getChildren().add(anchorPane);
    }
}
