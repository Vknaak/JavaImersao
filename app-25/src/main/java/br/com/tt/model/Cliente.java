package br.com.tt.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.br.CPF;

@SuppressWarnings("serial")
@Entity
public class Cliente implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 150, name = "NOME_COMPLETO")
	private String nome;
	@Column(length = 11, nullable =  false, updatable = false)
	@CPF
	private String cpf;
	@OneToMany(cascade =CascadeType.ALL, mappedBy = "cliente")
	private List<Telefone> telefones;
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
	public List<Telefone> getTelefone() {
		return telefones;
	}
	public void setTelefone(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public void addTelefone(Telefone... telefones) {
		if(this.telefones == null) {
			this.telefones = new ArrayList<Telefone>();			
		}
		for (Telefone telefone : telefones) {
			this.telefones.add(telefone);
			telefone.setCliente(this);
		}
				
//		telefones.add(telefone);
//		telefone.setCliente(this);
		
	}
	
	
	

}
