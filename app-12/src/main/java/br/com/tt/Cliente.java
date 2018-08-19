<<<<<<< HEAD
package br.com.tt;

import java.util.Comparator;
import java.util.function.Predicate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Cliente implements Predicate<Cliente>, Comparable<Cliente>, Comparator<Cliente> {

	private Long id;
	private String nome;
	private String cpf;
	
	public Cliente() {
		super();
		
	}
	

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}


	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		//return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
		String objectString = "";
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectString = objectMapper.writeValueAsString(this);
		} catch (Exception e) {
			objectString = "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
		}
		return objectString;

	}

	@Override
	public int compareTo(Cliente cliente) {
		if (this.nome == null) {
			return -1;
		}
		return this.nome.compareTo(cliente.getNome());
	}

	@Override
	public int compare(Cliente cliente1, Cliente cliente2) {
		
		return cliente1.compareTo(cliente2);
	}


	@Override
	public boolean test(Cliente cliente) {
		// TODO Auto-generated method stub
		return equals(cliente);
	}
	

}
=======
package br.com.tt;

public class Cliente {

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

}
>>>>>>> bcdf0a8df3c24286f7e9e678ab3165c6b41764d3
