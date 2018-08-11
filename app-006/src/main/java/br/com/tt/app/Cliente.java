package br.com.tt.app;

import java.time.LocalDate;

public class Cliente {

	private String nome;
	private String cpf;
	private LocalDate dataNasc;
	private Endereco endereco;

	public Cliente() {
		super();
		System.out.println("Criando um objeto cliente vazio.");
	}

	public Cliente(String nome) {
		this();
		setNome(nome);
		System.out.println("Criando um objeto com nome.");
	}

	public Cliente(String nome, String cpf) {

		this(nome);
		this.cpf = cpf;
		System.out.println("Criando um objeto com nome e cpf.");
	}

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

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + ", endereco=" + endereco + "]";
	}

}
