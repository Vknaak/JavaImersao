package br.com.tt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sistema {

	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema...");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_aula");
		EntityManager em = emf.createEntityManager();
		System.out.println("Finalizando o Sistema..");

		Pessoa pessoa = new Pessoa();
		pessoa.setId(1L);
		pessoa.setNome("Carlos Eduardo");
		pessoa.setCpf("75973227");
		pessoa.setEmail("kaka@gmail.com");

		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		em.clear();
		em.find(Pessoa.class, 1L);
		System.out.println(pessoa);
		em.close();

	}

}
