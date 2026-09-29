package atividades;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Atv4Controller {

    @FXML
    private TextField txtTemperaturas;

    @FXML
    private TextArea txtResultado;

    @FXML
    private void analisar() {

        try {
            String texto = txtTemperaturas.getText().trim();

            if (texto.isEmpty()) {
                txtResultado.setText(
                    "Digite pelo menos uma temperatura."
                );
                return;
            }

            String[] valores = texto.split(",");

            double[] temperaturas = new double[valores.length];

            for (int i = 0; i < valores.length; i++) {
                temperaturas[i] = Double.parseDouble(
                    valores[i].trim().replace(",", ".")
                );
            }

            txtResultado.setText(
                Atv4.analisarTemperaturas(temperaturas)
            );

        } catch (NumberFormatException e) {
            txtResultado.setText(
                "Digite temperaturas válidas separadas por vírgula."
            );
        }
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