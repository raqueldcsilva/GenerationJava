package br.com.generation.exercícios3;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares

public class exercicio02ImparPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			int num, i;
			int par = 0, impar = 0;
			
			for (i = 1; i <= 10 ; i++ ) {
				System.out.println("Digite um número: ");
				num = ler.nextInt();
				
				if (num % 2 == 0) {
					par = par + 1;
					System.out.println("Esse número é par!");
				} 
				else {
					impar = impar + 1;
					System.out.println("Esse número é impar!");
				}
			} ler.close();
			
			System.out.println("Dos números digitados " + par + " são pares e " + impar + " são impares.");
		}
	       
		
	}

