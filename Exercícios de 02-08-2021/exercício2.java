package br.com.generation.exerc�cios1;

import java.util.Scanner;

public class exerc�cio2 {

	public static void main(String[] args) {
		Scanner escreva = new Scanner (System.in);
		int anos, meses, dias, resto, resto1;
		
		System.out.println("Quantos dias voc� t�m: ");
		dias = escreva.nextInt();
		
		anos = dias/365;
		resto= dias % 365;
		meses= resto/30;
		resto1 = resto % 30;
		
		System.out.println("Voc� tem " + anos + " anos, " + meses + " meses " + "e " + resto1 + " dias.");
		
		escreva.close();

	}

}
