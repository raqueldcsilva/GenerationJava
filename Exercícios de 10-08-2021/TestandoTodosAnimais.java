package br.com.generation.polimorfismoExerc�cio;

public class TestandoTodosAnimais {

	public static void main(String[] args) {
		
		Cachorro1 dog = new Cachorro1();
		Cavalo1 cavalo = new Cavalo1();
		Preguica1 preguica = new Preguica1();
		
		dog.setNome("Bob");
		cavalo.setNome("P� de Pano");
		preguica.setNome("Lucy");
		
		System.out.println("Nome do cachorro: " + dog.getNome());
		dog.somAnimal();
		dog.correr();
		System.out.println("\n");
		
		System.out.println("Nome do cavalo: " + cavalo.getNome());
		cavalo.somAnimal();
		cavalo.correr();
		System.out.println("\n");
		
		System.out.println("Nome do pregui�a: " + preguica.getNome());
		preguica.somAnimal();
		preguica.subir();
		System.out.println("\n");
		
		
		

	}

}
