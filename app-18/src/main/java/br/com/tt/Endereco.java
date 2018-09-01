package br.com.tt;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rua;
	private String cidade;
	@Enumerated(EnumType.STRING)
	private estadoType estado;

	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endereco(String rua, String cidade, estadoType estado) {
		super();
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public estadoType getEstado() {
		return estado;
	}

	public void setEstado(estadoType estado) {
		this.estado = estado;
	}

}
