package com.example.demo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainFormController {
    public AnchorPane mainPanel;

    public void onClick(ActionEvent actionEvent) throws IOException {
        mainPanel.getChildren().clear();
        mainPanel.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../SecondForm.fxml")))));
    }
}






