package com.example.demo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ownerDashBoardController {
    public AnchorPane dashpanel;
    public AnchorPane pane;
    public AnchorPane root;
    public ImageView dashboardimgid;


    public void btnLogOut(ActionEvent actionEvent) throws IOException {
//        dashpanel.getChildren().clear();
//        dashpanel.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../SecondForm.fxml")))));


        AnchorPane load = FXMLLoader.load(getClass().getResource("/com/example/demo/SecondForm.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        Stage stage1 = (Stage) root.getScene().getWindow();
        stage1.close();
        stage.centerOnScreen();
        stage.show();
    }




    public void ManageStockOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/demo/manageStockForm.fxml"));
        root.getChildren().clear();
        root.getChildren().add(anchorPane);

    }

    public void ManageBusesOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/demo/busHealthInfoForm.fxml"));
        root.getChildren().clear();
        root.getChildren().add(anchorPane);
    }

    public void ManageProfitOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/demo/manageProfitForm.fxml"));
        root.getChildren().clear();
        root.getChildren().add(anchorPane);
    }

    public void MonitorDriverOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/demo/monitorDriverForm.fxml"));
        root.getChildren().clear();
        root.getChildren().add(anchorPane);
    }

    public void manageEmployeebtn(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/demo/manageEmployeeForm.fxml"));
        root.getChildren().clear();
        root.getChildren().add(anchorPane);
    }

    public void emplyeeOnAction(MouseEvent mouseEvent) {}
}
