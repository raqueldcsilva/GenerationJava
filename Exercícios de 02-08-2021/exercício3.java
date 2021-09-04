package br.com.generation.exercícios1;

import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) {
		Scanner escreva = new Scanner (System.in);
		 double segundos, minutos, horas;
		 
		 System.out.println("Quantos segundos durou o evento: ");
		 segundos = escreva.nextDouble();
				 
				 minutos = segundos / 60;
				 horas = segundos / 3600;
				 
				 System.out.println("O evento durou " + horas + "horas, " + minutos + "minutos e " + segundos + " segundos.");
	     
				 escreva.close();
	}

}
