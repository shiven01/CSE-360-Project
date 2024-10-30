package com.identityhelp.identityhelpsystem.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import com.identityhelp.identityhelpsystem.service.UserService;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Label errorLabel;

    private final UserService userService;

    public LoginController() {
        this.userService = new UserService();
    }

    @FXML
    public void initialize() {
        errorLabel.setVisible(false);
        loginButton.setOnAction(event -> handleLogin());
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            errorLabel.setText("Please enter both username and password");
            errorLabel.setVisible(true);
            return;
        }

        if (userService.authenticate(username, password)) {
            try {
                // Load the dashboard
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/identityhelp/identityhelpsystem/dashboard.fxml"));
                Parent dashboard = loader.load();

                // Get the controller and set the username
                DashboardController dashboardController = loader.getController();
                dashboardController.setUsername(username);

                // Get the current stage and set the new scene
                Stage stage = (Stage) loginButton.getScene().getWindow();
                Scene scene = new Scene(dashboard);
                stage.setScene(scene);

            } catch (Exception e) {
                errorLabel.setText("Error loading dashboard");
                errorLabel.setVisible(true);
                e.printStackTrace();
            }
        } else {
            errorLabel.setText("Invalid username or password");
            errorLabel.setVisible(true);
        }
    }
}