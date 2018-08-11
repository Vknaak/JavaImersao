package br.com.tt.app;

import java.time.LocalDate;

public class Cliente {

	private String nome;
	private String cpf;
	private Integer idade;
	private LocalDate dataNasc;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome.toUpperCase();
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Integer getIdade() {
		return idade;
	}
//alt + shit + S == S
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", dataNasc=" + dataNasc + "]";
	}
	
	

}
