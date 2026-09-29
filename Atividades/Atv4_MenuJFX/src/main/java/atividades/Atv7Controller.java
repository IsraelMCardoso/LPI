package atividades;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Atv7Controller {

    @FXML
    private TextField txtDiaria;

    @FXML
    private TextField txtMaxKm;

    @FXML
    private TextField txtValorKm;

    @FXML
    private TextField txtDistancia;

    @FXML
    private TextField txtDias;

    @FXML
    private Label lblResultado;

    @FXML
    private void calcular() {

        try {
            double diaria = Double.parseDouble(
                txtDiaria.getText().trim().replace(",", ".")
            );

            double maxKm = Double.parseDouble(
                txtMaxKm.getText().trim().replace(",", ".")
            );

            double valorKm = Double.parseDouble(
                txtValorKm.getText().trim().replace(",", ".")
            );

            double distancia = Double.parseDouble(
                txtDistancia.getText().trim().replace(",", ".")
            );

            int dias = Integer.parseInt(
                txtDias.getText().trim()
            );

            if (diaria < 0 || maxKm < 0 || valorKm < 0
                    || distancia < 0 || dias <= 0) {

                lblResultado.setText(
                    "Digite valores válidos."
                );
                return;
            }

            lblResultado.setText(
                Atv7.calcularViagem(
                    diaria,
                    maxKm,
                    valorKm,
                    distancia,
                    dias
                )
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

        Stage stage = (Stage) txtDiaria.getScene().getWindow();

        stage.setScene(cena);
        stage.setTitle("Exercícios Java");
    }
}