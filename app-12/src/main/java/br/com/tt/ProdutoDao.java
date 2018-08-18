package br.com.tt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProdutoDao implements Dao<Produto> {

	private static List<Produto> produtos = new ArrayList<>();

	private static Long id = 0L;

	@Override
	public void salvar(Produto produto) {
		if (produto.getId() == null) {
			produto.setId(++id);
		}
		if (buscar(produto) == null) {
			produtos.add(produto);
		}

	}

	@Override
	public void alterar(Produto produto) {
		salvar(produto);

	}

	@Override
	public Produto buscar(Long id) {
		return produtos.stream().filter(produto -> produto.getId().equals(id)).findFirst().get();

		// for (Produto produto2 : produtos) {
		// if(produto2.getId().equals(id)) {
		// result = produto2;
		// break;
		// return result;
		// }
		// }
	}

	@Override
	public Produto buscar(Produto produto) {
		return produtos.stream().filter(produto).findFirst().orElse(null);
	}

	@Override
	public void deletar(Long id) {
		produtos.remove(buscar(id));

	}

	@Override
	public void deletar(Produto produto) {
		produtos.remove(produto);

	}

	public void clear() {
		produtos.clear();
		id = 0L;
	}

	@Override
	public List<Produto> consultar() {
		return produtos;

	}

	@Override
	public List<Produto> consultar(Produto produto) {
		// TODO Auto-generated method stub
		return produtos.stream().filter(produto).collect(Collectors.toList());
	}

	@Override
	public List<Produto> consultar(List<Produto> produtos) {
		Set<Produto> prods = new HashSet<Produto>();
		for (Produto produto2 : produtos) {
			prods.addAll(consultar(produto2));
		}
		// produtos.forEach(produto ->prods.addAll(consultar(produto)));
		return new ArrayList<>(prods);
	}

}
