<<<<<<< HEAD
package br.com.tt.app;

import br.com.tt.app.model.Cliente;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema...");
		
		Cliente cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = cliente;
		
		cliente.setNome("Maria");
		cliente1.setNome("Maria");
		
		System.out.println(cliente == cliente2);
		System.out.println(cliente1 == cliente2);
		
		if(cliente.equals(cliente1)) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
	}

}
=======
package br.com.tt.app;

import br.com.tt.app.model.Cliente;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema...");
		
		Cliente cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = cliente;
		
		cliente.setNome("Maria");
		cliente1.setNome("Maria");
		
		System.out.println(cliente == cliente2);
		System.out.println(cliente1 == cliente2);
		
		if(cliente.equals(cliente1)) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
	}

}
>>>>>>> 911bf648e82712d62a51cae0478c854b92e3784f
