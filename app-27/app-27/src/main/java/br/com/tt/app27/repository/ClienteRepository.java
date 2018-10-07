package br.com.tt.app27.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tt.app27.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	List<Cliente> findByNomeLikeIgnoreCaseOrCnpjLikeIgnoreCase(String nome, String cnpj);
}
