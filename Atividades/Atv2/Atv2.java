package atividades;

import java.util.Scanner;
public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Digite a senha");
       int n1 = scanner.nextInt();
       if (n1 == 1234) {
           System.out.println("Acesso permitido");
       }
       else{
           System.out.println("Acesso negado");
       }
       scanner.close();
   }
}
