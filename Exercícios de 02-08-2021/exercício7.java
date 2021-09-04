package br.com.generation.exercícios1;

import java.util.Scanner;

public class exercício7 {

	public static void main(String[] args) {
		Scanner escreva = new Scanner (System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = escreva.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = escreva.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = escreva.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = escreva.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e = escreva.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = escreva.nextDouble();
		
		x= ((c*e) - (b*f)) / ((a*e) - (b*d));
		y= ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println("O valor de X: " + x);
		System.out.println("O valor de Y: " + y);
		
		escreva.close();

	}

}
