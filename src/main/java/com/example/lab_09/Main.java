package com.example.lab_09;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("window.fxml"));
        // Tworzenie obiektu Scene z wczytanym widokiem
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);
        // Przypisanie sceny do okna aplikacji
        stage.setScene(scene);
        // Wyświetlenie okna aplikacji
        stage.show();
    }

    public static void main(String[] args) {
        // Uruchamianie aplikacji
        launch();
    }
}