package br.com.tt.app27.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tt.app27.model.Fornecedor;
import br.com.tt.app27.repository.FornecedorRepository;

@Controller
@RequestMapping("/fornecedor")
public class FornecedorController {

	@Autowired
	private FornecedorRepository repo;

	
	@GetMapping("/cadastro")
	public String cadastro(Model model) {
		model.addAttribute("fornecedor", new Fornecedor());

		return "fornecedor/cadastro";
	}
	@PostMapping("/salvar")
	public String salvar(Fornecedor fornecedor) {
		repo.save(fornecedor);
		
		return "redirect:/fornecedor";
	}

	@GetMapping
	public String fornecedores(Model model) {
		model.addAttribute("fornecedores", repo.findAll());

		return "fornecedor/fornecedores";
	}
	@GetMapping("/{id}")
	public String fornecedor(@PathVariable Long id, Model model) {
		model.addAttribute("fornecedor", repo.findById(id).orElse(null));
		return "fornecedor/detail";
	}
	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		Fornecedor fornecedor = repo.findById(id).orElse(null);
		repo.delete(fornecedor);
		return "redirect:/fornecedor";
	}
	@GetMapping("/{id}/editar")
	public String editar(@PathVariable Long id, Model model) {
		Fornecedor fornecedor = repo.findById(id).orElse(null);
		model.addAttribute("fornecedor",fornecedor);
		return "fornecedor/cadastro";
	}

}
