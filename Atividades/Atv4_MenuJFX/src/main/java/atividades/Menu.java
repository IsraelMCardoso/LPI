package atividades;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Menu extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxml = new FXMLLoader(
                getClass().getResource("/atividades/Menu.fxml")
        );

        Scene cena = new Scene(fxml.load());

        stage.setTitle("Exercícios Java");
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}