package br.com.generation.polimorfismoExercício;

public class Cachorro1 extends Animal2 implements Animal1 {
	

	@Override
	public void somAnimal() {
		System.out.println("O som do cachorro: Au au au");
		
	}

	@Override
	public void correr() {
		System.out.println("O cachorro está correndo");
		
	}

	@Override
	public void subir() {
		System.out.println("O cachorro não sobe em árvores");
		
	}
	

}
