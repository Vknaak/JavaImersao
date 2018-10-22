package br.com.knaak.mercado.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import br.com.knaak.mercado.Produto;
import br.com.knaak.mercado.modelo.Mercado;

public class ProdutosApi {

	public List<Produto> consulta() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://lista-fornecedores.herokuapp.com/api/produtos";
		Produto[] produtos = restTemplate.getForObject(url, Produto[].class);
		return Arrays.asList(produtos);
	}

}
