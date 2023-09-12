package com.example.demo.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginPageFormController implements Initializable {
    public AnchorPane loginPanel;

    public void loginOnAction(MouseEvent mouseEvent) throws IOException {

        AnchorPane load = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/view/dashboardForm.fxml")));
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        Stage stage1 = (Stage) loginPanel.getScene().getWindow();
        stage1.close();
        stage.centerOnScreen();
        stage.show();
         }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*TextField textField = new TextField();
        textField.setText("Enter text here"); // Optional prompt text*/

        /*JFXTextField textField=new JFXTextField();
        textField.setText("Rayan ");

        loginPanel.getChildren().add(textField);
*/
/*
        boolean add = loginPanel.getChildren().add(textField);
*/

        // Set font properties
        /*Font font = Font.createFont("Arial", 15);*/
/*
        textField.setFont(font);
*/

        // Set text color to black
        /*textField.setStyle("-fx-text-fill: black;");*/

    }
}
