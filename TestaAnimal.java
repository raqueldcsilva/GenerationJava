package br.com.generation.heran�a;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cachorro doguinho = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica preg = new Preguica();
		
		doguinho.setNome("Bob");
		cav.setNome("Haki");
		preg.setNome("Sophie");
		
		doguinho.setIdade(7);
		cav.setIdade(5);
		preg.setIdade(4);
		
		doguinho.somAnimal();
		cav.somAnimal();
		preg.somAnimal();
		
		doguinho.correr();
		cav.correr();
		preg.subir();
		
		System.out.println("O nome do cachorro � " + doguinho.getNome());
		System.out.println("Ele tem " + doguinho.getIdade() + " anos");
		System.out.println ("O cachorro " + doguinho.somAnimal());
		System.out.println("O cachorro" + doguinho.correr());
		
		System.out.println("O nome do cavalo � " + cav.getNome());
		System.out.println("Ele tem " + cav.getIdade() + " anos");
		System.out.println("O cavalo " + cav.somAnimal());
		System.out.println("O cavalo " + cav.correr());
		
		System.out.println("O nome da pregui�a � " + preg.getNome());
		System.out.println("Ela tem " + preg.getIdade() + " anos");
		System.out.println("A pregui�a " + preg.somAnimal());
		System.out.println("A pregui�a " + preg.subir());
		
	}

}
