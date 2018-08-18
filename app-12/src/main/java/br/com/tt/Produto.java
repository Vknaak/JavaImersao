package br.com.tt;

import java.util.Comparator;
import java.util.function.Predicate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Produto implements Predicate<Produto>, Comparable<Produto>, Comparator<Produto> {

	private Long id;
	private String produto;
	private Double valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(String produto) {
		super();
		this.produto = produto;
	}

	@Override
	public boolean test(Produto produto) {

		// boolean id = this.getId().equals(produto.getId());
		// boolean nomeProduto = this.getProduto().equals(produto.getProduto());
		// boolean valor = this.getValor().equals(produto.getValor());
		// return (id || nomeProduto || valor);
		return equals(produto);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		// return "Produto [id=" + id + ", produto=" + produto + ", valor=" + valor +
		// "]";

		String objectString = "";
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectString = objectMapper.writeValueAsString(this);
		} catch (Exception e) {
			objectString = "Produto [id=" + id + ", produto= " + produto + " valor=" + valor + "]";
		}
		return objectString;

	}

	@Override
	public int compareTo(Produto produto) {
		if (this.produto == null) {
			return -1;
		}
		return this.produto.compareTo(produto.getProduto());
	}

	@Override
	public int compare(Produto produto1, Produto produto2) {
		
		return produto1.compareTo(produto2);
	}

}
