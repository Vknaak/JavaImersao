<<<<<<< HEAD
package br.com.tt.app;

import java.util.ArrayList;
import java.util.List;

import br.com.tt.app.model.Cliente;
import br.com.tt.app.model.Endereco;
import br.com.tt.app.model.Telefones;
import br.com.tt.app.type.TelefoneType;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema...");
		
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente("Marcia","1234456779"));
		
		Cliente cliente = new Cliente();
		clientes.add(cliente);
		cliente.setNome("Paulo");
		cliente.setCpf("1236546685");
		Endereco endereco =new Endereco();
		cliente.setEndereco(endereco);
		endereco.setRua("Av Nilo");
		endereco.setCidade("Porto Alegre");
		
		Telefones telefone = new Telefones(); //alt + shit L criar novo objeto
		cliente.addTelefone(telefone);
		telefone.setTipo(TelefoneType.CELULAR);
		telefone.setNumero("993733584");
		
		cliente.addTelefone(new Telefones("51","33585255",TelefoneType.RESIDENCIAL));
		
		
		System.out.println(clientes);

	}

}
=======
package br.com.tt.app;

import java.util.ArrayList;
import java.util.List;

import br.com.tt.app.model.Cliente;
import br.com.tt.app.model.Endereco;
import br.com.tt.app.model.Telefones;
import br.com.tt.app.type.TelefoneType;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema...");
		
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente("Marcia","1234456779"));
		
		Cliente cliente = new Cliente();
		clientes.add(cliente);
		cliente.setNome("Paulo");
		cliente.setCpf("1236546685");
		Endereco endereco =new Endereco();
		cliente.setEndereco(endereco);
		endereco.setRua("Av Nilo");
		endereco.setCidade("Porto Alegre");
		
		Telefones telefone = new Telefones(); //alt + shit L criar novo objeto
		cliente.addTelefone(telefone);
		telefone.setTipo(TelefoneType.CELULAR);
		telefone.setNumero("993733584");
		
		cliente.addTelefone(new Telefones("51","33585255",TelefoneType.RESIDENCIAL));
		
		
		System.out.println(clientes);

	}

}
>>>>>>> 911bf648e82712d62a51cae0478c854b92e3784f
