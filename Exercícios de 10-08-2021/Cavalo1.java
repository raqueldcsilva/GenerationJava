package br.com.generation.polimorfismoExercício;

public class Cavalo1 extends Animal2 implements Animal1 {

	@Override
	public void somAnimal() {
		System.out.println("Som do cavalo: hien in in");
		
	}

	@Override
	public void correr() {
		System.out.println("O cavalo está correndo");
		
	}

	@Override
	public void subir() {
		System.out.println("O cavalo não sobe em árvores");
		
	}

}
