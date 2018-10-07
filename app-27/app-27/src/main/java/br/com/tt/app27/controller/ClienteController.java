package br.com.tt.app27.controller;

import java.util.List;

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

import br.com.tt.app27.model.Cliente;
import br.com.tt.app27.model.Fornecedor;
import br.com.tt.app27.repository.ClienteRepository;
import br.com.tt.app27.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping("/cadastro")
	public String cadastro(Cliente cliente, Model model) {
		if (cliente == null) {
			cliente = new Cliente();

		}
		model.addAttribute("cliente", cliente);

		return "cliente/cadastro";
	}

	@PostMapping("/salvar")
	public String salvar(@Valid @ModelAttribute("cliente") Cliente cliente, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return cadastro(cliente, model);
		}
		service.salvar(cliente);
		return "redirect:/cliente";
	}

	@GetMapping
	public String listar(Model model) {
		model.addAttribute("clientes", service.cliente());
		return "cliente/clientes";
	}

	@PostMapping("/pesquisar")
	public String pesquisar(String pesquisa, Model model) {
		model.addAttribute("clientes", service.consultar(pesquisa));
		return "cliente/clientes";
	}

	@GetMapping("/{id}")
	public String cliente(@PathVariable Long id, Model model) {
		model.addAttribute("cliente", service.cliente(id));
		return "cliente/detail";
	}

	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		service.deletar(id);
		return "redirect:/cliente";
	}

	@GetMapping("/{id}/editar")
	public String editar(@PathVariable Long id, Model model) {
		model.addAttribute("cliente", service.cliente(id));
		return "cliente/cadastro";
	}

}
