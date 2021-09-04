package br.com.generation.exercício2;

public class Aviao {
	
		String agencia;
		String modelo;
		String destino;
		int ano;
		int velocidade;
		
		void voo (int decolar) {
			
			velocidade += decolar;
		}
		void pouso (int reduzirVelocidade) {
			velocidade -= reduzirVelocidade;
		}

	}
