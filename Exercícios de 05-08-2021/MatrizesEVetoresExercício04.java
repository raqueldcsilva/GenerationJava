package br.com.generation.matrizesevetores;

import java.util.Scanner;

/* Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.  */
public class MatrizesEVetoresExercício04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int [][] matriz = new int [3][3];
		int soma = 0, diagonal=0;
		
		for(int l = 0; l < 3; l++ ) {
			for(int c = 0; c < 3; c++) {
				System.out.println("Digite o valor: ");
				matriz[l][c] = ler.nextInt();
						
				soma += matriz [l][c];
				diagonal = matriz [0][0] + matriz [1][1] + matriz [2][2];				
			}
		}
		System.out.println("A soma dos valores da Matriz é: " + soma);
		System.out.println("A soma dos valores da primeira diagonal é: " + diagonal);
		ler.close();
	}

}
