package br.com.tt.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cidade;
import br.com.tt.util.JpaUtil;

public class Jpql_01_listAll {
	
	public static void main(String[] args) {
		 
		EntityManager em = JpaUtil.instanciar().getEm();
		String queryJpql = "SELECT C FROM Cidade C";
		TypedQuery<Cidade> query =  em.createQuery(queryJpql, Cidade.class);
		List<Cidade> resultList = query.getResultList();
		resultList.forEach(c ->System.out.println(c.getCidade()));
		
		
	}

}
