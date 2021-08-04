package br.com.generation.exercícios3; 
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.*/

import java.util.Scanner;

public class exercicio03Idades {

	public static void main(String[] args) {
		
			Scanner ler = new Scanner (System.in);
			int idade = 0, menos21 = 0, mais50 = 0;				
				
				while (idade != -99) {
					
					System.out.println("Digite a sua idade: ");
					idade = ler.nextInt();
							
						if (idade < 21) {
							menos21 = menos21 +1;
					}
						else if (idade > 50) {
							mais50 = mais50 + 1; 
						}
					}
				
				System.out.println("O total de pessoas com menos de 21 anos é: " + menos21);
				System.out.println("O total de pessoas com mais de 50 anos é: " + mais50);
				ler.close();
				}
	}
	

	
