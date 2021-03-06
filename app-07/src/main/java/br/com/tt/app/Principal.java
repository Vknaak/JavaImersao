<<<<<<< HEAD
<<<<<<< HEAD
package br.com.tt.app;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema....");
		List<Cliente> clientes = new ArrayList<>();

		clientes.add(new Cliente("Maria", "75973227049"));
		clientes.add(new Cliente("Paulo", "7597652452"));
		clientes.add(new Cliente("Joao", "7554788441"));

		// java 8
		System.out.println("Usando java 8\n");
		clientes.forEach(System.out::println);
		System.out.println();

		System.out.println("Usando java 7 LAMBDA\n");
		clientes.forEach(cli -> System.out.println(cli));
		System.out.println();

		System.out.println("Usando java 5\n");
		for (Cliente cli : clientes) {
			System.out.println(cli);
		}
		System.out.println();

		System.out.println("Usando o tradicional\n");
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i));

		}
		System.out.println();

	}

}
=======
package br.com.tt.app;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema....");
		List<Cliente> clientes = new ArrayList<>();

		clientes.add(new Cliente("Maria", "75973227049"));
		clientes.add(new Cliente("Paulo", "7597652452"));
		clientes.add(new Cliente("Joao", "7554788441"));

		// java 8
		System.out.println("Usando java 8\n");
		clientes.forEach(System.out::println);
		System.out.println();

		System.out.println("Usando java 7 LAMBDA\n");
		clientes.forEach(cli -> System.out.println(cli));
		System.out.println();

		System.out.println("Usando java 5\n");
		for (Cliente cli : clientes) {
			System.out.println(cli);
		}
		System.out.println();

		System.out.println("Usando o tradicional\n");
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i));

		}
		System.out.println();

	}

}
>>>>>>> 911bf648e82712d62a51cae0478c854b92e3784f
=======
package br.com.tt.app;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema....");
		List<Cliente> clientes = new ArrayList<>();

		clientes.add(new Cliente("Maria", "75973227049"));
		clientes.add(new Cliente("Paulo", "7597652452"));
		clientes.add(new Cliente("Joao", "7554788441"));

		// java 8
		System.out.println("Usando java 8\n");
		clientes.forEach(System.out::println);
		System.out.println();

		System.out.println("Usando java 7 LAMBDA\n");
		clientes.forEach(cli -> System.out.println(cli));
		System.out.println();

		System.out.println("Usando java 5\n");
		for (Cliente cli : clientes) {
			System.out.println(cli);
		}
		System.out.println();

		System.out.println("Usando o tradicional\n");
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i));

		}
		System.out.println();

	}

}
>>>>>>> 911bf648e82712d62a51cae0478c854b92e3784f
