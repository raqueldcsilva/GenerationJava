package br.com.generation.exerc�cios2;

import java.util.Scanner;

public class Exercicio01MaiorNumero {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > n3  ) {
			System.out.println("O n�mero " + n1 + " � o maior.");
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O n�mero " + n2 + " � o maior.");
		}
		else {
			System.out.println("O n�mero " + n3 + " � o maior.");
		}
		
		ler.close();
	}

}
