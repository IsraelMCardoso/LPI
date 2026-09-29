package atividades;

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

    public static void main(String[] args) {

        System.out.println("===== IMAGEM 1 - LOJA DE ROUPAS =====");

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

        loja.abrirLoja();
        loja.mostrarProdutos();

        roupa.vestir();
        roupa.exibirPreco();
        roupa.alterarPreco(69.90);

        manequim.vestirRoupa();
        manequim.trocarRoupa("Jaqueta");
        manequim.exibirRoupa();

        loja.fecharLoja();


        System.out.println("\n===== IMAGEM 2 - CICLISMO =====");

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

        ciclista.pedalar();
        ciclista.acelerar();
        ciclista.frear();

        bicicleta.pedalar();
        bicicleta.trocarMarcha(7);
        bicicleta.frear();

        trilha.iniciarPercurso();
        trilha.mostrarInformacoes();
        trilha.finalizarPercurso();


        System.out.println("\n===== IMAGEM 3 - MÁSCARAS =====");

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

        mascara.exibirMascara();
        mascara.alterarCor("Preta");

        double valor = mascara.calcularValor();
        System.out.println("Valor calculado: R$ " + valor);

        colecao.mostrarColecao();
        colecao.adicionarMascara();
        colecao.removerMascara();

        expositor.mostrarMascaras();
        expositor.adicionarMascara();
        expositor.removerMascara();


        System.out.println("\n===== IMAGEM 4 - CABELOS =====");

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

        cabelo.lavar();
        cabelo.pentear();
        cabelo.cortar();

        penteado.criar();
        penteado.mostrarPenteado();
        penteado.alterarEstilo("Trança lateral");

        pessoa.mostrarInformacoes();
        pessoa.escolherPenteado();
        pessoa.mudarCabelo("Cacheado");


        System.out.println("\n===== TESTES CONCLUÍDOS =====");
    }
}