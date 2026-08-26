package atividades;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=================================");
            System.out.println("       MENU - EXERCÍCIOS JAVA");
            System.out.println("=================================");
            System.out.println("1 - Exercício 1 - Múltiplos");
            System.out.println("2 - Exercício 2 - Senha");
            System.out.println("3 - Exercício 3 - Compras");
            System.out.println("4 - Exercício 4 - Temperaturas");
            System.out.println("5 - Exercício 5 - Camelos");
            System.out.println("6 - Exercício 6 - Viagem");
            System.out.println("7 - Exercício 7 - Aluguel");
            System.out.println("0 - Sair");
            System.out.println("=================================");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            System.out.println();

            switch (opcao) {

                case 1:
                    Atv1.executar(scanner);
                    break;

                case 2:
                    Atv2.executar(scanner);
                    break;

                case 3:
                    Atv3.executar();
                    break;

                case 4:
                    Atv4.executar(scanner);
                    break;

                case 5:
                    ATV5.executar(scanner);
                    break;

                case 6:
                    ATV6.executar(scanner);
                    break;

                case 7:
                    Atv7.executar(scanner);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            if (opcao != 0) {
                System.out.println("\nPressione ENTER para voltar ao menu...");
                scanner.nextLine();
                scanner.nextLine();
            }

        } while (opcao != 0);

        scanner.close();
    }
}