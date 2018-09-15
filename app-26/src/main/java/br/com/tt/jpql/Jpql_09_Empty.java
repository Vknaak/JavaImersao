package br.com.tt.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cidade;
import br.com.tt.util.JpaUtil;

public class Jpql_09_Empty {
	
	
	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.instanciar().getEm();
		
		String jpql = "SELECT c FROM Cidade c";
		jpql += " WHERE c.estado IS NOT EMPTY";
		
		TypedQuery<Cidade> query = em.createQuery(jpql, Cidade.class);
		query.setParameter("cidade", " Canoas ");
		List<Cidade> resultList = query.getResultList();
		resultList.forEach(c -> System.out.println(c.getCidade()));
		
	}

}
