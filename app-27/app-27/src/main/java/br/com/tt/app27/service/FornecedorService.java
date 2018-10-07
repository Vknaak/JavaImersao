package br.com.tt.app27.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tt.app27.model.Fornecedor;
import br.com.tt.app27.repository.FornecedorRepository;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository repo;

	public List<Fornecedor> fornecedores() {
		return repo.findAll();
	}

	public Fornecedor salvar(Fornecedor fornecedor) {
		return repo.save(fornecedor);
	}

	public Fornecedor fornecedor(Long id) {
		return repo.findById(id).orElse(null);
	}

	public void deletar(Long id) {
		repo.deleteById(id);
	}

	public List<Fornecedor> consultar(String busca) {
		busca = "%" + busca + "%";
		return repo.findByNomeLikeIgnoreCaseOrCnpjLikeIgnoreCase(busca, busca);
	}

}
