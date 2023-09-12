package com.example.demo.controller.dashboard;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ManageStockFormController {


    public AnchorPane stockChangePane1;

    public void deletestockOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/stock/deleteStockForm.fxml"));
        stockChangePane1.getChildren().clear();
        stockChangePane1.getChildren().add(anchorPane);
    }

    public void addstockOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/stock/addStockForm.fxml"));
        stockChangePane1.getChildren().clear();
        stockChangePane1.getChildren().add(anchorPane);
    }

    public void viewstockOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/stock/viewStockForm.fxml"));
        stockChangePane1.getChildren().clear();
        stockChangePane1.getChildren().add(anchorPane);
    }

    public void updatestockOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/stock/updateStockForm.fxml"));
        stockChangePane1.getChildren().clear();
        stockChangePane1.getChildren().add(anchorPane);
    }
}
