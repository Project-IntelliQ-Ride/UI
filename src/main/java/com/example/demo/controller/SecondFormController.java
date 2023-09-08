package com.example.demo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class SecondFormController {
    public AnchorPane mainPanel;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        mainPanel.getChildren().clear();
        mainPanel.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../dashBoardForm.fxml")))));
    }
}
