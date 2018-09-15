package br.com.tt.controller;



import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Aluno;
import br.com.tt.model.Pessoa;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando o Sistema!!");
		
		EntityManager em = Persistence.createEntityManagerFactory("jpa_aula").createEntityManager();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Vilson");
		aluno.setCpf("75973227049");
		aluno.setMatricula("008273");
		aluno.setEmpresa("IBM");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Carlos");
		pessoa.setCpf("554646");
		
		em.getTransaction().begin();
		em.persist(aluno);
		em.persist(pessoa);
		em.getTransaction().commit();
		em.clear();
		em.close();
		
	}

}
