package atividades;

public class Atv3 {

    public static void executar() {

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

        double total;

        total = arroz + feijao + oleo + acucar + cafe
                + macarrao + sal + farinha + fuba + molho;

        System.out.println("Arroz: 1, Preço: " + arroz);
        System.out.println("Feijão: 1, Preço: " + feijao);
        System.out.println("Óleo: 1, Preço: " + oleo);
        System.out.println("Açúcar: 1, Preço: " + acucar);
        System.out.println("Café: 1, Preço: " + cafe);
        System.out.println("Macarrão: 1, Preço: " + macarrao);
        System.out.println("Sal: 1, Preço: " + sal);
        System.out.println("Farinha de trigo: 1, Preço: " + farinha);
        System.out.println("Fubá: 1, Preço: " + fuba);
        System.out.println("Molho de tomate: 1, Preço: " + molho);

        System.out.println("----------------------------");
        System.out.println("Total = " + total);

        if (total > 100.00) {
            double desconto = total * 0.10;
            double valorFinal = total - desconto;

            System.out.println("Desconto: 10%");
            System.out.println("Valor a ser pago = " + valorFinal);
        } else {
            System.out.println("Desconto: Mínimo não atingido");
            System.out.println("Valor a ser pago = " + total);
        }
    }
}