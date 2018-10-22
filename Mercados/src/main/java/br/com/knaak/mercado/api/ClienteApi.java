package br.com.knaak.mercado.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import br.com.knaak.mercado.Cliente;



public class ClienteApi {
	
	public List<Cliente> consulta() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://api-cliente.herokuapp.com/api/cliente";
		Cliente[] clientes = restTemplate.getForObject(url, Cliente[].class);
		return Arrays.asList(clientes);
	}

}
