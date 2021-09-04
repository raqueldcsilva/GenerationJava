package br.com.generation.polimorfismoExercício;

public class Preguica1 extends Animal2 implements Animal1 {

	@Override
	public void somAnimal() {
		System.out.println("Som da preguiça: Aaaah ah ah");
		
	}

	@Override
	public void correr() {
		System.out.println("A preguiça não corre!");
		
	}

	@Override
	public void subir() {
		System.out.println("A preguiça está subindo na árvore");
		
	}
	
	

}
