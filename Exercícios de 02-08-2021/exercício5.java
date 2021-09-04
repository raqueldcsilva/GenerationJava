package br.com.generation.exercícios1;

import java.util.Scanner;

public class exercício5 {
	public static void main(String[] args) {
		Scanner escreva = new Scanner (System.in);
		
		double nota1, nota2, nota3, n1, n2, n3, media;
		
		System.out.println("Escreva a nota 1: ");
		nota1 = escreva.nextDouble();
		
		System.out.println("Escreva a nota 2: ");
		nota2 = escreva.nextDouble();
		
		System.out.println("Escreva a nota 3: ");
		nota3 = escreva.nextDouble();
		
		n1 = nota1 * 2;
		n2 = nota2 * 3;
		n3 = nota3 * 5;
		
		media = (n1 + n2 + n3) /10;
		System.out.println("A média é: " + media);
		
		escreva.close();
	
	}
		

}
