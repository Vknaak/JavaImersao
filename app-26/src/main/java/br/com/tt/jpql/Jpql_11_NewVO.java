package br.com.tt.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.annotations.SourceType;

import br.com.tt.model.Cidade;
import br.com.tt.util.JpaUtil;
import br.com.tt.vo.CidadeVO;

public class Jpql_11_NewVO {
	
	
	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.instanciar().getEm();
		
		String jpql = "SELECT ";
		jpql += " NEW br.com.tt.vo.CidadeVO (c.cidade, c.estado.sigla)";
		jpql += " FROM Cidade c ";
		
		
		TypedQuery<CidadeVO> query = em.createQuery(jpql, CidadeVO.class);
		List<CidadeVO> cidadesVO = query.getResultList();
		cidadesVO.forEach(System.out::println);
	
		
	}

}
