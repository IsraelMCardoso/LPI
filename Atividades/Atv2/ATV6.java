package atividades;

import java.util.Scanner;
public class ATV6 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double total = 0.00;
	System.out.println("Digite a distancia");
	double distancia = scanner.nextDouble();
	System.out.println("Digite o valor do combustível");
	double pCombustivel = scanner.nextDouble();
	if (distancia > 500.00) {
		total = (distancia /12) * pCombustivel;
		total = total - ((total/10)/2);
	}
	else {
		total = (distancia/12) * pCombustivel;
	}
	System.out.println("Valor total da viagem: " + total);
	scanner.close();
	}
}
