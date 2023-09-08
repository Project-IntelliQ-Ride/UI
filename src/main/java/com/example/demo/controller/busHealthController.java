package com.example.demo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class busHealthController {

    public AnchorPane busHealthPanel;
    public void btnBackOnAction(ActionEvent actionEvent)throws IOException {
//        busHealthPanel.getChildren().clear();
//        busHealthPanel.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../SecondForm.fxml")))));


        AnchorPane load = FXMLLoader.load(getClass().getResource("/com/example/demo/SecondForm.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        Stage stage1 = (Stage) busHealthPanel.getScene().getWindow();
        stage1.close();
        stage.centerOnScreen();
        stage.show();
    }
}
