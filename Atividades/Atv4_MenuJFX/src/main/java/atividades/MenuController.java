package atividades;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private Button btnSair;

    @FXML
    private void abrirAtividade(ActionEvent event) throws IOException {

        Button botao = (Button) event.getSource();

        String texto = botao.getText();

        String numero = texto.replaceAll("[^0-9]", "");

        FXMLLoader fxml = new FXMLLoader(
                getClass().getResource("/atividades/Atv" + numero + ".fxml")
        );

        Scene cena = new Scene(fxml.load());

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(cena);
        stage.setTitle("Atividade " + numero);
    }

    @FXML
    private void sair() {
        Stage stage = (Stage) btnSair.getScene().getWindow();
        stage.close();
    }
}