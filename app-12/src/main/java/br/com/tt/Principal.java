<<<<<<< HEAD
package br.com.tt;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import com.github.javafaker.Faker;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inciando o Sistema....");
		
		Faker faker = new Faker(new Locale("pt-BR"));

		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = new Produto();
		produto.setProduto(faker.food().ingredient());
		// produto.setId(1L);
		//produto.setProduto("notebook");
		produtoDao.salvar(produto);
		Produto p1 = new Produto("Monitor");
		p1.setValor(2000D);
		produtoDao.salvar(p1);
		produtoDao.salvar(new Produto("Iphone"));
		produtoDao.salvar(new Produto());

		produto.setValor(5000D);
		produtoDao.salvar(produto);

		List<Produto> produtos = produtoDao.consultar();
		produtos.sort(new Produto());
		System.out.println("Consultar");
		produtos.forEach(System.out::println);

		Produto p = produtoDao.buscar(produto);
		System.out.println("\n\nResulto do busca: " + p);
		
		ClienteDao clienteDao = new ClienteDao();
		Cliente cliente = new Cliente();
		cliente.setNome(faker.name().firstName());
		cliente.setCpf("759.732.270-49");
		clienteDao.salvar(cliente);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome(faker.name().firstName());
		cliente1.setCpf("759.756.123-98");
		clienteDao.salvar(cliente1);
		System.out.println("Cliente Inserido:\n "+ cliente +"\n"+ cliente1);
	}

}
=======
package br.com.tt;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import com.github.javafaker.Faker;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inciando o Sistema....");
		
		Faker faker = new Faker(new Locale("pt-BR"));

		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = new Produto();
		produto.setProduto(faker.food().ingredient());
		// produto.setId(1L);
		//produto.setProduto("notebook");
		produtoDao.salvar(produto);
		Produto p1 = new Produto("Monitor");
		p1.setValor(2000D);
		produtoDao.salvar(p1);
		produtoDao.salvar(new Produto("Iphone"));
		produtoDao.salvar(new Produto());

		produto.setValor(5000D);
		produtoDao.salvar(produto);

		List<Produto> produtos = produtoDao.consultar();
		produtos.sort(new Produto());
		System.out.println("Consultar");
		produtos.forEach(System.out::println);

		Produto p = produtoDao.buscar(produto);
		System.out.println("\n\nResulto do busca: " + p);

	}

}
>>>>>>> bcdf0a8df3c24286f7e9e678ab3165c6b41764d3
