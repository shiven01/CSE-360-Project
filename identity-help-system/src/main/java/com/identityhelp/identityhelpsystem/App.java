package com.identityhelp.identityhelpsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            URL fxmlLocation = getClass().getResource("/com/identityhelp/identityhelpsystem/login.fxml");
            System.out.println("FXML Location: " + fxmlLocation); // Debug print

            if (fxmlLocation == null) {
                System.err.println("Could not find login.fxml");
                return;
            }

            FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            stage.setTitle("Identity Help System");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.err.println("Error loading FXML: ");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}