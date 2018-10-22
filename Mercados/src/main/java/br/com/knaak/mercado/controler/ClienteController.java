package br.com.knaak.mercado.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.knaak.mercado.Cliente;
import br.com.knaak.mercado.servico.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping("/cliente")
	public String clientes(Model model) {
		List<Cliente> clientes = service.clientes();
		model.addAttribute("clientes", clientes);
		return "cliente/clientes";
	}

}
