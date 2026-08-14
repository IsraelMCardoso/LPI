package atividades;
import java.util.Scanner;

public class ATV5 {

	    public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite a quantidade de camelos: ");
	        int camelos = entrada.nextInt();

	        double parte1 = 1.0 / 2.0;
	        double parte2 = 1.0 / 3.0;
	        double parte3 = 1.0 / 9.0;

	       
	        int camelosParaDivisao = camelos + 1;

	        int irmao1 = (int) (camelosParaDivisao * parte1);
	        int irmao2 = (int) (camelosParaDivisao * parte2);
	        int irmao3 = (int) (camelosParaDivisao * parte3);

	        System.out.println("Divisão:");
	        System.out.println("Primeiro irmão: " + irmao1 + " camelos");
	        System.out.println("Segundo irmão: " + irmao2 + " camelos");
	        System.out.println("Terceiro irmão: " + irmao3 + " camelos");

	        System.out.println("\nTotal distribuído: "
	                + (irmao1 + irmao2 + irmao3));

	        System.out.println("Camelo que sobra: "
	                + (camelosParaDivisao - (irmao1 + irmao2 + irmao3)));

	        entrada.close();
	    }
	}

