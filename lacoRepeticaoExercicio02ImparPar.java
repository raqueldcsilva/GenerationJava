package br.com.generation.exerc�cios3;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares

public class exercicio02ImparPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			int num, i;
			int par = 0, impar = 0;
			
			for (i = 1; i <= 10 ; i++ ) {
				System.out.println("Digite um n�mero: ");
				num = ler.nextInt();
				
				if (num % 2 == 0) {
					par = par + 1;
					System.out.println("Esse n�mero � par!");
				} 
				else {
					impar = impar + 1;
					System.out.println("Esse n�mero � impar!");
				}
			} ler.close();
			
			System.out.println("Dos n�meros digitados " + par + " s�o pares e " + impar + " s�o impares.");
		}
	       
		
	}

