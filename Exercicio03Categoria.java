package br.com.generation.exercícios2;

import java.util.Scanner;

public class Exercicio03Categoria {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Você se encontra na categoria Infantil");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Você se encontra na categoria Juvenil");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Você se encontra na categoria Adulto");
		}
		else {
			System.out.println("Idade Inválida");
		}
		ler.close();
	}

}
