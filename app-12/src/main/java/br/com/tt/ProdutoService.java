<<<<<<< HEAD
package br.com.tt;

import java.util.List;

public class ProdutoService {

	public String relatorio() {

		StringBuilder relatorio = new StringBuilder("\t - Relatorio\n");

		ProdutoDao produtoDao = new ProdutoDao();
		List<Produto> consultar = produtoDao.consultar();

		for (Produto produto : consultar) {
			String prod = String.format("%-55s", produto.getProduto());
			relatorio.append(prod +" " + produto.getValor() + "\n");
		}

		return relatorio.toString();
	}

}
=======
package br.com.tt;

import java.util.List;

public class ProdutoService {

	public String relatorio() {

		StringBuilder relatorio = new StringBuilder("\t - Relatorio\n");

		ProdutoDao produtoDao = new ProdutoDao();
		List<Produto> consultar = produtoDao.consultar();

		for (Produto produto : consultar) {
			String prod = String.format("%-55s", produto.getProduto());
			relatorio.append(prod +" " + produto.getValor() + "\n");
		}

		return relatorio.toString();
	}

}
>>>>>>> bcdf0a8df3c24286f7e9e678ab3165c6b41764d3
