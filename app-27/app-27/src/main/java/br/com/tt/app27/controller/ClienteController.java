package br.com.tt.app27.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tt.app27.model.Cliente;
import br.com.tt.app27.repository.ClienteRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository repo;

	@GetMapping("/cadastro")
	public String cadastro(Model model) {
		model.addAttribute("cliente", new Cliente());

		return "cliente/cadastro";
	}
	@PostMapping("/salvar")
	public String salvar(Cliente cliente) {
		
		repo.save(cliente);
		return "redirect:/cliente";
	}

	@GetMapping
	public String listar(Model model) {
		model.addAttribute("cliente", repo.findAll());
		return "cliente/clientes";
	}
	@GetMapping("/{id}")
	public String cliente(@PathVariable Long id, Model model) {
		model.addAttribute("cliente", repo.findById(id).orElse(null));
		return "cliente/detail";
	}
	
	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		Cliente cliente = repo.findById(id).orElse(null);
		repo.delete(cliente);
		return "redirect:/cliente";
	}
	@GetMapping("/{id}/editar")
	public String editar(@PathVariable Long id, Model model) {
		Cliente cliente = repo.findById(id).orElse(null);
		model.addAttribute("cliente",cliente);
		return "cliente/cadastro";
	}

}
