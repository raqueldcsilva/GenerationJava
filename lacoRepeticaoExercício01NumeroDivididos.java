package br.com.generation.exerc�cios3;
//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. 

public class lacoRepeticaoExerc�cio01NumeroDivididos {

	public static void main(String[] args) {
		
		int num;
		
		for (num = 1000; num <= 1999; num++) {
			if(num % 11 == 5) {
				System.out.println(num);
			}
		}
	
	}

}
