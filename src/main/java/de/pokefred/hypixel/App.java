package de.pokefred.hypixel;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        Application.launch(App.class, args);
    }

    public void init() {}

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hypixel Skyblock - Bot Manager");
        stage.setWidth(800);
        stage.setHeight(600);

        stage.show();
    }

    public void stop() {}
}
