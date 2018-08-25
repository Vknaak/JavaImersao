package br.com.tt;

public class ArrayTeste {

	public static void main(String[] args) {
		String[] frutas = new String[10];
		frutas[0] = "Banana";
		frutas[1] = "Maça";
		frutas[2] = "laranja";
		frutas[5] = "Pera";
		frutas[9] = "Uva";
		
		if(frutas[3]==null) {
			frutas[3] = "Nova Fruta";
		}
		
		for (int i = 0; i < frutas.length; i++) {
			
			if(frutas[i] == null) {
				frutas[i] =  "Valor não definido "+i;
			}
			System.out.println(frutas[i]);
		}
	}

}
