package br.com.tt.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cidade;
import br.com.tt.util.JpaUtil;

public class Jpql_08_Distinc {
	
	
	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.instanciar().getEm();
		
		String jpql = "SELECT DISTINCT c FROM Cidade c";
		jpql += " WHERE upper(c.cidade) = upper(trim(:cidade))";
		
		TypedQuery<Cidade> query = em.createQuery(jpql, Cidade.class);
		query.setParameter("cidade", " Canoas ");
		List<Cidade> resultList = query.getResultList();
		resultList.forEach(c -> System.out.println(c.getCidade()));
		
	}

}
