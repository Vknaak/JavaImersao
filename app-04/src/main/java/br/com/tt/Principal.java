<<<<<<< HEAD
<<<<<<< HEAD
package br.com.tt;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema.....");

		Cliente cliente = new Cliente();// alt + shit + L implementa a criacao de novo objeto
		// cliente.nome = "a";
		String resultado = null;
		try {
			resultado = cliente.escreverNome("Vilson");
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Gravando o " + resultado);

		// -- buscar nome do cliente

		String nome = cliente.pegarNome();
		System.out.println("Buscando o : " + nome);
	}
}
=======
package br.com.tt;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema.....");

		Cliente cliente = new Cliente();// alt + shit + L implementa a criacao de novo objeto
		// cliente.nome = "a";
		String resultado = null;
		try {
			resultado = cliente.escreverNome("Vilson");
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Gravando o " + resultado);

		// -- buscar nome do cliente

		String nome = cliente.pegarNome();
		System.out.println("Buscando o : " + nome);
	}
}
>>>>>>> 911bf648e82712d62a51cae0478c854b92e3784f
=======
package br.com.tt;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema.....");

		Cliente cliente = new Cliente();// alt + shit + L implementa a criacao de novo objeto
		// cliente.nome = "a";
		String resultado = null;
		try {
			resultado = cliente.escreverNome("Vilson");
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Gravando o " + resultado);

		// -- buscar nome do cliente

		String nome = cliente.pegarNome();
		System.out.println("Buscando o : " + nome);
	}
}
>>>>>>> 911bf648e82712d62a51cae0478c854b92e3784f
