<<<<<<< HEAD
package br.com.tt;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private LocalDate dataNasc;

	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(Long id, String nome) {
		super(id, nome);
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(Long id, String nome, String cpf) {
		super(id, nome);
		this.cpf = cpf;
	}

	public PessoaFisica(Long id, String nome, String cpf, LocalDate dataNasc) {
		super(id, nome);
		this.cpf = cpf;
		this.dataNasc = dataNasc;
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

	@Override
	public String toString() {
		return super.toString() + "\nPessoaFisica \n\t[cpf=" + cpf + ", \n\tdataNasc=" + dataNasc + "]";
	}

	public String getDocFinanc() {
		// TODO Auto-generated method stub
		return cpf;
	}

}
=======
package br.com.tt;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private LocalDate dataNasc;

	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(Long id, String nome) {
		super(id, nome);
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(Long id, String nome, String cpf) {
		super(id, nome);
		this.cpf = cpf;
	}

	public PessoaFisica(Long id, String nome, String cpf, LocalDate dataNasc) {
		super(id, nome);
		this.cpf = cpf;
		this.dataNasc = dataNasc;
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

	@Override
	public String toString() {
		return super.toString() + "\nPessoaFisica \n\t[cpf=" + cpf + ", \n\tdataNasc=" + dataNasc + "]";
	}

	public String getDocFinanc() {
		// TODO Auto-generated method stub
		return cpf;
	}

}
>>>>>>> bcdf0a8df3c24286f7e9e678ab3165c6b41764d3
