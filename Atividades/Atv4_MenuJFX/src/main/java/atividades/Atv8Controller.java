package atividades;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Atv8Controller {

    @FXML private Button btnVoltar;
    @FXML private Button btnVoltarImagens;
    @FXML private GridPane gridImagens;
    @FXML private VBox painelDetalhes;
    @FXML private VBox listaClasses;
    @FXML private Label lblSelecioneImagem;

    private final List<TextField> campos = new ArrayList<>();
    private final List<ClasseFormulario> classesFormulario = new ArrayList<>();
    private String tituloAtual;

    @FXML
    private void initialize() {
        painelDetalhes.setVisible(false);
        painelDetalhes.setManaged(false);
        btnVoltarImagens.setText("Voltar para imagens");

        // Mantém formulários e resultados acessíveis mesmo quando ultrapassam a altura da janela.
        int indiceLista = painelDetalhes.getChildren().indexOf(listaClasses);
        painelDetalhes.getChildren().remove(listaClasses);
        ScrollPane rolagem = new ScrollPane(listaClasses);
        rolagem.setFitToWidth(true);
        rolagem.setPrefViewportHeight(430);
        rolagem.setPrefWidth(680);
        rolagem.setStyle("-fx-background-color: transparent; -fx-background: transparent;");
        painelDetalhes.getChildren().add(Math.max(0, indiceLista), rolagem);
        VBox.setVgrow(rolagem, Priority.ALWAYS);
        painelDetalhes.setPrefHeight(500);
    }

    @FXML
    private void abrirImagem1() {
        abrirFormulario("Imagem 1 - Loja de roupas",
            new ClasseFormulario(Loja.class, "Nome", "Endereço", "Quantidade de funcionários"),
            new ClasseFormulario(Roupa.class, "Tipo", "Tamanho", "Preço"),
            new ClasseFormulario(Manequim.class, "Altura", "Material", "Roupa exposta"));
    }

    @FXML
    private void abrirImagem2() {
        abrirFormulario("Imagem 2 - Ciclismo na trilha",
            new ClasseFormulario(Ciclista.class, "Nome", "Idade", "Velocidade"),
            new ClasseFormulario(Bicicleta.class, "Marca", "Modelo", "Marcha atual"),
            new ClasseFormulario(Trilha.class, "Nome", "Tipo de piso", "Extensão"));
    }

    @FXML
    private void abrirImagem3() {
        abrirFormulario("Imagem 3 - Máscaras",
            new ClasseFormulario(Mascara.class, "Material", "Cor", "Altura"),
            new ClasseFormulario(ColecaoMascaras.class, "Nome", "Quantidade", "Origem"),
            new ClasseFormulario(Expositor.class, "Material", "Altura", "Quantidade de máscaras"));
    }

    @FXML
    private void abrirImagem4() {
        abrirFormulario("Imagem 4 - Cabelos e penteados",
            new ClasseFormulario(Cabelo.class, "Cor", "Comprimento", "Textura"),
            new ClasseFormulario(Penteado.class, "Nome", "Estilo", "Nível de dificuldade"),
            new ClasseFormulario(Pessoa.class, "Nome", "Idade", "Tipo de cabelo"));
    }

    private void abrirFormulario(String titulo, ClasseFormulario... classes) {
        tituloAtual = titulo;
        classesFormulario.clear();
        classesFormulario.addAll(Arrays.asList(classes));
        campos.clear();
        listaClasses.getChildren().clear();
        listaClasses.setAlignment(Pos.CENTER_LEFT);
        listaClasses.setSpacing(12);

        Label cabecalho = new Label(titulo);
        cabecalho.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        listaClasses.getChildren().add(cabecalho);

        for (ClasseFormulario classe : classesFormulario) {
            VBox grupo = new VBox(6);
            grupo.setStyle("-fx-padding: 12; -fx-border-color: #d1d5db; -fx-border-radius: 8; -fx-background-color: white; -fx-background-radius: 8;");
            Label nomeClasse = new Label(classe.tipo.getSimpleName());
            nomeClasse.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
            grupo.getChildren().add(nomeClasse);

            for (String rotulo : classe.rotulos) {
                Label label = new Label(rotulo + ":");
                TextField campo = new TextField();
                campo.setPromptText("Digite " + rotulo.toLowerCase());
                campo.setMaxWidth(Double.MAX_VALUE);
                campos.add(campo);
                grupo.getChildren().addAll(label, campo);
            }
            listaClasses.getChildren().add(grupo);
        }

        Button confirmar = new Button("Criar objetos e mostrar resultado");
        confirmar.setOnAction(event -> criarObjetos());
        HBox botoes = new HBox(confirmar);
        botoes.setAlignment(Pos.CENTER);
        listaClasses.getChildren().add(botoes);

        gridImagens.setVisible(false);
        gridImagens.setManaged(false);
        lblSelecioneImagem.setVisible(false);
        lblSelecioneImagem.setManaged(false);
        painelDetalhes.setVisible(true);
        painelDetalhes.setManaged(true);
    }

    private void criarObjetos() {
        try {
            List<Object> objetos = new ArrayList<>();
            int indice = 0;

            for (ClasseFormulario especificacao : classesFormulario) {
                Constructor<?> construtor = encontrarConstrutor(especificacao.tipo);
                Class<?>[] tipos = construtor.getParameterTypes();
                Object[] valores = new Object[tipos.length];

                if (tipos.length != especificacao.rotulos.length) {
                    throw new IllegalStateException("A classe " + especificacao.tipo.getSimpleName()
                        + " não possui um construtor com os 3 atributos esperados.");
                }

                for (int i = 0; i < tipos.length; i++) {
                    String texto = campos.get(indice).getText().trim();
                    String rotulo = especificacao.rotulos[i];
                    if (texto.isEmpty()) {
                        campos.get(indice).requestFocus();
                        throw new IllegalArgumentException("Preencha o campo: " + rotulo + ".");
                    }
                    valores[i] = converter(texto, tipos[i], rotulo);
                    indice++;
                }

                objetos.add(construtor.newInstance(valores));
            }

            mostrarResultado(tituloAtual, objetos.toArray());
        } catch (NumberFormatException e) {
            alerta("Valor inválido", "Confira os campos numéricos. Use números válidos; para decimais, pode usar vírgula ou ponto.");
        } catch (IllegalArgumentException e) {
            alerta("Verifique o formulário", e.getMessage());
        } catch (ReflectiveOperationException | IllegalStateException e) {
            alerta("Não foi possível criar os objetos", e.getMessage() == null ? "Confira os construtores das classes." : e.getMessage());
        }
    }

    private Constructor<?> encontrarConstrutor(Class<?> tipo) throws NoSuchMethodException {
        for (Constructor<?> construtor : tipo.getDeclaredConstructors()) {
            if (construtor.getParameterCount() == 3) {
                construtor.setAccessible(true);
                return construtor;
            }
        }
        throw new NoSuchMethodException("Construtor com 3 parâmetros não encontrado em " + tipo.getSimpleName());
    }

    private Object converter(String texto, Class<?> tipo, String rotulo) {
        String normalizado = texto.replace(',', '.');
        if (tipo == String.class) return texto;
        if (tipo == int.class || tipo == Integer.class) return Integer.parseInt(normalizado);
        if (tipo == double.class || tipo == Double.class) return Double.parseDouble(normalizado);
        if (tipo == long.class || tipo == Long.class) return Long.parseLong(normalizado);
        if (tipo == float.class || tipo == Float.class) return Float.parseFloat(normalizado);
        throw new IllegalArgumentException("Tipo não suportado no campo " + rotulo + ": " + tipo.getSimpleName());
    }

    private void mostrarResultado(String titulo, Object... objetos) {
        listaClasses.getChildren().clear();
        listaClasses.setAlignment(Pos.CENTER);
        listaClasses.setSpacing(8);

        Label tituloLabel = new Label(titulo + " — objetos criados");
        tituloLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        listaClasses.getChildren().add(tituloLabel);

        for (Object objeto : objetos) {
            listaClasses.getChildren().add(criarBlocoClasse(objeto));
        }

        Button editar = new Button("Voltar ao formulário");
        editar.setOnAction(event -> abrirFormulario(tituloAtual, classesFormulario.toArray(new ClasseFormulario[0])));
        HBox linha = new HBox(editar);
        linha.setAlignment(Pos.CENTER);
        listaClasses.getChildren().add(linha);
    }

    private VBox criarBlocoClasse(Object objeto) {
        Class<?> classe = objeto.getClass();
        VBox bloco = new VBox(4);
        bloco.setMaxWidth(650);
        bloco.setStyle("-fx-padding: 10; -fx-border-color: #d1d5db; -fx-border-radius: 6; -fx-background-color: white; -fx-background-radius: 6;");

        Label nomeClasse = new Label(classe.getSimpleName());
        nomeClasse.setStyle("-fx-font-size: 17px; -fx-font-weight: bold;");
        bloco.getChildren().add(nomeClasse);

        Label tituloAtributos = new Label("Atributos:");
        tituloAtributos.setStyle("-fx-font-weight: bold;");
        bloco.getChildren().add(tituloAtributos);

        for (String atributo : obterAtributos(objeto)) {
            bloco.getChildren().add(new Label(atributo));
        }

        Label tituloMetodos = new Label("Métodos:");
        tituloMetodos.setStyle("-fx-font-weight: bold;");
        bloco.getChildren().add(tituloMetodos);

        for (String metodo : obterMetodos(classe)) {
            bloco.getChildren().add(new Label(metodo));
        }
        return bloco;
    }

    private List<String> obterAtributos(Object objeto) {
        List<String> atributos = new ArrayList<>();
        Field[] camposObjeto = objeto.getClass().getDeclaredFields();
        for (Field campo : camposObjeto) {
            try {
                campo.setAccessible(true);
                atributos.add(campo.getName() + ": " + campo.get(objeto));
            } catch (IllegalAccessException e) {
                atributos.add(campo.getName() + ": não disponível");
            }
        }
        return atributos;
    }

    private List<String> obterMetodos(Class<?> classe) {
        List<String> metodosEncontrados = new ArrayList<>();
        Method[] metodos = classe.getDeclaredMethods();
        Arrays.sort(metodos, Comparator.comparing(Method::getName));

        for (Method metodo : metodos) {
            String nome = metodo.getName();
            if (nome.startsWith("get") || nome.startsWith("set") || metodo.isSynthetic()) continue;

            StringBuilder assinatura = new StringBuilder(nome).append("(");
            Class<?>[] parametros = metodo.getParameterTypes();
            for (int i = 0; i < parametros.length; i++) {
                assinatura.append(parametros[i].getSimpleName());
                if (i < parametros.length - 1) assinatura.append(", ");
            }
            assinatura.append(")");
            metodosEncontrados.add(assinatura.toString());
        }
        return metodosEncontrados;
    }

    private void alerta(String titulo, String mensagem) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }

    @FXML
    private void voltarParaImagens() {
        painelDetalhes.setVisible(false);
        painelDetalhes.setManaged(false);
        gridImagens.setVisible(true);
        gridImagens.setManaged(true);
        lblSelecioneImagem.setVisible(true);
        lblSelecioneImagem.setManaged(true);
    }

    @FXML
    private void voltar() throws IOException {
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("/atividades/Menu.fxml"));
        Scene cena = new Scene(fxml.load());
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.setScene(cena);
        stage.setTitle("Exercícios Java");
    }

    private static class ClasseFormulario {
        private final Class<?> tipo;
        private final String[] rotulos;

        private ClasseFormulario(Class<?> tipo, String... rotulos) {
            this.tipo = tipo;
            this.rotulos = rotulos;
        }
    }
}
