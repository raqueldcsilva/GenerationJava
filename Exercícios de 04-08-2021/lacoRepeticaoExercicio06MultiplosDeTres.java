package br.com.generation.exerc�cios3;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero) */

public class lacoRepeticaoExercicio06MultiplosDeTres {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, soma = 0, contador = 0;
		double media =0;
		
		do {
			System.out.println("Digite o n�mero: ");
			num = ler.nextInt();
			
			if (num % 3 == 0) {
				soma = soma + num;
				contador++;
				media = soma /contador;
			}
			
		} while (num != 0);
		
		System.out.println (contador);
		System.out.println("A m�dia dos n�meros multiplos de 3 �: " + media);
		ler.close();

	}

}
