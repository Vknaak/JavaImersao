package br.com.knaak.mercado.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.knaak.mercado.Produto;
import br.com.knaak.mercado.servico.ProdutoService;

@Controller
public class ProdutoController {
	@Autowired
	private ProdutoService service;
	
	@GetMapping("/produto")
	public String produtos(Model model) {
		List<Produto> produtos = service.produtos();
		model.addAttribute("produtos",produtos);
		return "produto/produtos";
	}
	
	
}
