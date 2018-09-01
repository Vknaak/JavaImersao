package br.com.tt;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tt.model.Aluno;
import br.com.tt.model.Curso;

public class Sistema {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_aula");
		EntityManager em = emf.createEntityManager();

		Aluno aluno = new Aluno();
		Curso curso = new Curso();
		Curso cursoSpring = new Curso();

		aluno.setNome("Marcos");
		aluno.setCpf("759.732.270-49");
		curso.setNome("Java");
		curso.addAluno(aluno);
		cursoSpring.setNome("Curso Spring BOOT");
		cursoSpring.addAluno(aluno);

//		List<Curso> cursos = new ArrayList<Curso>();
//		List<Aluno> alunos = new ArrayList<Aluno>();
//
//		cursos.add(curso);
//		cursos.add(cursoSpring);
//		alunos.add(aluno);

//		aluno.setCursos(cursos);
//		curso.setAlunos(alunos);
//		cursoSpring.setAlunos(alunos);
		
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		em.clear();
		em.close();
		emf.close();

	}

}
