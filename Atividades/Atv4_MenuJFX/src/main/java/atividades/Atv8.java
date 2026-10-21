
package atividades;

import java.util.Scanner;

import atividades.imagem1.Loja;
import atividades.imagem1.Roupa;
import atividades.imagem1.Manequim;

import atividades.imagem2.Ciclista;
import atividades.imagem2.Bicicleta;
import atividades.imagem2.Trilha;

import atividades.imagem3.Mascara;
import atividades.imagem3.ColecaoMascaras;
import atividades.imagem3.Expositor;

import atividades.imagem4.Cabelo;
import atividades.imagem4.Penteado;
import atividades.imagem4.Pessoa;

public class Atv8 {

    private static final Scanner scanner = new Scanner(System.in);

    private static void titulo(String texto) {
        System.out.println("\n========================================");
        System.out.println("  " + texto);
        System.out.println("========================================");
    }

    private static String lerTexto(String pergunta) {
        while (true) {
            System.out.print(pergunta);
            String valor = scanner.nextLine().trim();

            if (!valor.isEmpty()) {
                return valor;
            }

            System.out.println("Campo obrigatório. Tente novamente.");
        }
    }

    private static int lerInt(String pergunta) {
        while (true) {
            System.out.print(pergunta);

            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }

    private static double lerDouble(String pergunta) {
        while (true) {
            System.out.print(pergunta);

            try {
                String valor = scanner.nextLine().trim().replace(',', '.');
                double numero = Double.parseDouble(valor);

                if (Double.isFinite(numero)) {
                    return numero;
                }

                System.out.println("Digite um número válido.");
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido. Exemplo: 12,5");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       ATIVIDADE 8 - DEMONSTRAÇÃO");
        System.out.println("========================================");
        System.out.println("Informe os atributos dos 12 objetos.");
        System.out.println("Utilize vírgula ou ponto nos decimais.");

        // IMAGEM 1 - LOJA DE ROUPAS
        titulo("IMAGEM 1 - LOJA DE ROUPAS");

        Loja loja = new Loja(
                lerTexto("Nome da loja: "),
                lerTexto("Endereço: "),
                lerInt("Quantidade de funcionários: ")
        );

        Roupa roupa = new Roupa(
                lerTexto("\nTipo de roupa: "),
                lerTexto("Tamanho: "),
                lerDouble("Preço (R$): ")
        );

        Manequim manequim = new Manequim(
                lerDouble("\nAltura do manequim (m): "),
                lerTexto("Material: "),
                lerTexto("Roupa exposta: ")
        );

        // IMAGEM 2 - CICLISMO
        titulo("IMAGEM 2 - CICLISMO");

        Ciclista ciclista = new Ciclista(
                lerTexto("Nome do ciclista: "),
                lerInt("Idade: "),
                lerDouble("Velocidade inicial: ")
        );

        Bicicleta bicicleta = new Bicicleta(
                lerTexto("\nMarca da bicicleta: "),
                lerTexto("Modelo: "),
                lerInt("Marcha atual: ")
        );

        Trilha trilha = new Trilha(
                lerTexto("\nNome da trilha: "),
                lerTexto("Tipo de piso: "),
                lerDouble("Extensão da trilha (km): ")
        );

        // IMAGEM 3 - MÁSCARAS
        titulo("IMAGEM 3 - MÁSCARAS");

        Mascara mascara = new Mascara(
                lerTexto("Material da máscara: "),
                lerTexto("Cor: "),
                lerDouble("Altura da máscara: ")
        );

        ColecaoMascaras colecao = new ColecaoMascaras(
                lerTexto("\nNome da coleção: "),
                lerInt("Quantidade de máscaras: "),
                lerTexto("Origem da coleção: ")
        );

        Expositor expositor = new Expositor(
                lerTexto("\nMaterial do expositor: "),
                lerDouble("Altura do expositor (m): "),
                lerInt("Quantidade de máscaras no expositor: ")
        );

        // IMAGEM 4 - CABELOS
        titulo("IMAGEM 4 - CABELOS");

        Cabelo cabelo = new Cabelo(
                lerTexto("Cor do cabelo: "),
                lerDouble("Comprimento do cabelo (cm): "),
                lerTexto("Textura do cabelo: ")
        );

        Penteado penteado = new Penteado(
                lerTexto("\nNome do penteado: "),
                lerTexto("Estilo: "),
                lerInt("Nível de dificuldade: ")
        );

        Pessoa pessoa = new Pessoa(
                lerTexto("\nNome da pessoa: "),
                lerInt("Idade: "),
                lerTexto("Tipo de cabelo: ")
        );

        // EXECUÇÃO DOS MÉTODOS
        titulo("DEMONSTRAÇÃO DOS MÉTODOS");

        titulo("LOJA DE ROUPAS");
        loja.abrirLoja();
        loja.mostrarProdutos();

        roupa.vestir();
        roupa.exibirPreco();
        roupa.alterarPreco(roupa.getPreco() * 0.90);
        System.out.println("Preço após desconto de 10%:");
        roupa.exibirPreco();

        manequim.vestirRoupa();
        manequim.trocarRoupa("Jaqueta");
        manequim.exibirRoupa();

        loja.fecharLoja();

        titulo("CICLISMO");
        ciclista.pedalar();
        ciclista.acelerar();
        ciclista.frear();

        bicicleta.pedalar();
        bicicleta.trocarMarcha(7);
        bicicleta.frear();

        trilha.iniciarPercurso();
        trilha.mostrarInformacoes();
        trilha.finalizarPercurso();

        titulo("MÁSCARAS");
        mascara.exibirMascara();
        mascara.alterarCor("Preta");

        double valor = mascara.calcularValor();
        System.out.printf("Valor calculado: R$ %.2f%n", valor);

        colecao.mostrarColecao();
        colecao.adicionarMascara();
        colecao.removerMascara();

        expositor.mostrarMascaras();
        expositor.adicionarMascara();
        expositor.removerMascara();

        titulo("CABELOS");
        cabelo.lavar();
        cabelo.pentear();
        cabelo.cortar();

        penteado.criar();
        penteado.mostrarPenteado();
        penteado.alterarEstilo("Trança lateral");

        pessoa.mostrarInformacoes();
        pessoa.escolherPenteado();
        pessoa.mudarCabelo("Cacheado");

        titulo("APRESENTAÇÃO CONCLUÍDA");
        System.out.println("Todos os objetos foram demonstrados.");

        scanner.close();
    }
}
