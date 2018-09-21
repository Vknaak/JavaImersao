<<<<<<< HEAD
package br.com.tt.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cidade;
import br.com.tt.util.JpaUtil;

public class Jpql_10_Size {
	
	
	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.instanciar().getEm();
		
		String jpql = "SELECT SIZE(e.cidades) FROM Estado e";
		jpql += " WHERE e.sigla = :sigla";
		
		TypedQuery<Integer> query = em.createQuery(jpql, Integer.class);
		query.setParameter("silga", "RS");
		Integer size = query.getSingleResult();
		System.out.println("Rs possui " + size + " cidades");
	
		
	}

}
=======
package br.com.tt.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cidade;
import br.com.tt.util.JpaUtil;

public class Jpql_10_Size {
	
	
	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.instanciar().getEm();
		
		String jpql = "SELECT SIZE(e.cidades) FROM Estado e";
		jpql += " WHERE e.sigla = :sigla";
		
		TypedQuery<Integer> query = em.createQuery(jpql, Integer.class);
		query.setParameter("silga", "RS");
		Integer size = query.getSingleResult();
		System.out.println("Rs possui " + size + " cidades");
	
		
	}

}
>>>>>>> e795a6125dd326b0e2b0c594c51b5b1e0baab156
