package br.com.generation.exerc�cios2;

import java.util.Scanner;

public class Exercicio04ImparPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double num, raiz, quadrado;
		
		System.out.println("Digite um n�mero: ");
		num = ler.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println("Esse n�mero � par");
			raiz = Math.sqrt(num);
			System.out.println("A raiz quadrada de " + num + "�: " + raiz);
		}
		
		else {
			System.out.println("Esse n�mero � impar");
			quadrado = Math.pow(num, 2.0);
			System.out.println("O n�mero " + num + " elevado ao quadrado �: " + quadrado);
		}
		
	    ler.close();

	}

}
