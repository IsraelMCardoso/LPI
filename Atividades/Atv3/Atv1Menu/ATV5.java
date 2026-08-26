package atividades;

import java.util.Scanner;

public class ATV5 {

    public static void executar(Scanner scanner) {

        System.out.print("Digite a quantidade de camelos: ");
        int camelos = scanner.nextInt();

        int camelosParaDivisao = camelos + 1;

        int irmao1 = camelosParaDivisao / 2;
        int irmao2 = camelosParaDivisao / 3;
        int irmao3 = camelosParaDivisao / 9;

        int totalDistribuido = irmao1 + irmao2 + irmao3;
        int sobra = camelosParaDivisao - totalDistribuido;

        System.out.println("\nDivisão:");
        System.out.println("Primeiro irmão: " + irmao1 + " camelos");
        System.out.println("Segundo irmão: " + irmao2 + " camelos");
        System.out.println("Terceiro irmão: " + irmao3 + " camelos");

        System.out.println("\nTotal distribuído: " + totalDistribuido);
        System.out.println("Camelo que sobra: " + sobra);
    }
}