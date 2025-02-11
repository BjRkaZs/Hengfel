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

public class SolutionController {

    @FXML
    private TextField lengthField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField resultField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        String radiusStr = this.radiusField.getText();
        double radius = Double.parseDouble(radiusStr);
        String lengthStr = this.lengthField.getText();
        double length = Double.parseDouble(lengthStr);
        Double surface = this.calcSurface(radius, length);
        this.resultField.setText(surface.toString());
    }

    private Double calcSurface(double radius, double length){
        return 2 * Math.PI * radius * (radius + length);
    }

}
