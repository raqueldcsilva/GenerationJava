package br.com.generation.exercícios3;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero) */

public class lacoRepeticaoExercicio06MultiplosDeTres {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, soma = 0, contador = 0;
		double media =0;
		
		do {
			System.out.println("Digite o número: ");
			num = ler.nextInt();
			
			if (num % 3 == 0) {
				soma = soma + num;
				contador++;
				media = soma /contador;
			}
			
		} while (num != 0);
		
		System.out.println (contador);
		System.out.println("A média dos números multiplos de 3 é: " + media);
		ler.close();

	}

}
