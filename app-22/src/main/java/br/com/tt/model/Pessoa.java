<<<<<<< HEAD
package br.com.tt.model;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.InheritanceType.TABLE_PER_CLASS;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = TABLE_PER_CLASS)
@DiscriminatorColumn(name = "CLASSE")
@DiscriminatorValue(value = "CLASSE_PESSOA")
//@Table(name = "TB_CADASTRO_DOIS")
public class Pessoa implements Serializable {

	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	private String nome;
	private String cpf;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
=======
package br.com.tt.model;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.InheritanceType.TABLE_PER_CLASS;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = TABLE_PER_CLASS)
@DiscriminatorColumn(name = "CLASSE")
@DiscriminatorValue(value = "CLASSE_PESSOA")
//@Table(name = "TB_CADASTRO_DOIS")
public class Pessoa implements Serializable {

	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	private String nome;
	private String cpf;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
>>>>>>> e795a6125dd326b0e2b0c594c51b5b1e0baab156
