<<<<<<< HEAD
package br.com.tt.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private EntityManager em;
	private static JpaUtil jpaUtil;

	private JpaUtil() {
		super();

	}

	public static JpaUtil instanciar() {
		if (jpaUtil == null) {
			jpaUtil = new JpaUtil();
		}
		return jpaUtil;
	}

	public EntityManager getEm() {
		if (em == null || !em.isOpen()) {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_aula");
			em = emf.createEntityManager();
		}
		return em;

	}

}
=======
package br.com.tt.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private EntityManager em;
	private static JpaUtil jpaUtil;

	private JpaUtil() {
		super();

	}

	public static JpaUtil instanciar() {
		if (jpaUtil == null) {
			jpaUtil = new JpaUtil();
		}
		return jpaUtil;
	}

	public EntityManager getEm() {
		if (em == null || !em.isOpen()) {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_aula");
			em = emf.createEntityManager();
		}
		return em;

	}

}
>>>>>>> e795a6125dd326b0e2b0c594c51b5b1e0baab156
