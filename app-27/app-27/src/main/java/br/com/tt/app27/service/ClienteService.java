package br.com.tt.app27.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tt.app27.model.Cliente;
import br.com.tt.app27.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public List<Cliente> cliente() {
		return repo.findAll();
	}

	public Cliente salvar(Cliente cliente) {
		return repo.save(cliente);
	}

	public Cliente cliente(Long id) {
		return repo.findById(id).orElse(null);
	}

	public void deletar(Long id) {
		repo.deleteById(id);
	}

	public List<Cliente> consultar(String busca) {
		busca = "%" + busca + "%";
		return repo.findByNomeLikeIgnoreCaseOrCnpjLikeIgnoreCase(busca, busca);
	}

}
