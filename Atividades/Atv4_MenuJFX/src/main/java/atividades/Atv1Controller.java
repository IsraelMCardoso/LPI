package atividades;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Atv1Controller {

    @FXML
    private TextField txtN1;

    @FXML
    private TextField txtN2;

    @FXML
    private Label lblResultado;

    @FXML
    private void calcular() {

        try {
            int n1 = Integer.parseInt(txtN1.getText());
            int n2 = Integer.parseInt(txtN2.getText());

            lblResultado.setText(Atv1.verificarMultiplo(n1, n2));

        } catch (NumberFormatException e) {
            lblResultado.setText("Digite números inteiros válidos.");
        }
    }

    @FXML
    private void voltar() throws IOException {

        FXMLLoader fxml = new FXMLLoader(
                getClass().getResource("/atividades/Menu.fxml")
        );

        Scene cena = new Scene(fxml.load());

        Stage stage = (Stage) txtN1.getScene().getWindow();

        stage.setScene(cena);
        stage.setTitle("Exercícios Java");
    }
}