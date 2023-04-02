package com.example.comp1008st200536996assignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("library-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Andreas's Favourite Books");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("images/book.jpeg")));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}