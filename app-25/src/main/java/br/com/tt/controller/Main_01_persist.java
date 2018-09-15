package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Cliente;
import br.com.tt.model.Telefone;
import br.com.tt.model.TelefoneType;

public class Main_01_persist {

	static EntityManager em = Persistence.createEntityManagerFactory("jpa_aula").createEntityManager();

	public static void main(String[] args) {
		System.out.println("Iniciando ao Sistema....");

		Cliente cliente = new Cliente();
		cliente.setNome("Vilson Knaak");
		cliente.setCpf("75973227049");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("antonio");
		cliente1.setCpf("75944447049");
		
		

		// ArrayList<Telefone> telefones = new ArrayList<Telefone>();
		// cliente.setTelefone(telefones);
		// Telefone telefone1 = new Telefone();
		// telefones.add(telefone1);

		Telefone telefone1 = new Telefone();
		telefone1.setCliente(cliente);
		telefone1.setDdd("051");
		telefone1.setNumero("325647895");
		telefone1.setTipo(TelefoneType.COMERCIAL);
		
		Telefone telefone2 = new Telefone();
		telefone2.setCliente(cliente1);
		telefone2.setDdd("051");
		telefone2.setNumero("99373354");
		telefone2.setTipo(TelefoneType.CELULAR);

		cliente.addTelefone(telefone1);
		cliente1.addTelefone(telefone2);
		
		salvar(cliente);
		salvar(cliente1);
	
			
		
	

	}

	private static void salvar(Object object) {

		try {
			em.getTransaction().begin();
			em.persist(object);
			em.getTransaction().commit();

		} catch (Exception e) {
			em.getTransaction().rollback();

		} finally {
			em.clear();
			
		}

	}

}
