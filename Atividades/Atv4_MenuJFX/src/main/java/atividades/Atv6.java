package atividades;

public class Atv6 {

    public static String calcularViagem(double distancia, double precoCombustivel) {

        double total = (distancia / 12) * precoCombustivel;

        String desconto;

        if (distancia > 500.00) {
            total = total - (total * 0.05);
            desconto = "5%";
        } else {
            desconto = "Nenhum";
        }

        return "Distância: " + distancia + " km\n"
                + "Preço do combustível: R$ " + precoCombustivel + "\n"
                + "Desconto aplicado: " + desconto + "\n"
                + "Valor total da viagem: R$ " + total;
    }
}