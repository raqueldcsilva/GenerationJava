package br.com.generation.exercícios1;

import java.util.Scanner;

public class exercício6 {

	public static void main(String[] args) {
		Scanner escreva = new Scanner (System.in);
		double x1, x2, y1, y2;
		double p1, p2;
		double d, x;
		
		System.out.println("Digite o valor de X do primeiro ponto: ");
		x1 = escreva.nextDouble();
		
		System.out.println("Digite o valor de X do segundo ponto: ");
		x2 = escreva.nextDouble();
		
		System.out.println("Digite o valor de Y do primeiro ponto: ");
		y1 = escreva.nextDouble();
		
		System.out.println("Digite o valor de Y do segundo ponto: ");
		y2 = escreva.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2.0);
		p2 = Math.pow((y2 - y1), 2.0);
		x = p1 + p2;
		d = Math.sqrt(x);
		
		System.out.println("A distancia entre os pontos é: " + d);
		
		escreva.close();		

	}

}
