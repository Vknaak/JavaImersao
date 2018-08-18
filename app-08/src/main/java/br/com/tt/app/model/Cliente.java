<<<<<<< HEAD
package br.com.tt.app.model;

public class Cliente {

	private String nome;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public boolean equals(Object obj) {

		String nome = ((Cliente) obj).getNome();
		if (hashCode() == nome.length()) {
			return this.nome.equals(nome);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return nome.length();
	}

}
=======
package br.com.tt.app.model;

public class Cliente {

	private String nome;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public boolean equals(Object obj) {

		String nome = ((Cliente) obj).getNome();
		if (hashCode() == nome.length()) {
			return this.nome.equals(nome);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return nome.length();
	}

}
>>>>>>> 911bf648e82712d62a51cae0478c854b92e3784f
