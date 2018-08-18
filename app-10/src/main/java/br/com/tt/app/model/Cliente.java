<<<<<<< HEAD
package br.com.tt.app.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private Long id;
	private String nome;
	private String cpf;
	private List<Telefones> telefones;
	private Endereco endereco;
	
	public void addTelefone(Telefones telefone) {
		if(telefones == null) {
			telefones = new ArrayList<>();
		}
		telefones.add(telefone);
	}
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	public Cliente(String nome, String cpf, List<Telefones> telefones) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefones = telefones;
	}
	public Cliente(String nome, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	public Cliente(String nome, String cpf, List<Telefones> telefones, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefones = telefones;
		this.endereco = endereco;
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
	public List<Telefones> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefones> telefones) {
		this.telefones = telefones;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefones=" + telefones + ", endereco="
				+ endereco + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefones == null) ? 0 : telefones.hashCode());
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
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
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
		if (telefones == null) {
			if (other.telefones != null)
				return false;
		} else if (!telefones.equals(other.telefones))
			return false;
		return true;
	}
	
	//c-o-r-s-h

}
=======
package br.com.tt.app.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private Long id;
	private String nome;
	private String cpf;
	private List<Telefones> telefones;
	private Endereco endereco;
	
	public void addTelefone(Telefones telefone) {
		if(telefones == null) {
			telefones = new ArrayList<>();
		}
		telefones.add(telefone);
	}
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	public Cliente(String nome, String cpf, List<Telefones> telefones) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefones = telefones;
	}
	public Cliente(String nome, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	public Cliente(String nome, String cpf, List<Telefones> telefones, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefones = telefones;
		this.endereco = endereco;
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
	public List<Telefones> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefones> telefones) {
		this.telefones = telefones;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefones=" + telefones + ", endereco="
				+ endereco + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefones == null) ? 0 : telefones.hashCode());
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
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
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
		if (telefones == null) {
			if (other.telefones != null)
				return false;
		} else if (!telefones.equals(other.telefones))
			return false;
		return true;
	}
	
	//c-o-r-s-h

}
>>>>>>> 911bf648e82712d62a51cae0478c854b92e3784f
