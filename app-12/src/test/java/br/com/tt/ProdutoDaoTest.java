package br.com.tt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ProdutoDaoTest {

	ProdutoDao produtoDao;

	@BeforeEach
	public void initEach() {
		System.out.println("Antes de cada metodo o \"BeforeEach\" é executado");
		produtoDao = new ProdutoDao();
		produtoDao.clear();
	}

	@Test
	void testSalvar() {
		produtoDao.salvar(new Produto());
		int size = produtoDao.consultar().size();
		Assertions.assertEquals(1, size);

	}

	@Test
	// @Disabled
	void testAlterar() {
		produtoDao.salvar(new Produto());
		produtoDao.salvar(new Produto());
		int size = produtoDao.consultar().size();
		Assertions.assertEquals(2, size);

	}

	@Test
	void testBuscarLong() {
		Produto produto = new Produto();
		produtoDao.salvar(produto);
		Produto buscar = produtoDao.buscar(1L);
		Assertions.assertEquals(produto, buscar);
	}

	@Test
	void testBuscarProduto() {
		Produto produto = new Produto("Monitor");
		produtoDao.salvar(produto);
		Produto buscar = produtoDao.buscar(produto);
		Assertions.assertEquals(produto, buscar);

	}

	@Test
	void testDeletarLong() {
		produtoDao.salvar(new Produto());
		produtoDao.deletar(1L);
		Assertions.assertEquals(0L, produtoDao.consultar().size());

	}

	@Test
	void testDeletarProduto() {
		Produto p = new Produto("Notebook");
		p.setId(1L);
		produtoDao.salvar(p);
		produtoDao.deletar(p);
		Assertions.assertEquals(0L, produtoDao.consultar().size());

	}

	@Test
	void testConsultar() {
		Produto p = new Produto();
		produtoDao.salvar(p);
		produtoDao.salvar(new Produto());
		Assertions.assertEquals(2L, produtoDao.consultar().size());

	}

	@Test
	void testConsultarProduto() {
		Produto p = new Produto("Monitor");
		p.setId(1L);
		produtoDao.salvar(p);
		List<Produto> consultar = produtoDao.consultar(p);
		Assertions.assertEquals(1,  consultar.size());
		
	}

	@Test
	void testConsultarListOfProduto() {
		Produto p = new Produto("Monitor");
		p.setId(1L);
		produtoDao.salvar(p);
		Produto p1 = new Produto("Monitor");
		p.setId(2L);
		produtoDao.salvar(p1);
		List<Produto> lista = new ArrayList<>();
		//Se utilizar a linha abaixo não é necessário utilizar linhas 105,108 e 109.
		//List<Produto> lista = Arrays.asList(new Produto[] {p,p1});
		lista.add(p);
		lista.add(p1);
		List<Produto> consultar = produtoDao.consultar(lista);
		Assertions.assertEquals(lista, consultar);
	}

}
