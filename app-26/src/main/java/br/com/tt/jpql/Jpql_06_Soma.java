package br.com.tt.jpql;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.tt.util.JpaUtil;

public class Jpql_06_Soma {
	
	private static final String SOMA = " SELECT SUM(c.id) FROM Cidade c LEFT JOIN "
									   +" c.estado e WHERE e.sigla = :sigla "
									   +" ORDER BY c.cidade DESC ";
	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.instanciar().getEm();
		
		TypedQuery<Long> query = em.createQuery(SOMA, Long.class);
		query.setParameter("sigla", "RS");
		Long soma = query.getSingleResult();
		System.out.println(soma);

	}

}
