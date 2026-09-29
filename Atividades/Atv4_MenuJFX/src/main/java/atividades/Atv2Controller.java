package atividades;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Atv2Controller {

    @FXML
    private TextField txtSenha;

    @FXML
    private Label lblResultado;

    @FXML
    private void verificar() {

        try {
            int senha = Integer.parseInt(txtSenha.getText());

            lblResultado.setText(
                Atv2.verificarSenha(senha)
            );

        } catch (NumberFormatException e) {
            lblResultado.setText(
                "Digite uma senha válida."
            );
        }
    }

    @FXML
    private void voltar() throws IOException {

        FXMLLoader fxml = new FXMLLoader(
            getClass().getResource("/atividades/Menu.fxml")
        );

        Scene cena = new Scene(fxml.load());

        Stage stage = (Stage) txtSenha.getScene().getWindow();

        stage.setScene(cena);
        stage.setTitle("Exercícios Java");
    }
}