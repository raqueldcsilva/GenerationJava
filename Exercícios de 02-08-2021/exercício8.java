package br.com.generation.exerc�cios1;

import java.util.Scanner;

public class exerc�cio8 {

	public static void main(String[] args) {
		Scanner escreva = new Scanner (System.in);
		double consumidor, valorFabrica, imposto, distribuidor;
		
		System.out.println("qual o custo do carro novo? ");
		valorFabrica = escreva.nextDouble();
		
		distribuidor = valorFabrica * 0.28;
		imposto = valorFabrica * 0.45;
		
		consumidor = valorFabrica + imposto + distribuidor;
		
		System.out.println("Custo ao consumidor �: " + consumidor);
		
		escreva.close();		

	}

}
