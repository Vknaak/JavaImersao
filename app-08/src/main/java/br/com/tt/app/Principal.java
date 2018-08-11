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
			System.out.println("S�o iguais");
		}else {
			System.out.println("S�o diferentes");
		}
	}

}
