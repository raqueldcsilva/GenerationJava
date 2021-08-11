package br.com.generation.exercícios1;

import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		Scanner escreva = new Scanner (System.in);
		int anos, meses, dias, resto, resto1;
		
		System.out.println("Quantos dias você têm: ");
		dias = escreva.nextInt();
		
		anos = dias/365;
		resto= dias % 365;
		meses= resto/30;
		resto1 = resto % 30;
		
		System.out.println("Você tem " + anos + " anos, " + meses + " meses " + "e " + resto1 + " dias.");
		
		escreva.close();

	}

}
