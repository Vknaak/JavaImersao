<<<<<<< HEAD
package br.com.tt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;

class ProdutoServiceTest {

	@Test
	void test() {

		Faker faker = new Faker(new Locale("pt-BR"));
		ProdutoDao produtoDao = new ProdutoDao();
		for (int i = 0; i <= 10; i++) {
			Produto produto = new Produto(faker.artist().name());
			produto.setValor(Double.valueOf(new Random().nextInt(10000)));
			produtoDao.salvar(produto);
		}
		String relatorio = new ProdutoService().relatorio();
		System.out.println(relatorio);
		// relatorio.split("\n").length == 12);
		// Assertions.assertTrue(relatorio.length() > 20);
		Assertions.assertTrue(relatorio.split("\n").length == 12);
	}

}
=======
package br.com.tt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;

class ProdutoServiceTest {

	@Test
	void test() {

		Faker faker = new Faker(new Locale("pt-BR"));
		ProdutoDao produtoDao = new ProdutoDao();
		for (int i = 0; i <= 10; i++) {
			Produto produto = new Produto(faker.artist().name());
			produto.setValor(Double.valueOf(new Random().nextInt(10000)));
			produtoDao.salvar(produto);
		}
		String relatorio = new ProdutoService().relatorio();
		System.out.println(relatorio);
		// relatorio.split("\n").length == 12);
		// Assertions.assertTrue(relatorio.length() > 20);
		Assertions.assertTrue(relatorio.split("\n").length == 12);
	}

}
>>>>>>> bcdf0a8df3c24286f7e9e678ab3165c6b41764d3
