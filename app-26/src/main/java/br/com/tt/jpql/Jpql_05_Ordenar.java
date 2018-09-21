package br.com.tt.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cidade;
import br.com.tt.util.JpaUtil;

public class Jpql_05_Ordenar {
	
	private static final String ORDENA = " SELECT c FROM Cidade c LEFT JOIN FETCH "
									   +" c.estado e WHERE e.sigla = :sigla "
									   +" ORDER BY c.cidade DESC ";
	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.instanciar().getEm();
		
		TypedQuery<Cidade> query = em.createQuery(ORDENA, Cidade.class);
		query.setParameter("sigla", "RS");
		List<Cidade> resultList = query.getResultList();
		resultList.forEach(c -> System.out.println(c.getCidade()));

	}

}
