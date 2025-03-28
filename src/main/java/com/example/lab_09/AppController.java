package com.example.lab_09;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AppController {

    // Definicja elementu ImageView
    @FXML
    private ImageView imageView;

    // Definicja elementu Label
    @FXML
    private Label imageLabel;

    // Indeks aktualnie wyświetlanego obrazu
    private int currentImageIndex = 0;

    // Tablica ścieżek do obrazów
    private final String[] imagePaths = {
            "/images/cat2.png",
            "/images/las2.png",
            "/images/mrowka2.png",
            "/images/plaszczka3.png"
    };
    // Metoda obsługująca zdarzenie kliknięcia przycisku
    @FXML
    private void onButtonClick() {
        // Wczytanie obrazu na podstawie aktualnej ścieżki
        Image image = new Image(getClass().getResourceAsStream(imagePaths[currentImageIndex]));
        // Ustawienie obrazu w komponencie ImageView
        imageView.setImage(image);
        // Ustawienie tekstu etykiety z informacją o aktualnym obrazie
        imageLabel.setText("Obraz " + (currentImageIndex + 1) + " z 4");
        // Przejście do kolejnego indeksu
        currentImageIndex = (currentImageIndex + 1) % imagePaths.length;
    }

}

