package br.com.generation.exercícios2;

import java.util.Scanner;

public class Exercicio01MaiorNumero {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o 1º número: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o 2º número: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o 3º número: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > n3  ) {
			System.out.println("O número " + n1 + " é o maior.");
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O número " + n2 + " é o maior.");
		}
		else {
			System.out.println("O número " + n3 + " é o maior.");
		}
		
		ler.close();
	}

}
