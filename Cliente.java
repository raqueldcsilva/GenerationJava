package br.com.generation.exerc�cio1;

public class Cliente {
	
	String nome;
	String endere�o;
	int telefone;
	double saldo;
	
	
	void comprar (double valorCompra) {
		
		saldo -= valorCompra;
	}
	
	void devolucao  (double valorDevolucao) {
		
		saldo += valorDevolucao;
		
	}
	


}
