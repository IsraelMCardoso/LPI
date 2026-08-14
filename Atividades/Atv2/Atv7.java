package atividades;

import java.util.Scanner;

public class Atv7 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double total = 0.00;
	System.out.println("Digite o valor da diaria");
	double diaria = scanner.nextDouble();
	System.out.println("Digite o valor máximo de km");
	double maxKm = scanner.nextDouble();
	System.out.println("Digite o valor de cada km a mais rodado");
	double valorKm = scanner.nextDouble();
	System.out.println("Digite a distância");
	double distancia = scanner.nextDouble();
	System.out.println("Digite o total de dias usados");
	int dias = scanner.nextInt();
	if (maxKm < distancia) {
		total = (distancia - maxKm) * valorKm + (diaria * dias);
	}
	else {
		total = diaria * dias;
	}
	System.out.println("Valor total da viagem: " + total);
	scanner.close();
	}
}

