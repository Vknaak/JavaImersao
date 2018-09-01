package br.com.tt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sistema {
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando o Sistema...");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_aula");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();;
		em.persist(new Cliente("Carlos"));
		em.persist(new Cliente("Maria","12456987452","maria@maria.com"));
		em.getTransaction().commit();
		em.close();
		System.exit(0);
		
		System.out.println("Finalizando o Sistema..");
		
		
	}

}
