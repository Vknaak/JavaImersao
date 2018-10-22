package br.com.knaak.mercado.api;

import org.springframework.web.client.RestTemplate;

import br.com.knaak.mercado.Endereco;

public class CepApiCliente {
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		Endereco endereco = restTemplate.getForObject("https://viacep.com.br/ws/01001000/json/", Endereco.class);
		System.out.println(endereco);
	}

}
