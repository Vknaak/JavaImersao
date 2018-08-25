package br.com.tt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.tt.model.Cliente;
import br.com.tt.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;

	public void Salvar(Cliente cliente) {

		repo.save(cliente);
	}

	public List<Cliente> clientes() {
		
		return repo.findAll();

	}

}
