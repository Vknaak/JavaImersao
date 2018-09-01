package br.com.tt;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tt.model.Aluno;
import br.com.tt.model.Pessoa;
import br.com.tt.model.Professor;

public class Sistema {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_aula");
		EntityManager em = emf.createEntityManager();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Pedro");
		
		Aluno aluno = new Aluno();
		aluno.setNome("Camila");
		aluno.setMatricula("008273");
		Professor professor = new Professor();
		professor.setNome("Lucas");
		professor.setSalario(new BigDecimal(5000));
		
		em.getTransaction().begin();
		em.persist(pessoa);
		em.persist(aluno);
		em.persist(professor);
		em.getTransaction().commit();
		em.clear();
		em.close();

		
	}
	
}
