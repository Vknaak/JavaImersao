<<<<<<< HEAD
package br.com.tt.controller;

import static javax.persistence.Persistence.createEntityManagerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tt.model.Aluno;
import br.com.tt.model.Pessoa;

public class Sistema {

	static EntityManagerFactory emf = createEntityManagerFactory("jpa_aula");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		System.out.println("Iniciando o Sistema");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Carlos");
		pessoa.setCpf("759.732.270-49");
		
		Aluno aluno = new Aluno();
		aluno.setNome("Maria");
		aluno.setMatricula("008273");
		
		em.getTransaction().begin();
		em.persist(pessoa);
		em.persist(aluno);
		em.getTransaction().commit();
		em.clear();
		em.clear();
	}

=======
package br.com.tt.controller;

import static javax.persistence.Persistence.createEntityManagerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tt.model.Aluno;
import br.com.tt.model.Pessoa;

public class Sistema {

	static EntityManagerFactory emf = createEntityManagerFactory("jpa_aula");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		System.out.println("Iniciando o Sistema");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Carlos");
		pessoa.setCpf("759.732.270-49");
		
		Aluno aluno = new Aluno();
		aluno.setNome("Maria");
		aluno.setMatricula("008273");
		
		em.getTransaction().begin();
		em.persist(pessoa);
		em.persist(aluno);
		em.getTransaction().commit();
		em.clear();
		em.clear();
	}

>>>>>>> e795a6125dd326b0e2b0c594c51b5b1e0baab156
}