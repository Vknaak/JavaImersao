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
