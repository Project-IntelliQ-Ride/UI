package com.example.demo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class dashBoardController {
    public AnchorPane mainpanel2;
    public ImageView dashboardImg;


    public void btnLogOut(ActionEvent actionEvent)throws IOException {
        Stage  stage = (Stage) dashboardImg.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/com/example/demo/SecondForm.fxml"))));
        stage.centerOnScreen();

    }

    public void btnHealthOnClick(ActionEvent actionEvent)throws IOException {
//        mainpanel2.getChildren().clear();
//        mainpanel2.getChildren().add(FXMLLoader.load((Objects.requireNonNull(getClass().getResource("../busHealthForm.fxml")))));


        Stage  stage = (Stage) dashboardImg.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/com/example/demo/busHealthForm.fxml"))));
        stage.centerOnScreen();
    }

    public void btnOnclickDeportMangeMent(ActionEvent actionEvent) throws IOException {
//        mainpanel2.getChildren().clear();
//        mainpanel2.getChildren().add(FXMLLoader.load(this.getClass().getResource("/com/example/demo/ownerDashBoard.fxml")));
//
        Stage  stage = (Stage) dashboardImg.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/com/example/demo/ownerDashBoard.fxml"))));
        stage.centerOnScreen();



    }
}
