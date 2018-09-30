package br.com.tt.app27.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tt.app27.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
