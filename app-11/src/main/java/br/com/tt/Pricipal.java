<<<<<<< HEAD
package br.com.tt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pricipal {
	public static void main(String[] args) {
		System.out.println("Iniciando o sistema");
		// Pessoa pessoa = new Pessoa();
		// Pessoa pessoa1 = new Pessoa(1L,"'Maria");

		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setId(2L);
		pessoaFisica.setNome("Vilson");
		pessoaFisica.setCpf("75973227049");
		pessoaFisica.setDataNasc(null);

		System.out.println(pessoaFisica);

		pessoaJuridica pessoaJuridica = new pessoaJuridica(3L, "Target", "12321654000146");
		pessoaJuridica pessoaJuridica2 = new pessoaJuridica();
		pessoaJuridica2.setNome("LL System");
		pessoaJuridica2.setCnpj("75326654000197");

		List<Pessoa> pessoas = new ArrayList<>();
		// pessoas.add(pessoa);
		// pessoas.add(pessoa1);
		pessoas.add(pessoaFisica);
		pessoas.add(pessoaJuridica);
		pessoas.add(pessoaJuridica2);

		for (Pessoa p : pessoas) {
			System.out.println(p.getNome());

			if (p instanceof PessoaFisica) {
				PessoaFisica pf = (PessoaFisica) p;
				System.out.println("Data: " + pf.getDataNasc());
			} else if (p instanceof pessoaJuridica) {
				pessoaJuridica pj = (pessoaJuridica) p;
				System.out.println("Data: " + pj.getDataFund());
			}
		}

		System.out.println("--Documentos Financeiros");

		for (Pessoa pessoa2 : pessoas) {
			System.out.println("Nome: " + pessoa2.getNome());
			System.out.println("Doc Financeiro: " + pessoa2.getDocFinanc());

		}

	}

}
=======
package br.com.tt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pricipal {
	public static void main(String[] args) {
		System.out.println("Iniciando o sistema");
		// Pessoa pessoa = new Pessoa();
		// Pessoa pessoa1 = new Pessoa(1L,"'Maria");

		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setId(2L);
		pessoaFisica.setNome("Vilson");
		pessoaFisica.setCpf("75973227049");
		pessoaFisica.setDataNasc(null);

		System.out.println(pessoaFisica);

		pessoaJuridica pessoaJuridica = new pessoaJuridica(3L, "Target", "12321654000146");
		pessoaJuridica pessoaJuridica2 = new pessoaJuridica();
		pessoaJuridica2.setNome("LL System");
		pessoaJuridica2.setCnpj("75326654000197");

		List<Pessoa> pessoas = new ArrayList<>();
		// pessoas.add(pessoa);
		// pessoas.add(pessoa1);
		pessoas.add(pessoaFisica);
		pessoas.add(pessoaJuridica);
		pessoas.add(pessoaJuridica2);

		for (Pessoa p : pessoas) {
			System.out.println(p.getNome());

			if (p instanceof PessoaFisica) {
				PessoaFisica pf = (PessoaFisica) p;
				System.out.println("Data: " + pf.getDataNasc());
			} else if (p instanceof pessoaJuridica) {
				pessoaJuridica pj = (pessoaJuridica) p;
				System.out.println("Data: " + pj.getDataFund());
			}
		}

		System.out.println("--Documentos Financeiros");

		for (Pessoa pessoa2 : pessoas) {
			System.out.println("Nome: " + pessoa2.getNome());
			System.out.println("Doc Financeiro: " + pessoa2.getDocFinanc());

		}

	}

}
>>>>>>> bcdf0a8df3c24286f7e9e678ab3165c6b41764d3
