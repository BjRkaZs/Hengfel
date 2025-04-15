/*
* File: SolutionController.java
* Author: Bajusz Réka
* Copyright: 2025, Bajusz Réka
* Group: Szoft V
* Date: 2025-02-11
* Github: https://github.com/BjRkaZs/Hengfel
* Licenc: MIT
*/

package com.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class SolutionController {

    @FXML
    private TextField lengthField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField resultField;

    @FXML
    private ListView<String> resultList;

    @FXML
    void initialize() {
        System.out.println("Előkészítés");
        App._stage.setOnCloseRequest(e->{
            System.out.println("Bezárva");
            
            Store.saveResults(resultList.getItems().toString());
        });
    }

    @FXML
    void onClickCalcButton(ActionEvent event) {
        String radiusStr = this.radiusField.getText();
        double radius = Double.parseDouble(radiusStr);
        String lengthStr = this.lengthField.getText();
        double length = Double.parseDouble(lengthStr);
        Double surface = this.calcSurface(radius, length);
        this.resultField.setText(surface.toString());
        this.resultList.getItems().add(resultField.getText());
    }

    private Double calcSurface(double radius, double length){
        return 2 * Math.PI * radius * (radius + length);
    }

}
