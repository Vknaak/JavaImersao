<<<<<<< HEAD
package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Cliente;
import br.com.tt.model.Telefone;

public class Main_04_remove {
	static EntityManager em = Persistence.createEntityManagerFactory("jpa_aula").createEntityManager();

	public static void main(String[] args) {

		Cliente cliente = em.find(Cliente.class, 1L);

		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		em.clear();
		em.close();
		System.exit(0);
	}

}
=======
package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Cliente;
import br.com.tt.model.Telefone;

public class Main_04_remove {
	static EntityManager em = Persistence.createEntityManagerFactory("jpa_aula").createEntityManager();

	public static void main(String[] args) {

		Cliente cliente = em.find(Cliente.class, 1L);

		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		em.clear();
		em.close();
		System.exit(0);
	}

}
>>>>>>> e795a6125dd326b0e2b0c594c51b5b1e0baab156
