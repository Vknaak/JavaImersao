package br.com.tt;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sistema {

	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema..");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_aula");
		EntityManager em = emf.createEntityManager();

		Telefone telefone = new Telefone();
		telefone.setDdd("51");
		telefone.setNumero("3358-9092");
		telefone.setTipo(TelefoneType.COMERCIAL);

		// Telefone telefone1 = new Telefone();
		// telefone1.setDdd("51");
		// telefone1.setNumero("99373-3584");
		// telefone1.setTipo(TelefoneType.CELULAR);

		// List<Telefone> telefones = new ArrayList<Telefone>();
		// telefones.add(telefone);
		// telefones.add(telefone1);

		Cliente cliente = new Cliente("Maria", "12456987452", "maria@hotmail.com");
		Endereco endereco = new Endereco("Av. Brasil", "Porto Alegre", estadoType.RS);
		cliente.setEndereco(endereco);
		cliente.setSexo(SexoType.F);
		cliente.addTelefone(new Telefone("99416-3584"));
		cliente.addTelefone(new Telefone("51","3373-3584", TelefoneType.RESIDENCIAL));
		cliente.addTelefone(new Telefone("51","99416-3584", TelefoneType.MENSAGEM));

		// cliente.setTelefones(telefones);
		// telefone.setCliente(cliente);
		// telefone1.setCliente(cliente);

		em.getTransaction().begin();
		em.persist(endereco);
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();
		System.exit(0);

		System.out.println("Finalizando o Sistema..");

	}

}
