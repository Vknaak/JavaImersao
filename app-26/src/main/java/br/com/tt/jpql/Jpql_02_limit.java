<<<<<<< HEAD
package br.com.tt.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cidade;
import br.com.tt.util.JpaUtil;

public class Jpql_02_limit {

	public static final String CIDADE_ALL = "SELECT c FROM Cidade c";

	public static void main(String[] args) {

		EntityManager em = JpaUtil.instanciar().getEm();
		TypedQuery<Cidade> query = em.createQuery(CIDADE_ALL, Cidade.class);
		query.setFirstResult(2);
		query.setMaxResults(3);
		List<Cidade> resultList = query.getResultList();
		resultList.stream().forEach(c -> System.out.println(c.getCidade()));
	}

}
=======
package br.com.tt.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cidade;
import br.com.tt.util.JpaUtil;

public class Jpql_02_limit {

	public static final String CIDADE_ALL = "SELECT c FROM Cidade c";

	public static void main(String[] args) {

		EntityManager em = JpaUtil.instanciar().getEm();
		TypedQuery<Cidade> query = em.createQuery(CIDADE_ALL, Cidade.class);
		query.setFirstResult(2);
		query.setMaxResults(3);
		List<Cidade> resultList = query.getResultList();
		resultList.stream().forEach(c -> System.out.println(c.getCidade()));
	}

}
>>>>>>> e795a6125dd326b0e2b0c594c51b5b1e0baab156
