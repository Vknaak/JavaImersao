package br.com.tt;

public class Classe {

	public static void main(String[] args) {
		new Classe();
		new Classe();

	}

	{
		System.out.println("Criando o objeto.");
	}

	static {
		System.out.println("Criando a classe.");
	}

	public Classe() {
		super();
		System.out.println("Executando o construtor.");
	}

}
