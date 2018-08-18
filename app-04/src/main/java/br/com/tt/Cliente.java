<<<<<<< HEAD
<<<<<<< HEAD
package br.com.tt;

public class Cliente {

	private String nome;
	private String cpf;

	String escreverNome(String parametroNome) throws Exception {

		if (parametroNome.length() < 3) {
			Exception exception = new Exception("Nome necessita ser completo");
			throw exception;

		}
		nome = parametroNome;
		return nome;

	}

	public String pegarNome() {
		return nome;

	}

}
=======
package br.com.tt;

public class Cliente {

	private String nome;
	private String cpf;

	String escreverNome(String parametroNome) throws Exception {

		if (parametroNome.length() < 3) {
			Exception exception = new Exception("Nome necessita ser completo");
			throw exception;

		}
		nome = parametroNome;
		return nome;

	}

	public String pegarNome() {
		return nome;

	}

}
>>>>>>> 911bf648e82712d62a51cae0478c854b92e3784f
=======
package br.com.tt;

public class Cliente {

	private String nome;
	private String cpf;

	String escreverNome(String parametroNome) throws Exception {

		if (parametroNome.length() < 3) {
			Exception exception = new Exception("Nome necessita ser completo");
			throw exception;

		}
		nome = parametroNome;
		return nome;

	}

	public String pegarNome() {
		return nome;

	}

}
>>>>>>> 911bf648e82712d62a51cae0478c854b92e3784f
