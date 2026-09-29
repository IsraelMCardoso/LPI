package atividades;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Atv5Controller {

    @FXML
    private TextField txtCamelos;

    @FXML
    private Label lblResultado;

    @FXML
    private void dividir() {

        try {
            int camelos = Integer.parseInt(txtCamelos.getText());

            if (camelos < 0) {
                lblResultado.setText(
                    "Digite uma quantidade válida de camelos."
                );
                return;
            }

            lblResultado.setText(
                Atv5.dividirCamelos(camelos)
            );

        } catch (NumberFormatException e) {
            lblResultado.setText(
                "Digite um número inteiro válido."
            );
        }
    }

    @FXML
    private void voltar() throws IOException {

        FXMLLoader fxml = new FXMLLoader(
            getClass().getResource("/atividades/Menu.fxml")
        );

        Scene cena = new Scene(fxml.load());

        Stage stage = (Stage) txtCamelos.getScene().getWindow();

        stage.setScene(cena);
        stage.setTitle("Exercícios Java");
    }
}