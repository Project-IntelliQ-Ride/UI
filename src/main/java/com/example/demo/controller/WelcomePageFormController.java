package com.example.demo.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class WelcomePageFormController {
    public AnchorPane panel;

    public void GetStartOnAction(MouseEvent mouseEvent) throws IOException {
        panel.getChildren().clear();
        panel.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../loginPageForm.fxml")))));
    }
}
