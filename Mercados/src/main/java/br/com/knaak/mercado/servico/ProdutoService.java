package br.com.knaak.mercado.servico;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.knaak.mercado.Produto;
import br.com.knaak.mercado.api.ProdutosApi;
import br.com.knaak.mercado.modelo.Mercado;

@Service
public class ProdutoService {

	public List<Produto> produtos() {

		return new ProdutosApi().consulta();

	}

}
