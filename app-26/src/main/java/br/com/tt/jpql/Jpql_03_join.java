package br.com.tt.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cidade;
import br.com.tt.util.JpaUtil;

public class Jpql_03_join {
	private static final String JOIN_EXPLICITO = ""
	                                             +"SELECT c FROM Cidade c "
	                                             +"LEFT JOIN c.estado e "
	                                             +"WHERE e.sigla = :sigla ";
	private static final String JOIN_IMPLICITO = ""
			                                     +"SELECT c FROM Cidade c "
			                                     +"WHERE c.estado.sigla = :sigla ";
	
	
                                                 
	public static void main(String[] args) {

		EntityManager em = JpaUtil.instanciar().getEm();

		TypedQuery<Cidade> query = em.createQuery(JOIN_IMPLICITO, Cidade.class);
		query.setParameter("sigla", "RS");
		query.getResultList().forEach(c-> System.out.println(c.getCidade()));
		//List<Cidade> resultList = query.getResultList();
		//resultList.stream().forEach(c -> System.out.println(c.getCidade()));

	}

}
