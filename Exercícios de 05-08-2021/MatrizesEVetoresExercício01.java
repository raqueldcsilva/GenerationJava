package br.com.generation.matrizesevetores;

import java.util.Scanner;

/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. 
 * Encontre ap�s a maior pontua��o e a apresente.*/

public class MatrizesEVetoresExerc�cio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double [] notas = new double [5];
		double maiorPontuacao = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a pontua��o da atividade: ");
			notas[i] = ler.nextDouble();
					
					if(notas [i] > maiorPontuacao) {
						maiorPontuacao = notas[i];
					}
	}
		System.out.println("A 1� pontua��o �: " + notas[0]);
		System.out.println("A 2� pontua��o �: " + notas[1]);
		System.out.println("A 3� pontua��o �: " + notas[2]);
		System.out.println("A 4� pontua��o �: " + notas[3]);
		System.out.println("A 5� pontua��o �: " + notas[4]);
		System.out.println("A maior pontua��o � " + maiorPontuacao);
		
		ler.close();
}

}
