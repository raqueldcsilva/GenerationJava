package br.com.generation.polimorfismoExerc�cio;

public class Preguica1 extends Animal2 implements Animal1 {

	@Override
	public void somAnimal() {
		System.out.println("Som da pregui�a: Aaaah ah ah");
		
	}

	@Override
	public void correr() {
		System.out.println("A pregui�a n�o corre!");
		
	}

	@Override
	public void subir() {
		System.out.println("A pregui�a est� subindo na �rvore");
		
	}
	
	

}
