package br.com.tt.app;

import java.time.LocalDate;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema...");
		
		Cliente c1 = new Cliente();
		c1.setNome("Maria");
		c1.setCpf("75973227049");
		c1.setDataNasc(LocalDate.now());
		
		System.out.println(c1);
	}

}
