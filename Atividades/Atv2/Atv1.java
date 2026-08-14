package atividades;

import java.util.Scanner;
public class Atv1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite o primeiro número");
       int n1 = scanner.nextInt();
       System.out.println("Digite o segundo número");
       int n2 = scanner.nextInt();
       if (n1 % n2 > 0) {
           System.out.println("Não é multiplo");
       }
       else{
           System.out.println("È multiplo");
       }
       scanner.close();
   }
}

