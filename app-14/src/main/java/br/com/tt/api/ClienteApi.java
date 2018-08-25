package br.com.tt.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tt.model.Cliente;
import br.com.tt.service.ClienteService;

@RestController
public class ClienteApi {
	@Autowired
	private ClienteService service;
	
	@PostMapping("/clientes")
	public void add(@RequestBody Cliente cliente) {
		service.Salvar(cliente);

	}
	@GetMapping("/clientes")
	public List<Cliente> clientes() {

		return service.clientes();
	}

}
