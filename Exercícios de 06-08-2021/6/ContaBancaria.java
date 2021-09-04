package br.com.generation.exercício6;

public class ContaBancaria {
	
	String nome;
	String cpf;
	int numero;
	double saldo;
	
	void taxaBancaria (double taxa) {
		
		saldo -= taxa;
	}
	
	void investimento (double ganho) {
		
		saldo += ganho;
	}

}
