package atividades;

import java.util.Scanner;

public class Atv2 {

    public static void executar(Scanner scanner) {

        System.out.println("Digite a senha:");
        int senha = scanner.nextInt();

        if (senha == 1234) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
    }
}