package br.com.tt.app;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema..");
		
		Set<Cliente> clientes = new HashSet<>();
		clientes.add(new Cliente("Maria","123"));
		clientes.add(new Cliente("Maria","1243"));
		clientes.add(new Cliente("Luis","123"));
		clientes.add(new Cliente("Maria","123"));
		clientes.add(new Cliente("Marcia","123"));
		clientes.add(new Cliente("Maria","123"));
		
		clientes.forEach(clie ->System.out.println(clie));

	}

}
