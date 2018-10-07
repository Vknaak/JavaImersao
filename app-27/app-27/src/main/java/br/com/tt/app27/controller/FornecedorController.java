package br.com.tt.app27.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tt.app27.model.Fornecedor;
import br.com.tt.app27.service.FornecedorService;

@Controller
@RequestMapping("/fornecedor")
public class FornecedorController {

	@Autowired
	private FornecedorService service;

	@GetMapping("/cadastro")
	public String cadastro(Fornecedor fornecedor, Model model) {
		if (fornecedor == null) {
			fornecedor = new Fornecedor();

		}
		model.addAttribute("fornecedor", fornecedor);

		return "fornecedor/cadastro";
	}

	@PostMapping("/salvar")
	public String salvar(@Valid @ModelAttribute("fornecedor") Fornecedor fornecedor, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return cadastro(fornecedor, model);
		}
		service.salvar(fornecedor);

		return "redirect:/fornecedor";
	}

	@GetMapping
	public String fornecedores(Model model) {

		model.addAttribute("fornecedores", service.fornecedores());

		return "fornecedor/fornecedores";
	}

	@PostMapping("/pesquisar")
	public String pesquisar(String pesquisa, Model model) {
		model.addAttribute("fornecedores", service.consultar(pesquisa));
		return "fornecedor/fornecedores";
	}

	@GetMapping("/{id}")
	public String fornecedor(@PathVariable Long id, Model model) {
		model.addAttribute("fornecedor", service.fornecedor(id));
		return "fornecedor/detail";
	}

	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		service.deletar(id);
		return "redirect:/fornecedor";
	}

	@GetMapping("/{id}/editar")
	public String editar(@PathVariable Long id, Model model) {

		model.addAttribute("fornecedor", service.fornecedor(id));
		return "fornecedor/cadastro";
	}

}
