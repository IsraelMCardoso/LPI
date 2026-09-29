package atividades;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import javafx.scene.layout.Region;
import javafx.geometry.Pos;

import atividades.imagem1.Loja;
import atividades.imagem1.Manequim;
import atividades.imagem1.Roupa;
import atividades.imagem2.Bicicleta;
import atividades.imagem2.Ciclista;
import atividades.imagem2.Trilha;
import atividades.imagem3.ColecaoMascaras;
import atividades.imagem3.Expositor;
import atividades.imagem3.Mascara;
import atividades.imagem4.Cabelo;
import atividades.imagem4.Penteado;
import atividades.imagem4.Pessoa;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Atv8Controller {

    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnVoltarImagens;

    @FXML
    private GridPane gridImagens;

    @FXML
    private VBox painelDetalhes;

    @FXML
    private VBox listaClasses;

    @FXML
    private Label lblSelecioneImagem;

    @FXML
    private void initialize() {
        painelDetalhes.setVisible(false);
        painelDetalhes.setManaged(false);
    }

    // =========================================================
    // IMAGEM 1 - LOJA DE ROUPAS
    // =========================================================

    @FXML
    private void abrirImagem1() {
    	
        Loja loja = new Loja(
            "Fashion Store",
            "Rua Principal, 100",
            8
        );
        
        Roupa roupa = new Roupa(
            "Camisa",
            "M",
            79.90
        );

        Manequim manequim = new Manequim(
            1.80,
            "Plástico",
            "Camisa social"
        );

        mostrarImagem(
            "Imagem 1 - Loja de roupas",
            loja,
            roupa,
            manequim
        );
    }

    // =========================================================
    // IMAGEM 2 - CICLISMO
    // =========================================================

    @FXML
    private void abrirImagem2() {

        Ciclista ciclista = new Ciclista(
            "Carlos",
            25,
            20
        );

        Bicicleta bicicleta = new Bicicleta(
            "Caloi",
            "Explorer",
            5
        );

        Trilha trilha = new Trilha(
            "Trilha da Floresta",
            "Terra",
            12.5
        );

        mostrarImagem(
            "Imagem 2 - Ciclismo na trilha",
            ciclista,
            bicicleta,
            trilha
        );
    }

    // =========================================================
    // IMAGEM 3 - MÁSCARAS
    // =========================================================

    @FXML
    private void abrirImagem3() {

        Mascara mascara = new Mascara(
            "Madeira",
            "Marrom",
            35
        );

        ColecaoMascaras colecao = new ColecaoMascaras(
            "Máscaras Africanas",
            5,
            "África"
        );

        Expositor expositor = new Expositor(
            "Madeira",
            1.80,
            5
        );

        mostrarImagem(
            "Imagem 3 - Máscaras",
            mascara,
            colecao,
            expositor
        );
    }

    // =========================================================
    // IMAGEM 4 - CABELOS
    // =========================================================

    @FXML
    private void abrirImagem4() {

        Cabelo cabelo = new Cabelo(
            "Castanho",
            30,
            "Ondulado"
        );

        Penteado penteado = new Penteado(
            "Trança",
            "Trançado",
            3
        );

        Pessoa pessoa = new Pessoa(
            "Ana",
            22,
            "Ondulado"
        );

        mostrarImagem(
            "Imagem 4 - Cabelos e penteados",
            cabelo,
            penteado,
            pessoa
        );
    }

    // =========================================================
    // MOSTRAR AS CLASSES
    // =========================================================

    private void mostrarImagem(String titulo, Object... objetos) {

        listaClasses.getChildren().clear();
        
        listaClasses.setAlignment(Pos.CENTER);
        listaClasses.setSpacing(8);
 

        Label tituloLabel = new Label(titulo);

        tituloLabel.setStyle(
            "-fx-font-size: 20px; -fx-font-weight: bold;"
        );

        listaClasses.getChildren().add(tituloLabel);

        for (Object objeto : objetos) {

            VBox bloco = criarBlocoClasse(objeto);

            listaClasses.getChildren().add(bloco);
        }

        gridImagens.setVisible(false);
        gridImagens.setManaged(false);

        lblSelecioneImagem.setVisible(false);
        lblSelecioneImagem.setManaged(false);

        painelDetalhes.setVisible(true);
        painelDetalhes.setManaged(true);
    }

 // =========================================================
 // CRIAÇÃO DO BLOCO DE CADA CLASSE
 // =========================================================

    private VBox criarBlocoClasse(Object objeto) {

        Class<?> classe = objeto.getClass();

        VBox bloco = new VBox(4);

        bloco.setPrefWidth(650);
        bloco.setMaxWidth(650);
        bloco.setPrefHeight(Region.USE_COMPUTED_SIZE);
        bloco.setMaxHeight(Region.USE_PREF_SIZE);

        bloco.setStyle(
            "-fx-padding: 10; " +
            "-fx-border-color: #d1d5db; " +
            "-fx-border-radius: 6; " +
            "-fx-background-color: white;"
        );

        Label nomeClasse = new Label(
            classe.getSimpleName()
        );

        nomeClasse.setStyle(
            "-fx-font-size: 17px; " +
            "-fx-font-weight: bold;"
        );

        bloco.getChildren().add(nomeClasse);

        Label tituloAtributos = new Label("Atributos:");

        tituloAtributos.setStyle(
            "-fx-font-weight: bold;"
        );

        bloco.getChildren().add(tituloAtributos);

        for (String atributo : obterAtributos(objeto)) {

            Label labelAtributo = new Label(atributo);

            bloco.getChildren().add(labelAtributo);
        }

        Label tituloMetodos = new Label("Métodos:");

        tituloMetodos.setStyle(
            "-fx-font-weight: bold;"
        );

        bloco.getChildren().add(tituloMetodos);

        for (String metodo : obterMetodos(classe)) {

            Label labelMetodo = new Label(metodo);

            bloco.getChildren().add(labelMetodo);
        }

        return bloco;
    }

 // =========================================================
 // OBTÉM OS ATRIBUTOS DO OBJETO
 // =========================================================

 private java.util.List<String> obterAtributos(Object objeto) {

     java.util.List<String> atributos =
         new java.util.ArrayList<>();

     Field[] campos =
         objeto.getClass().getDeclaredFields();

     for (Field campo : campos) {

         try {

             campo.setAccessible(true);

             Object valor = campo.get(objeto);

             atributos.add(
                 campo.getName() + ": " + valor
             );

         } catch (IllegalAccessException e) {

             atributos.add(
                 campo.getName() + ": não disponível"
             );
         }
     }

     return atributos;
 }

 // =========================================================
 // OBTÉM OS MÉTODOS DA CLASSE
 // =========================================================

 private java.util.List<String> obterMetodos(Class<?> classe) {

     java.util.List<String> metodosEncontrados =
         new java.util.ArrayList<>();

     Method[] metodos =
         classe.getDeclaredMethods();

     Arrays.sort(
         metodos,
         Comparator.comparing(Method::getName)
     );

     for (Method metodo : metodos) {

         String nome = metodo.getName();

         // Ignora getters
         if (nome.startsWith("get")) {
             continue;
         }

         // Ignora setters
         if (nome.startsWith("set")) {
             continue;
         }

         // Ignora métodos sintéticos
         if (metodo.isSynthetic()) {
             continue;
         }

         StringBuilder assinatura =
             new StringBuilder();

         assinatura.append(nome);
         assinatura.append("(");

         Class<?>[] parametros =
             metodo.getParameterTypes();

         for (int i = 0; i < parametros.length; i++) {

             assinatura.append(
                 parametros[i].getSimpleName()
             );

             if (i < parametros.length - 1) {
                 assinatura.append(", ");
             }
         }

         assinatura.append(")");

         metodosEncontrados.add(
             assinatura.toString()
         );
     }

     return metodosEncontrados;
 }
    // =========================================================
    // VOLTAR PARA AS IMAGENS
    // =========================================================

    @FXML
    private void voltarParaImagens() {

        painelDetalhes.setVisible(false);
        painelDetalhes.setManaged(false);

        gridImagens.setVisible(true);
        gridImagens.setManaged(true);

        lblSelecioneImagem.setVisible(true);
        lblSelecioneImagem.setManaged(true);
    }

    // =========================================================
    // VOLTAR PARA O MENU
    // =========================================================

    @FXML
    private void voltar() throws IOException {

        FXMLLoader fxml = new FXMLLoader(
            getClass().getResource("/atividades/Menu.fxml")
        );

        Scene cena = new Scene(fxml.load());

        Stage stage =
            (Stage) btnVoltar.getScene().getWindow();

        stage.setScene(cena);
        stage.setTitle("Exercícios Java");
    }
}