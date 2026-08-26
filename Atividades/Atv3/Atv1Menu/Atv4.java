package atividades;

import java.util.Scanner;

public class Atv4 {

    public static void executar(Scanner scanner) {

        int frio = 0;
        int calor = 0;

        System.out.println("Digite a quantidade de dias:");
        int dias = scanner.nextInt();

        while (dias <= 0) {
            System.out.println("É preciso informar no mínimo um dia.");
            System.out.println("Digite a quantidade de dias:");
            dias = scanner.nextInt();
        }

        for (int i = 1; i <= dias; i++) {

            System.out.println("Digite a temperatura do dia " + i + ":");
            double temperatura = scanner.nextDouble();

            if (temperatura < 18.0) {
                System.out.println("Frio");
                frio++;
            } else {
                System.out.println("Temperatura agradável");
                calor++;
            }
        }

        System.out.println("----------------------------");
        System.out.println("Dias frios: " + frio);
        System.out.println("Dias agradáveis: " + calor);

        if (frio > calor) {
            System.out.println("A temperatura em SJC é fria.");
        } else {
            System.out.println("A temperatura em SJC é agradável.");
        }
    }
}