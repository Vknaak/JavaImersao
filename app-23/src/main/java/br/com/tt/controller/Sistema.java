package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Aluno;
import br.com.tt.model.Pessoa;

public class Sistema {

	public static void main(String[] args) {

		System.out.println("Iniciando o Sistema!!");

		EntityManager em = Persistence.createEntityManagerFactory("jpa_aula").createEntityManager();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Vilson knaak");
		pessoa.setCpf("759.732.270-49");
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Maria Luiza");
		aluno.setMatricula("008273");
		aluno.setEmpresa("Home sweet home");
		aluno.setCpf("759.325.547-46");
		
		
		em.getTransaction().begin();
		em.persist(pessoa);
		em.persist(aluno);
		em.getTransaction().commit();
		em.clear();
		em.clear();

	}

}
