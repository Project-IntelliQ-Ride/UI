package com.example.demo.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class DashboardFormController {

    public AnchorPane mainPane;
    public AnchorPane changePane;

    public void logoutOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane load = FXMLLoader.load(getClass().getResource("/com/example/demo/loginPageForm.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        Stage stage1 = (Stage) mainPane.getScene().getWindow();
        stage1.close();
        stage.centerOnScreen();
        stage.show();
    }

    public void manageEmployeeOnAction(MouseEvent mouseEvent) throws IOException {
        changePane.getChildren().clear();
        changePane.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../manageEmployeeForm.fxml")))));
    }

    public void manageBusONAction(MouseEvent mouseEvent) throws IOException {
        changePane.getChildren().clear();
        changePane.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../manageBusForm.fxml")))));

    }

    public void manageStocksOnAction(MouseEvent mouseEvent) throws IOException {
        changePane.getChildren().clear();
        changePane.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../manageStockForm.fxml")))));

    }

    public void manageProfitOnAction(MouseEvent mouseEvent) throws IOException {
        changePane.getChildren().clear();
        changePane.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../manageProfitForm.fxml")))));

    }

    public void monitorDriverOnAction(MouseEvent mouseEvent) throws IOException {
        changePane.getChildren().clear();
        changePane.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../monitorDriverForm.fxml")))));

    }

    public void busHealthInfoOnAction(MouseEvent mouseEvent) throws IOException {
        changePane.getChildren().clear();
        changePane.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../busHealthInfoForm.fxml")))));

    }
}
