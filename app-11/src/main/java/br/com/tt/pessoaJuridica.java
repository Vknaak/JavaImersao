package br.com.tt;

import java.time.LocalDate;

public class pessoaJuridica extends Pessoa {

	private String cnpj;
	private LocalDate dataFund;

	public pessoaJuridica() {
		// TODO Auto-generated constructor stub
	}

	public pessoaJuridica(Long id, String nome) {
		super(id, nome);
		// TODO Auto-generated constructor stub
	}

	public pessoaJuridica(Long id, String nome, String cnpj) {
		super(id, nome);
		this.cnpj = cnpj;
	}

	public pessoaJuridica(Long id, String nome, String cnpj, LocalDate dataFund) {
		super(id, nome);
		this.cnpj = cnpj;
		this.dataFund = dataFund;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getDataFund() {
		return dataFund;
	}

	public void setDataFund(LocalDate dataFund) {
		this.dataFund = dataFund;
	}

	@Override
	public String toString() {
		return "pessoaJuridica [cnpj=" + cnpj + ", dataFund=" + dataFund + "]";
	}

	public String getDocFinanc() {
		// TODO Auto-generated method stub
		return cnpj;
	}

}
