package br.com.generation.exerc�cios1;

import java.util.Scanner;

public class exerc�cio1 {
	public static void main (String args[]) {
		Scanner escreva = new Scanner (System.in);
		int anos, meses, dias, tanos, tmeses, tdias;
		
		System.out.println("Diga quantos anos voc� tem: ");
		anos = escreva.nextInt();
		
		System.out.println("Diga quantos meses voc� tem: ");
		meses = escreva.nextInt();
		
		System.out.println("Diga quantos dias voc� tem: ");
		dias = escreva.nextInt();
		
		tanos = anos * 365;
		tmeses = meses * 30;
		tdias = tanos + tmeses + dias;
		
		System.out.println("Sua idade em dias �: " + tdias);
		
		escreva.close();
	}

}
