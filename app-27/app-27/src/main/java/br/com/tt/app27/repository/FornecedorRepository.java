package br.com.tt.app27.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tt.app27.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

	List<Fornecedor> findByNomeLikeIgnoreCaseOrCnpjLikeIgnoreCase(String nome, String cnpj);
}
