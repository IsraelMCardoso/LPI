package atividades;

public class Atv3 {
    public static void main(String[] args) {
    	double  arroz = 16.9, feijao = 6.60, oleo = 6.89, acucar = 2.85, total, totalP;
    	double cafe = 23.59, macarrao = 3.29, sal = 3.49, farinha = 5.99, fuba = 4.79, molho = 3.39;
    	int desconto;
    	desconto = 2;
    	totalP = 0;
    	total = 15;
    	total = arroz + feijao + oleo + acucar + cafe + macarrao + sal + farinha + fuba + molho;
    	if (total > 100.00) {
    		totalP = total;
    		total = total - (total/10);
    		desconto = 1;
    	}
    	else {
    		desconto = 0;
    	}
    	if (desconto == 1) {
    		System.out.println("Arroz: 1, Preço:" + arroz);
    		System.out.println("Feijao: 1, Preço:" + feijao);
    		System.out.println("Oleo: 1, Preço:" + oleo);
    		System.out.println("Acucar: 1, Preço:" + acucar);
    		System.out.println("Cafe: 1, Preço:" + cafe);
    		System.out.println("Macarrao: 1, Preço:" + macarrao);
    		System.out.println("Sal: 1, Preço:" + sal);
    		System.out.println("Farinha de trigo: 1, Preço:" + farinha);
    		System.out.println("Fuba: 1, Preço:" + fuba);
    		System.out.println("Molho de tomate: 1, Preço:" + molho);
    		System.out.println("Total = " + totalP);
    		System.out.println("Desconto: 10%");
    		System.out.println("Valor a ser pago =" + total);
    		
    	}
    	else {
    		System.out.println("Arroz: 1, Preço:" + arroz);
    		System.out.println("Feijao: 1, Preço:" + feijao);
    		System.out.println("Oleo: 1, Preço:" + oleo);
    		System.out.println("Acucar: 1, Preço:" + acucar);
    		System.out.println("Cafe: 1, Preço:" + cafe);
    		System.out.println("Macarrao: 1, Preço:" + macarrao);
    		System.out.println("Sal: 1, Preço:" + sal);
    		System.out.println("Farinha de trigo: 1, Preço:" + farinha);
    		System.out.println("Fuba: 1, Preço:" + fuba);
    		System.out.println("Molho de tomate: 1, Preço:" + molho);
    		System.out.println("Total = " + total);
    		System.out.println("Desconto: Mínimo não atingido");
    		System.out.println("Valor a ser pago =" + total);
    	}
   }
}

