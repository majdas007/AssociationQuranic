/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author majd
 */
public class DashboardController implements Initializable {

    @FXML
    private JFXButton btnHome;
    @FXML
    private JFXButton btnPricing;
    @FXML
    private JFXButton btnContacts;
    @FXML
    private JFXButton btnWidgets;
    @FXML
    private JFXButton btnProfile;
    @FXML
    private JFXButton btnAlerts;
    @FXML
    private JFXButton btnControls;
    @FXML
    private AnchorPane holderPane;
    AnchorPane Inscription;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
                try {
           
             Inscription = FXMLLoader.load(getClass().getResource("Inscription.fxml"));
            setNode(Inscription);
        } catch (IOException ex) {
        }
    }    
        private void setNode(Node node) {
        holderPane.getChildren().clear();
        holderPane.getChildren().add((Node) node);

        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void switchPricing(ActionEvent event) {
    }

    @FXML
    private void switchContacts(ActionEvent event) {
    }

    @FXML
    private void switchWidget(ActionEvent event) {
    }

    @FXML
    private void switchProfile(ActionEvent event) {
    }

    @FXML
    private void switchAlert(ActionEvent event) {
    }

    @FXML
    private void switchControls(ActionEvent event) {
    }
    
}
