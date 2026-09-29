package atividades;

public class Atv3 {

    public static String calcularCompra() {

        double arroz = 16.90;
        double feijao = 6.60;
        double oleo = 6.89;
        double acucar = 2.85;
        double cafe = 23.59;
        double macarrao = 3.29;
        double sal = 3.49;
        double farinha = 5.99;
        double fuba = 4.79;
        double molho = 3.39;

        double total = arroz + feijao + oleo + acucar + cafe
                + macarrao + sal + farinha + fuba + molho;

        double valorFinal;
        String desconto;

        if (total > 100.00) {
            double valorDesconto = total * 0.10;
            valorFinal = total - valorDesconto;
            desconto = "10%";
        } else {
            valorFinal = total;
            desconto = "Mínimo não atingido";
        }

        return String.format(
                "Arroz: R$ %.2f%n"
                + "Feijão: R$ %.2f%n"
                + "Óleo: R$ %.2f%n"
                + "Açúcar: R$ %.2f%n"
                + "Café: R$ %.2f%n"
                + "Macarrão: R$ %.2f%n"
                + "Sal: R$ %.2f%n"
                + "Farinha de trigo: R$ %.2f%n"
                + "Fubá: R$ %.2f%n"
                + "Molho de tomate: R$ %.2f%n%n"
                + "Total: R$ %.2f%n"
                + "Desconto: %s%n"
                + "Valor a pagar: R$ %.2f",
                arroz, feijao, oleo, acucar, cafe,
                macarrao, sal, farinha, fuba, molho,
                total, desconto, valorFinal
        );
    }
}