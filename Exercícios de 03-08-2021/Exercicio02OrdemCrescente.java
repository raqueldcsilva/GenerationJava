package br.com.generation.exerc�cios2;

import java.util.Scanner;

public class Exercicio02OrdemCrescente {

	public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = ler.nextInt();
		
		if (n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente �: \n" + n1 + n2 + n3);
		} 
		else if (n1<= n3 && n3 <= n2) {
			System.out.println("A ordem crescente �: \n" + n1 + n3 + n2);
		}
		else if (n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente �: " + n2 + n1 + n3);
		}
		else if(n2 <= n3 && n3 <= n1) {
			System.out.println("A ordem crescente �: " + n2 + n3 + n1);
		}
		else if (n3 <= n1 && n1 <= n2) {
			System.out.println("A ordem crescente �: " + n3 + n1 + n2);
		}
		else {
			System.out.println("A ordem crescente �: " + n3 + n2 + n1);
		}
		
		ler.close(); 	
	}

}
