package com.identityhelp.identityhelpsystem.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class DashboardController {
    @FXML
    private Label userLabel;

    private String username;

    public void initialize() {
        // Initialize dashboard components
    }

    public void setUsername(String username) {
        this.username = username;
        userLabel.setText("Logged in as: " + username);
    }

    @FXML
    private void handleLogout() throws IOException {
        // Get the current stage
        Stage stage = (Stage) userLabel.getScene().getWindow();

        // Load the login screen
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/identityhelp/identityhelpsystem/login.fxml"));
        Parent root = loader.load();

        // Set the scene
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
}