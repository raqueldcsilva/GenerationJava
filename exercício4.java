package br.com.generation.exerc�cios1;

import java.util.Scanner;

public class exerc�cio4 {

	public static void main(String[] args) {
		Scanner escreva = new Scanner (System.in);
		
		double a, b, c, r, s, d;
		
		System.out.println("Digite o valor de A: ");
		a =  escreva.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b =  escreva.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c =  escreva.nextDouble();
		
		
		r = Math.pow((a+b) , 2.0);
		s = Math.pow((b+c), 2.0);
		d = (r+s)/2;
		
		System.out.println("O valor de R �: " + r);
		System.out.println("O valor de S �: " + s);
		System.out.println("O valor de D �: " + d);
		
		escreva.close();
		
		
		
		
	}

}
