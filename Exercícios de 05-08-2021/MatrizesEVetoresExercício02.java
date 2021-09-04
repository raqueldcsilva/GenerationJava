package br.com.generation.matrizesevetores;

import java.util.Scanner;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, 
 * escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também 
 * quantas foram as ocorrências da maior pontuação.*/

public class MatrizesEVetoresExercício02 {

	public static void main(String[] args) {
		Scanner lancamento = new Scanner (System.in);
		
		double [] valor = new double[10];
		double media = 0, mp = 0, soma=0;
		
		 for (int l = 0; l < 10; l++) {
			 System.out.println("Insira os números: ");
			 valor [l] = lancamento.nextDouble();
			 soma += valor [l];
			 media = soma/10;
			 
			 if (valor [l] > mp) {
				 mp = valor [l];				 
			 }
			 
		 }
		 System.out.println("A média aritmética dos lançamentos é: " + media);
		 System.out.println("A maior pontuação foi de: " + mp);
		 lancamento.close();
		
	}

}
