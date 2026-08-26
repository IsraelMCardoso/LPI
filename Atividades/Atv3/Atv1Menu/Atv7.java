package atividades;

import java.util.Scanner;

public class Atv7 {

    public static void executar(Scanner scanner) {

        System.out.println("Digite o valor da diária:");
        double diaria = scanner.nextDouble();

        System.out.println("Digite o valor máximo de km:");
        double maxKm = scanner.nextDouble();

        System.out.println("Digite o valor de cada km a mais rodado:");
        double valorKm = scanner.nextDouble();

        System.out.println("Digite a distância:");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o total de dias usados:");
        int dias = scanner.nextInt();

        double total = diaria * dias;

        if (distancia > maxKm) {
            double kmExcedido = distancia - maxKm;
            total += kmExcedido * valorKm;
        }

        System.out.println("Valor total da viagem: " + total);
    }
}