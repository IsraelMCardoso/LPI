package atividades;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Atv3Controller {

    @FXML
    private TextArea txtResultado;

    @FXML
    private void calcular() {
        txtResultado.setText(Atv3.calcularCompra());
    }

    @FXML
    private void voltar() throws IOException {

        FXMLLoader fxml = new FXMLLoader(
                getClass().getResource("/atividades/Menu.fxml")
        );

        Scene cena = new Scene(fxml.load());

        Stage stage = (Stage) txtResultado.getScene().getWindow();

        stage.setScene(cena);
        stage.setTitle("Exercícios Java");
    }
}