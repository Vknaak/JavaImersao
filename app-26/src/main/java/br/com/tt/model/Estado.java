<<<<<<< HEAD
package br.com.tt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ESTADO")
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String sigla;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "estado")
	private List<Cidade> cidades;

	public void addCidade(Cidade... cidades) {
		if (this.cidades == null) {
			this.cidades = new ArrayList<Cidade>();
		}
		for (Cidade cidade : cidades) {
			this.cidades.add(cidade);
			cidade.setEstado(this);

		}

	}

	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Estado(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

}
=======
package br.com.tt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ESTADO")
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String sigla;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "estado")
	private List<Cidade> cidades;

	public void addCidade(Cidade... cidades) {
		if (this.cidades == null) {
			this.cidades = new ArrayList<Cidade>();
		}
		for (Cidade cidade : cidades) {
			this.cidades.add(cidade);
			cidade.setEstado(this);

		}

	}

	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Estado(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

}
>>>>>>> e795a6125dd326b0e2b0c594c51b5b1e0baab156
