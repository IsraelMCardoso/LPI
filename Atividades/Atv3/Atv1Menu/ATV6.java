package atividades;

import java.util.Scanner;

public class ATV6 {

    public static void executar(Scanner scanner) {

        System.out.println("Digite a distância:");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o valor do combustível:");
        double precoCombustivel = scanner.nextDouble();

        double total = (distancia / 12) * precoCombustivel;

        if (distancia > 500.00) {
            total = total - (total * 0.05);
            System.out.println("Desconto aplicado: 5%");
        }

        System.out.println("Valor total da viagem: " + total);
    }
}