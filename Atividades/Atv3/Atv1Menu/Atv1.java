package atividades;

import java.util.Scanner;

public class Atv1 {

    public static void executar(Scanner scanner) {

        System.out.println("Digite o primeiro número:");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = scanner.nextInt();

        if (n2 == 0) {
            System.out.println("Não é possível verificar múltiplo de zero.");
        } else if (n1 % n2 == 0) {
            System.out.println(n1 + " é múltiplo de " + n2);
        } else {
            System.out.println(n1 + " não é múltiplo de " + n2);
        }
    }
}