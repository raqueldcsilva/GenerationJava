package br.com.generation.exercícios1;

import java.util.Scanner;

public class exercício1 {
	public static void main (String args[]) {
		Scanner escreva = new Scanner (System.in);
		int anos, meses, dias, tanos, tmeses, tdias;
		
		System.out.println("Diga quantos anos você tem: ");
		anos = escreva.nextInt();
		
		System.out.println("Diga quantos meses você tem: ");
		meses = escreva.nextInt();
		
		System.out.println("Diga quantos dias você tem: ");
		dias = escreva.nextInt();
		
		tanos = anos * 365;
		tmeses = meses * 30;
		tdias = tanos + tmeses + dias;
		
		System.out.println("Sua idade em dias é: " + tdias);
		
		escreva.close();
	}

}
