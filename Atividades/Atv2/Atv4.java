package atividades;

import java.util.Scanner;
public class Atv4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int frio = 0, calor = 0;
	       // Basic math operations
	       System.out.println("Digite a quantia de dias");
	       int dias= scanner.nextInt();
	       while (dias <= 0)  {
	           System.out.println("É preciso falar no mínimo um dia");
	           System.out.println("Digite a quantia de dias");
		       dias= scanner.nextInt();
	       }
	    	   for (int i = 0; i < dias; i++) {
	    		   System.out.println("Digite a temperatura do mês: " + i);
	    	       double tempU= scanner.nextDouble();
	    	       if (tempU < 18.0) {
	    	    	   System.out.println("Frio");
	    	    	   frio = frio + 1;
	    	       }
	    	       else {
	    	    	   System.out.println("Temperatura Agradável");
	    	    	   calor = calor + 1;
	    	       }
	    	   }
	    	   if (frio > calor) {
	    		   System.out.println("A temperatura em SJC é fria");
	    	   }
	    	   else {
	    		   System.out.println("A temperatura em SJC é agradável");
	    	   }
	 	      scanner.close();		   
	       }
}
