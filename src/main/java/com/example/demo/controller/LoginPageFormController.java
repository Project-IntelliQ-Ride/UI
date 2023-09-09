package com.example.demo.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginPageFormController {
    public AnchorPane loginPanel;

    public void loginOnAction(MouseEvent mouseEvent) throws IOException {

        AnchorPane load = FXMLLoader.load(getClass().getResource("/com/example/demo/dashboardForm.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        Stage stage1 = (Stage) loginPanel.getScene().getWindow();
        stage1.close();
        stage.centerOnScreen();
        stage.show();
         }
}
