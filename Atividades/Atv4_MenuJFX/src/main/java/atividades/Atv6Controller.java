package atividades;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Atv6Controller {

    @FXML
    private TextField txtDistancia;

    @FXML
    private TextField txtPreco;

    @FXML
    private Label lblResultado;

    @FXML
    private void calcular() {

        try {
            double distancia = Double.parseDouble(
                txtDistancia.getText().trim().replace(",", ".")
            );

            double preco = Double.parseDouble(
                txtPreco.getText().trim().replace(",", ".")
            );

            if (distancia < 0 || preco < 0) {
                lblResultado.setText(
                    "Digite valores maiores ou iguais a zero."
                );
                return;
            }

            lblResultado.setText(
                Atv6.calcularViagem(distancia, preco)
            );

        } catch (NumberFormatException e) {
            lblResultado.setText(
                "Digite valores numéricos válidos."
            );
        }
    }

    @FXML
    private void voltar() throws IOException {

        FXMLLoader fxml = new FXMLLoader(
            getClass().getResource("/atividades/Menu.fxml")
        );

        Scene cena = new Scene(fxml.load());

        Stage stage = (Stage) txtDistancia.getScene().getWindow();

        stage.setScene(cena);
        stage.setTitle("Exercícios Java");
    }
}