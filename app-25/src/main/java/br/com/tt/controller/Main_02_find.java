<<<<<<< HEAD
package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Cliente;
import br.com.tt.model.Telefone;

public class Main_02_find {
	static EntityManager em = Persistence.createEntityManagerFactory("jpa_aula").createEntityManager();

	public static void main(String[] args) {
		
		Cliente cliente = em.find(Cliente.class, 1L);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone().get(0).getNumero());
		
		Telefone telefone = em.find(Telefone.class, 1L);
		System.out.println(telefone.getNumero());
		System.out.println(telefone.getCliente().getNome());
	}

}
=======
package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Cliente;
import br.com.tt.model.Telefone;

public class Main_02_find {
	static EntityManager em = Persistence.createEntityManagerFactory("jpa_aula").createEntityManager();

	public static void main(String[] args) {
		
		Cliente cliente = em.find(Cliente.class, 1L);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone().get(0).getNumero());
		
		Telefone telefone = em.find(Telefone.class, 1L);
		System.out.println(telefone.getNumero());
		System.out.println(telefone.getCliente().getNome());
	}

}
>>>>>>> e795a6125dd326b0e2b0c594c51b5b1e0baab156
