package br.com.generation.exercícios3;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números digitados */

public class Exercicio05SomadeTodos {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num = -1, soma = 0; 
		
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			soma = soma + num;		
			
		} while (num != 0);
		
	    System.out.println("A soma dos número digitados é: " + soma);
	    ler.close();
	}
	    
}
