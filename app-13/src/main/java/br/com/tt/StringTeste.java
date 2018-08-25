package br.com.tt;

public class StringTeste {

	public static void main(String[] args) {
		String str = "Realizando teste de string..";
		String str1 = "Realizando teste de string 1..   ";
		String str2 = "Realizando teste de string 2..";
		str = str.toUpperCase();
		System.out.println(str);
		System.out.println(str1.toLowerCase());
		System.out.println(str2.substring(8));// pegar string do final para inicio
		System.out.println(str2.substring(0, 8));// pegar parte da string de um indice a outro
		System.out.println(str.replaceAll("E", "3"));
		System.out.println(str1.charAt(2));// selecionar um index na string
		System.out.println(str1.trim());// remove espaços
		
		System.out.println("\n----------START WITH--END WITH----------");
		System.out.println(str.startsWith("REALI"));
		System.out.println(str.endsWith("ING.."));
		
		System.out.println("\n------COMPRIMENTO DA STRING------------");		
		System.out.println(str.length());
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("\n------FOR EM UMA LINHA------------");
		for (int i = 0; i < str.length(); System.out.println(str.charAt(i++))){
			
		}
		
		
		
		System.out.println("\n----------DATAS------------");
		str = "25/08/2018";
		String[] data = str.split("/");
		System.out.println("Dia " + data[0]);
		System.out.println("Mês " + data[1]);
		System.out.println("Ano " + data[2]);

		String dataStr = data[2].concat("-").concat(data[1]).concat("-").concat(data[0]);
		System.out.println(dataStr);
		System.out.printf("%s-%s-%s", data[2], data[1], data[0]);

		System.out.println("\n--------TESTANDO EQUALS--------------");
		System.out.println("true".equals("TRUE"));// FALSO
		System.out.println("true".equalsIgnoreCase("TRUE"));// VERDADEIRO

	}

}
