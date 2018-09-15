package br.com.tt;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Cidade;
import br.com.tt.model.Estado;

public class Load {
	
	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("jpa_aula").createEntityManager();
		
		Estado rs = new Estado("Rio Grande do Sul", "RS");
		
		new Cidade("Porto Alegre", rs);
		new Cidade("Canoas", rs);
		new Cidade("Esteio", rs);
		new Cidade("São Leopoldo", rs);
		new Cidade("Ivoti", rs);
		
		em.getTransaction().begin();
		em.merge(rs);
		em.getTransaction().commit();
		em.clear();
		System.exit(0);
		
	}

}
