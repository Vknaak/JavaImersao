package br.com.tt.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class Professor extends Pessoa{
	
	private String areaEnsino;
	private BigDecimal salario;
	private Integer diaPagamento;
	
	public String getAreaEnsino() {
		return areaEnsino;
	}
	public void setAreaEnsino(String areaEnsino) {
		this.areaEnsino = areaEnsino;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public Integer getDiaPagamento() {
		return diaPagamento;
	}
	public void setDiaPagamento(Integer diaPagamento) {
		this.diaPagamento = diaPagamento;
	}
	
	

}
